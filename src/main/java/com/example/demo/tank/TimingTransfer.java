package com.example.demo.tank;

import com.example.demo.bean.*;
import com.example.demo.mapper.first.*;
import com.example.demo.mapper.second.VExamMapper;
import com.example.demo.service.*;
import com.example.demo.util.DateUtil;
import com.example.demo.util.DicomPDFToPdfTool;
import com.example.demo.util.HttpRequestUtil;
import com.example.demo.util.WriteBackReportUtil;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.zip.CRC32;

/**
 * @author Administrator
 */
@Configuration
@EnableScheduling
public class TimingTransfer {
    @Autowired
    FsyStudyApplyService fsyStudyApplyService;
    @Autowired
    JiXiaoStatisticsMapper statisticsMapper;
    @Autowired
    DevicesStatisticsMapper devicesStatisticsMapper;
    @Autowired
    HisSynRecMapper hisSynRecMapper;
    @Autowired
    VExamMapper secondMapper;
    @Autowired
    VSubExamMapper vSubExamMapper;
    @Autowired
    PACSExamMapper checkExamMapper;
    @Autowired
    VSubExamItemMapper vSubExamItemMapper;
    // @Scheduled(cron = "*/30 * * * * ?")
    //   public void sheBeiTongJi() {
   /*
        String time = "2023-03-16";
        System.out.println("time:" + time);
        List<DevicesStatisticsBean> devicesStatisticsEntityList = devicesStatisticsMapper.getReportDtDateFS(time + " 00:00:00", time + " 23:59:59");
        for (DevicesStatisticsBean devicesStatisticsEntity : devicesStatisticsEntityList) {
            devicesStatisticsEntity.setTime(time);
            devicesStatisticsEntity.setSummaryClass("reportDt");
            devicesStatisticsMapper.insertOne(devicesStatisticsEntity);
        }
        List<DevicesStatisticsBean> reportDtDateUS = devicesStatisticsMapper.getReportDtDateUS(time + " 00:00:00", time + " 23:59:59");

        for (DevicesStatisticsBean statisticsEntity : reportDtDateUS) {
            statisticsEntity.setTime(time);
            statisticsEntity.setSummaryClass("report");
            devicesStatisticsMapper.insertOne(statisticsEntity);
        }
*/
    // }


    /**
     * 美和绩效统计 每天凌晨12点统计一次
     */
    @Scheduled(cron = "0 0 23 ? * ? ")
    public void jixiaotongjiUS() {
        try {

//            List<String> applyIdBySex = hisSynRecMapper.getApplyIdBySex();
//            for (String idBySex : applyIdBySex) {
//                System.out.println("idBySex:" + idBySex);
//                hisSynRecMapper.updateByApplyId(idBySex);
//            }

            System.out.println("绩效统计");
            String[] examSource = {"体检", "门诊", "住院"};
            String[] examClass = {"CT", "MR", "X-RAY", "MG", "SR"};
            List<UserBean> chaoShengKe = statisticsMapper.getDeptUsers("MHYJ003");
            String time = DateUtil.lastMonthDate();
            //遍历用户获取当天审核时间下的初步报告数量（超声科是自采自出，所以初步报告医生也是检查医生）
            for (UserBean userBean : chaoShengKe) {
                JiXiaoBean jiXiaoBean = new JiXiaoBean();
                jiXiaoBean.setReportDt(time);
                jiXiaoBean.setDeptName("超声科");
                jiXiaoBean.setExamClass("US");
                jiXiaoBean.setDeptNo("HY000054");
                jiXiaoBean.setCheckDoctorNo(userBean.getUserId());
                jiXiaoBean.setCheckDoctorName(userBean.getUserName());
                List<JiXiaoBean> preliminaryReportUS = statisticsMapper.getPreliminaryReportUS(time + "-01 00:00:00", time + "-31 23:59:59", userBean.getUserId());
                for (JiXiaoBean reportUS : preliminaryReportUS) {
                    jiXiaoBean.setExamSource(reportUS.getExamSource());
                    jiXiaoBean.setExamClass(reportUS.getExamClass());
                    jiXiaoBean.setCheckNumber(reportUS.getCheckNumber());
                    jiXiaoBean.setReportNumber(reportUS.getReportNumber());
                    jiXiaoBean.setCheckPeopleNumber(reportUS.getCheckPeopleNumber());
                    //插入到表里
                    JiXiaoBean statisticsOne = statisticsMapper.selectJiXiaoStatisticsOne(jiXiaoBean);
                    if (statisticsOne == null) {
                        statisticsMapper.inertJiXiaoStatistics(jiXiaoBean);
                    } else {
                        statisticsMapper.updateJiXiaoStaticsByOne(jiXiaoBean);
                    }
                }
                //遍历用户获取当天审核时间下的审核报告数量
                for (String s : examSource) {
                    JiXiaoBean verifiReportUS = statisticsMapper.getVerifierReportUS(time + "-01 00:00:00", time + "-31 23:59:59", userBean.getUserId(), s);
                    if (verifiReportUS != null) {
                        jiXiaoBean.setExamineNumber(verifiReportUS.getExamineNumber());
                        jiXiaoBean.setExamSource(s);
                        //插入到表里
                        JiXiaoBean statisticsOne = statisticsMapper.selectJiXiaoStatisticsOne(jiXiaoBean);
                        if (statisticsOne == null) {
                            statisticsMapper.inertJiXiaoStatistics(jiXiaoBean);
                        } else {
                            statisticsOne.setExamineNumber(verifiReportUS.getExamineNumber());
                            statisticsMapper.updateJiXiaoStaticsByOne(statisticsOne);
                        }
                    }
                }
            }

            List<UserBean> fangSheKe = statisticsMapper.getDeptUsers("MHYJ001");
            //放射科（检查人为技师）
            for (String aClass : examClass) {
                List<JiXiaoBean> jiXiaoBeans = statisticsMapper.selectJSStatistics(time + "-01 00:00:00", time + "-31 23:59:59", aClass);
                for (JiXiaoBean jiXiaoBean : jiXiaoBeans) {
                    jiXiaoBean.setDeptName("影像科");
                    jiXiaoBean.setDeptNo("HY000052");
                    jiXiaoBean.setCheckDoctorName("技师");
                    jiXiaoBean.setCheckDoctorNo("技师");
                    jiXiaoBean.setReportDt(time);
                    //插入到表里
                    JiXiaoBean statisticsOne = statisticsMapper.selectJiXiaoStatisticsOne(jiXiaoBean);
                    if (statisticsOne == null) {
                        statisticsMapper.inertJiXiaoStatistics(jiXiaoBean);
                    } else {
                        statisticsOne.setCheckPeopleNumber(jiXiaoBean.getCheckPeopleNumber());
                        statisticsOne.setCheckNumber(jiXiaoBean.getCheckNumber());
                        statisticsMapper.updateJiXiaoStaticsByOne(statisticsOne);
                    }
                }
            }
            //遍历放射科医生用户
            for (UserBean userBean : fangSheKe) {
                JiXiaoBean jiXiaoBean = new JiXiaoBean();
                jiXiaoBean.setReportDt(time);
                jiXiaoBean.setDeptNo("HY000052");
                jiXiaoBean.setDeptName("影像科");
                jiXiaoBean.setCheckDoctorNo(userBean.getUserId());
                jiXiaoBean.setCheckDoctorName(userBean.getUserName());
                jiXiaoBean.setReportDt(time);
                List<JiXiaoBean> preliminaryReportFS = statisticsMapper.getPreliminaryReportFS(time + "-01 00:00:00", time + "-31 23:59:59", userBean.getUserId());
                for (JiXiaoBean preliminaryReportF : preliminaryReportFS) {
                    jiXiaoBean.setReportNumber(preliminaryReportF.getReportNumber());
                    jiXiaoBean.setExamClass(preliminaryReportF.getExamClass());
                    jiXiaoBean.setExamSource(preliminaryReportF.getExamSource());
                    //插入到表里
                    JiXiaoBean statisticsOne = statisticsMapper.selectJiXiaoStatisticsOne(jiXiaoBean);
                    if (statisticsOne == null) {
                        statisticsMapper.inertJiXiaoStatistics(jiXiaoBean);
                    } else {
                        statisticsMapper.updateJiXiaoStaticsByOne(jiXiaoBean);
                    }
                }
                //遍历用户获取当天审核时间下的审核报告数量
                List<JiXiaoBean> justVerifierReportFS = statisticsMapper.getJustVerifierReportFS(time + "-01 00:00:00", time + "-31 23:59:59", userBean.getUserId());
                for (JiXiaoBean justVerifierReportF : justVerifierReportFS) {
                    justVerifierReportF.setReportDt(time);
                    justVerifierReportF.setDeptNo("HY000052");
                    justVerifierReportF.setDeptName("影像科");
                    justVerifierReportF.setCheckDoctorNo(userBean.getUserId());
                    //插入到表里
                    JiXiaoBean statisticsOne = statisticsMapper.selectJiXiaoStatisticsOne(justVerifierReportF);
                    if (statisticsOne == null) {
                        statisticsMapper.inertJiXiaoStatistics(justVerifierReportF);
                    } else {
                        statisticsOne.setExamineNumber(justVerifierReportF.getExamineNumber());
                        statisticsMapper.updateJiXiaoStaticsByOne(statisticsOne);
                    }
                }

            }

     /*       for (int i = 1; i < 32; i++) {
                //String time = "2022-10";
                if (i < 10) {
                    time = time + "-0" + i;
                } else {
                    time = time + "-" + i;
                }
                System.out.println("time:" + time);
                List<DevicesStatisticsBean> devicesStatisticsEntityList = devicesStatisticsMapper.getReportDtDateFS(time + " 00:00:00", time + " 23:59:59");
                for (DevicesStatisticsBean devicesStatisticsEntity : devicesStatisticsEntityList) {
                    devicesStatisticsEntity.setTime(time);
                    devicesStatisticsEntity.setSummaryClass("reportDt");
                    devicesStatisticsMapper.insertOne(devicesStatisticsEntity);
                }
                List<DevicesStatisticsBean> reportDtDateUS = devicesStatisticsMapper.getReportDtDateUS(time + " 00:00:00", time + " 23:59:59");

                for (DevicesStatisticsBean statisticsEntity : reportDtDateUS) {
                    statisticsEntity.setTime(time);
                    statisticsEntity.setSummaryClass("report");
                    devicesStatisticsMapper.insertOne(statisticsEntity);
                }
            }*/


        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }


    /**
     * 文件重传
     */

    //   @Scheduled(cron = "0 0/7 * * * ?")
    @Scheduled(cron = "*/5 * * * * ?")
    public void fileRetransmission() {
        //查询未进行判断且上传时间距至今一段时间的数据
        List<RecLoadBean> recLoadFlagIsZero = fsyStudyApplyService.getRecLoadFlagIsZero();
        for (RecLoadBean recLoadBean : recLoadFlagIsZero) {
            if (!"US".equals(recLoadBean.getExamEclass())) {

                File path = new File(recLoadBean.getFilePath());
                if (path.exists() && path != null) {
                    //            System.out.println("recLoadBean:" + recLoadBean.toString());
                    //         System.out.println("recLoadBean.getMsg().length()<250:" + recLoadBean.getMsg().length());
                    //获取图像目录文件夹下，主要是获取当中的文件数量
                    File[] files = path.listFiles();
                    if (files != null && recLoadBean.getMsg().length() < 250) {
                        //       System.out.println("files.length:" + files.length);
                        //此getxxx是从云数据库获取服务端存储的图像目录文件夹下的文件数量
                        int cloudLength = HttpRequestUtil.interfaceUtil2("http://119.23.70.43:28180/fcgi/getApplyFiles.php?wrId=" + recLoadBean.getWrId() + "&wrClinicKey=KhbbKPom6xdTq57p&applyId=" + recLoadBean.getPatNo());

                        //     System.out.println("CloudLength:" + cloudLength);
                        if (files.length <= cloudLength) {
                            //可能存在之前上传成功，后面本地删除部分图像，所以也不用重传
                            fsyStudyApplyService.updateFlag(recLoadBean.getExamId(), recLoadBean.getMsg() + "->云文件（" + cloudLength + "）<->本地文件（" + files.length + ")(齐全)", recLoadBean.getCount());
                        } else {
                            recLoadBean.setCount(recLoadBean.getCount() + 1);
                            fsyStudyApplyService.updateFlag(recLoadBean.getExamId(), recLoadBean.getMsg() + "->云文件（" + cloudLength + "）<->本地文件（" + files.length + ")(不齐全)", recLoadBean.getCount());
                            System.out.println(fsyStudyApplyService.reUpload(recLoadBean.getExamId()));

                        }
                    }
                }
            }
        }
    }


    /***
     *
     * 放射科存在一个号在设备分多个号检查，所以存在多个文件夹，但接口已做合并处理，此接口为获取需合并的文件数据进行合并
     * 该方法计划每30秒运行一次，并删除某些文件。它使用fsystudyapplyservice . selectneedremovefile()方法选择要删除的文件，并遍历这些文件。
     * 如果旧文件的url不为空，并且是CT、MR、DX或MG格式，它会将旧文件移动到新文件地址(如listFileRemove中所提供的)，并使用新文件的url更新数据库。
     * 如果旧文件无法重命名，它会用值0更新数据库。*
     * */
    @Scheduled(cron = "*/30 * * * * ?")
    public void autoFileRemove() {
        List<FileRemoveBean> listFileRemoves = fsyStudyApplyService.selectNeedRemoveFile();
        if (listFileRemoves.size() != 0) {
            //       System.out.println("合并：" + listFileRemoves.get(0).toString());
            for (FileRemoveBean listFileRemove : listFileRemoves) {
                if (StringUtils.isNotBlank(listFileRemove.getOldFileUrl()) && StringUtils.isNotBlank(listFileRemove.getOldFileUrl()) || "CT".contains(listFileRemove.getOldFileUrl()) || "MR".contains(listFileRemove.getOldFileUrl()) || "DX".contains(listFileRemove.getOldFileUrl()) || "MG".contains(listFileRemove.getOldFileUrl())) {
                    File oldFileDown = new File(listFileRemove.getOldFileUrl());
                    String newFileDown = listFileRemove.getNewFileUrl();

                    if (oldFileDown.renameTo(new File(newFileDown))) {

                        fsyStudyApplyService.updateOneFileRemove(listFileRemove.getExamId(), listFileRemove.getNewFileUrl(), "1");

                    } else {

                        fsyStudyApplyService.updateOneFileRemove(listFileRemove.getExamId(), listFileRemove.getNewFileUrl(), "0");

                    }
                }
            }
        }
    }

    @Scheduled(cron = "0 0/1 * * * ?")
    public void dicomPdfToPdf() {
        List<FileConvertedPdfBean> fileConvertedPdfEntities = fsyStudyApplyService.selectFileConvertedPdfEntityList();
        if (fileConvertedPdfEntities.size() != 0) {//存在需转换记录
            System.out.println("存在需转换记录");
            try {
                String s = "";//项目ID
                FileConvertedPdfBean fileConvertedPdfEntity = fileConvertedPdfEntities.get(0);
                s = fsyStudyApplyService.getSubApplyId(fileConvertedPdfEntity.getApplyId()).get(0).replace("||", "_");//获取项目ID ,因需生成文件路径，不能包含|| 所以这里转换了一下

                if (!"".equals(s)) {//判断存在子项目ID所以才继续执行
                    boolean execCommand = false;//如果文件路径有问题，就不生成新的文档
                    int i = 0;//
                    ExamSynReportsBean examSynReportsBean = new ExamSynReportsBean();
                    PDFMergerUtility pdfMergerUtility = new PDFMergerUtility();//合并PDF类
                    //生成PDF文档路径
                    pdfMergerUtility.setDestinationFileName("D:\\fangsheyun\\apache-tomcat-9.0.64\\webapps\\ROOT\\pdf\\" + s + ".pdf");
                    String[] fileUrls = fileConvertedPdfEntity.getFileUrl().split(",");// 多个文件用 ',' 分割
                    List list = new ArrayList();//排除重复相同路径
                    //遍历数组往集合里存元素
                    for (int bl1 = 0; bl1 < fileUrls.length; bl1++) {
                        //如果集合里面没有相同的元素才往里存
                        if (!list.contains(fileUrls[bl1])) {
                            list.add(fileUrls[bl1]);
                        }
                    }

                    //toArray()方法会返回一个包含集合所有元素的Object类型数组
                    Object[] newArr = list.toArray();
                    fileUrls = Arrays.copyOf(newArr, newArr.length, String[].class);
                    String itemName = fsyStudyApplyService.getItemNameBySubApplyId(s.replace("_", "||"));
                    if (itemName.contains("骨密度") && fileUrls.length >= 1) {
                        System.out.println("骨密度");
                        List<String> justOneList = new ArrayList<String>();
                        String fileName = fileUrls[fileUrls.length - 1];
                        justOneList.add(fileName);
                        fileUrls = Arrays.copyOf(justOneList.toArray(), justOneList.toArray().length, String[].class);
                    } else if (itemName.contains("身体成分分析") && fileUrls.length >= 2) {
                        System.out.println("身体成分分析");
                        List<String> getTwoList = new ArrayList<String>();
                        String fileName1 = fileUrls[fileUrls.length - 2];
                        String fileName2 = fileUrls[fileUrls.length - 1];
                        getTwoList.add(fileName1);
                        getTwoList.add(fileName2);
                        fileUrls = Arrays.copyOf(getTwoList.toArray(), getTwoList.toArray().length, String[].class);
                    }
                    System.out.println("需要转换的文件数量:" + fileUrls.length);
                    for (String fileUrl : fileUrls) {
                        i++;//避免生成的文件名重复，造成覆盖问题
                        File file = new File(fileUrl);
                        System.out.println("文件名：" + fileUrl);
                        if (file.exists() && fsyStudyApplyService.getSubApplyId(fileConvertedPdfEntity.getApplyId()).size() != 0) {
                            execCommand = DicomPDFToPdfTool.execCommand("D:\\fangsheyun\\bin\\dcm2pdf.exe", fileUrl + "   " + "D:\\fangsheyun\\apache-tomcat-9.0.64\\webapps\\ROOT\\pdf\\" + fileConvertedPdfEntity.getApplyId() + i + ".pdf");
                            System.out.println("是否生成PDF：" + execCommand);
                            if (execCommand) {
                                file = new File("D:\\fangsheyun\\apache-tomcat-9.0.64\\webapps\\ROOT\\pdf\\" + fileConvertedPdfEntity.getApplyId() + i + ".pdf");
                                pdfMergerUtility.addSource(file);//添加至合并PDF中
                            }
                        }
                    }
                    if (execCommand) {

                        //Merging the two documents
                        pdfMergerUtility.mergeDocuments();//生成合并的PDF
                        fileConvertedPdfEntity.setPdfUrl("http://10.63.0.41:8080/pdf/" + s + ".pdf");
                        fileConvertedPdfEntity.setFlag("1");
                        fileConvertedPdfEntity.setDateTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                        System.out.println(fsyStudyApplyService.updateFileConvertedPdfOne(fileConvertedPdfEntity));
                        examSynReportsBean.setApplyId(s.replace("_", "||"));
                        examSynReportsBean.setExamId(fileConvertedPdfEntity.getApplyId());
                        examSynReportsBean.setExamNo(fileConvertedPdfEntity.getApplyId());
                        examSynReportsBean.setFileUrl("http://10.63.0.41:8080/pdf/" + s + ".pdf");
                        examSynReportsBean.setVerifyDatetime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                        examSynReportsBean.setReportDatetime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                        examSynReportsBean.setReportUserCode("默认");
                        examSynReportsBean.setVerifyUserCode("默认");
                        examSynReportsBean.setReportUserName("默认");
                        examSynReportsBean.setVerifyUserName("默认");
                        examSynReportsBean.setReportDescription("默认");
                        examSynReportsBean.setReportImpression("默认");
                        System.out.println(examSynReportsBean.toString());
                        if (fsyStudyApplyService.selectReportsBySubApplyId(s.replace("_", "||")) != null) {
                            fsyStudyApplyService.updateReports(examSynReportsBean);
                        } else {
                            fsyStudyApplyService.insertReports(examSynReportsBean);
                        }
                        System.out.println(s.replace("_", "||"));
                        WriteBackReportUtil.statusWriteBack("30", s.replace("_", "||"));
                        WriteBackReportUtil.statusWriteBack("90", s.replace("_", "||"));
                    }
                }
            } catch (IOException e) {
                System.out.println("存在非PDF文档，" + e.toString());
            }
        }
    }


    /*  该方法计划每30秒运行一次，以同步来自医疗中心的数据。它使用secondMapper.getVExamList()方法从数据库中检索TjzxBeans列表。
    对于每个TjzxBean，它设置各种属性，检查是否已经插入了subApplyId，如果没有，则将其插入到v_sub_exam和v_sub_exam_item表中。
    它还根据某些条件将记录插入或更新到exam_patient和exams表中。最后，它使用getExamId()方法生成一个唯一的考试ID。*/

    //自动同步美和体检中心的视图数据
    @Scheduled(cron = "*/30 * * * * ?")
    public void getTJZXList() throws BadHanyuPinyinOutputFormatCombination {
        //DJLSH是以日期生成无法区分哪个检查类型的单 所以以检查类型+日期生成可区分不同科室的单
        //直接插入到v_sub_exam表 v_sub_exam_item表中
        //
        List<TjzxBean> tjzxBeans = secondMapper.getVExamList();
        for (TjzxBean tjzxBean : tjzxBeans) {
            if (checkExamMapper.getFLagHisInsertFlagByByApplyId(tjzxBean.getXH()) == null) {
                tjzxBean.setSubApplyId(String.valueOf(tjzxBean.getXH()));
                checkExamMapper.insertOneHisInsertFlag(tjzxBean.getSubApplyId());
                tjzxBean.setSickAge(tjzxBean.getSickAge());
                tjzxBean.setPatBirthday(DateUtil.DateToString(tjzxBean.getCSNYR(), "yyyy-MM-dd HH:mm:ss"));
                //超声合并一条exam记录，放射分开
                if ("US".equals(tjzxBean.getExamClass())) {
                    tjzxBean.setExamStatus("61");
                    tjzxBean.setApplyId(tjzxBean.getApplyId());
                } else {
                    tjzxBean.setExamStatus("30");
                    tjzxBean.setApplyId(tjzxBean.getApplyId() + tjzxBean.getSubApplyId());
                }
                if ("MHYJ003".equals(tjzxBean.getExecuteDeptCode())) {
                    tjzxBean.setExecuteDeptName("超声医学科");
                } else {
                    tjzxBean.setExecuteDeptName("医学影像科");
                }
                //判断唯一subApplyId是否已插入，无则插入，有则不处理
                Integer flag = vSubExamMapper.checkSubApplyId(tjzxBean.getSubApplyId());

                if (flag == null) {
                    vSubExamMapper.insertVSubExam(tjzxBean);
                    //      if (vSubExamItemMapper.checkVEApplyId(tjzxBean.getSubApplyId()) == null) {
                    VExamItem vExamItem = new VExamItem();
                    vExamItem.setItemCode(tjzxBean.getItemCode());
                    vExamItem.setItemName(tjzxBean.getItemName());
                    vExamItem.setItemCharge((tjzxBean.getItemCharge()));
                    vExamItem.setApplyID(tjzxBean.getSubApplyId());
                    //插入v_sub_exam_item
                    vSubExamItemMapper.insertVExamItem(vExamItem);
                    //   } else {
                    //       System.out.println(tjzxBean.getSubApplyId() + "已插入v_sub_exam_item");
                    //   }
                }
                if (checkExamMapper.getOneFlagByExamsPatientPatId(tjzxBean.getSickId()) == null) {

                    ExamPatientBean examPatientBean = new ExamPatientBean();
                    examPatientBean.setPatId(tjzxBean.getSickId());
                    examPatientBean.setPatIdentity(tjzxBean.getSickIdentity());
                    examPatientBean.setPatName(tjzxBean.getSickName());
                    examPatientBean.setPatSex(tjzxBean.getSickSex());
                    examPatientBean.setPatBirthDate(tjzxBean.getPatBirthday().substring(0, 10));
                    HanyuPinyinOutputFormat hanyuPinyinOutputFormat = new HanyuPinyinOutputFormat();
                    hanyuPinyinOutputFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
                    hanyuPinyinOutputFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
                    String py = PinyinHelper.toHanyuPinyinString(tjzxBean.getSickName(), hanyuPinyinOutputFormat, " ");
                    String p1 = py.substring(0, 1);
                    String p2 = py.substring(1);
                    py = p1.toUpperCase() + p2;
                    examPatientBean.setPatPhonetic(py);
                    checkExamMapper.insertOneExamsPatient(examPatientBean);
                }
                if (checkExamMapper.getOneFlagByVExamsByApplyId(tjzxBean.getApplyId()) == null) {
                    ExamsBean examsBean = new ExamsBean();
                    examsBean.setApplyId(tjzxBean.getApplyId());
                    examsBean.setExamClass(tjzxBean.getExamClass());
                    examsBean.setExamNo(tjzxBean.getExamNo());
                    examsBean.setExamStatus(tjzxBean.getExamStatus());
                    examsBean.setExecuteDeptId(tjzxBean.getExecuteDeptCode());
                    examsBean.setExecuteDeptName(tjzxBean.getExecuteDeptName());
                    examsBean.setPatSex(tjzxBean.getSickSex());
                    examsBean.setPatOutNo(tjzxBean.getPatOutNo());
                    examsBean.setPatId(tjzxBean.getSickId());
                    examsBean.setPatNo(tjzxBean.getSickId());
                    examsBean.setPatSource(tjzxBean.getExamSource());
                    examsBean.setPatPhyNo(tjzxBean.getPatPhyNo());
                    examsBean.setPatAddress(tjzxBean.getSickAddress());
                    examsBean.setPatPhone(tjzxBean.getSickPhone());
                    examsBean.setExamLevel(tjzxBean.getExamOrder());
                    examsBean.setPatAge(tjzxBean.getSickAge());
                    examsBean.setClinDept(tjzxBean.getReqDeptName());
                    examsBean.setClinDoc(tjzxBean.getReqDeptCode());
                    examsBean.setReqDt(tjzxBean.getReqDateTime());
                    checkExamMapper.insertOneVExams(examsBean);
                }

            }


        }


    }

    private static final String[] prefix2 = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private static final String[] prefix = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private static final Random r = new Random();

    /**
     * 此方法生成唯一的考试ID。它使用CRC32生成一个随机的32位哈希，并返回哈希的前8个字符作为考试ID。如果散列少于8个字符，它将前缀数组中的一个随机数附加到散列的末尾，使其长度为8个字符。
     */
    public static String getExamId() {
        String data = UUID.randomUUID().toString();
        CRC32 crc32 = new CRC32();
        crc32.update(data.getBytes());
        String nid = crc32.getValue() + "";
        if (nid.length() > 8) {
            return nid.substring(0, 8);
        } else {

            int len = 8 - nid.length();

            for (int i = 0; i < len; i++) {
                nid = nid + prefix[Math.abs(r.nextInt()) % 9];
            }

            return nid;
        }
    }
}
