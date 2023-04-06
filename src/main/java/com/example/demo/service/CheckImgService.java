package com.example.demo.service;

import com.example.demo.bean.ExamBean;
import com.example.demo.bean.ImageBean;
import com.example.demo.bean.ServerBean;
import com.example.demo.bean.StoreBean;
import com.example.demo.mapper.thread.ExamMapper;
import com.example.demo.util.AESUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * com.example.demo.service
 * CheckImgService
 *
 * @author leo
 * @Description
 * @date 2021/6/8 16:28
 */
@Service
public class CheckImgService {
    @Autowired
    ExamMapper examMapper;

    public int getExamBeanByExamPatId2(String patNo,String eClass,String wrId) {
        List<ExamBean> select = examMapper.select(  patNo,  eClass,  wrId);
        if (select.size() != 0) {
            String size = examMapper.getStudyIdByExamId(select.get(0).getExamId());

            return Integer.parseInt(size);
        }
        return 0;
    }
    public int getExamBeanByExamPatId(String patNo,String eClass,String wrId) {
        List<ExamBean> select = examMapper.select(  patNo,  eClass,  wrId);
        System.out.println("select:"+select);
        if (select.size() != 0) {
            StoreBean store = examMapper.getStudyIdByExamId2(select.get(0).getExamId());
            //   ServerBean server = examMapper.selectServerByServerId(store.getServerId());
            //  String httpStr = server.getServerProtocol() + "://" + server.getServerIp() + ":" + server.getServerWsPort() + "/imagecloud/dicom/get_jpg?";
            //    String localPath = "";
            //   byte[] b = null;
            //    try {
            //     b = AESUtil.Encrypt(server.getServerSharePath(), "GNV;vl6Pd71qe,wo");
            //  localPath = AESUtil.parseByte2HexStr(b);
            //    } catch (Exception e) {
            //         e.printStackTrace();
            //    }
            ImageBean imageBean = new ImageBean();
            imageBean.setStudyId(store.getStudyId());
            List<ImageBean> imageList = examMapper.selectImageByStudyId(imageBean);
            int size = imageList.size();
            /*JSONArray jArray = new JSONArray();
            if (imageList != null && imageList.size() > 0) {
                JSONObject jImage = new JSONObject();
                for (ImageBean image : imageList) {
                    String url = httpStr + "localPath=" + localPath + "&fileName=" + store.getStorePath() + "%5C" + image.getImageFileName();
                    if (select.get(0).getExamEclass().equals("X-RAY") || "OP".equals(select.get(0).getExamEclass())) {
                        url += "&windowWidth=" + image.getImageWindowWidth() + "&windowCenter=" + image.getImageWindowCenter() + "&rows=0&columns=512&inverse=0";
                    } else {
                        url += "&windowWidth=" + image.getImageWindowWidth() + "&windowCenter=" + image.getImageWindowCenter() + "&rows=0&columns=0&inverse=0";
                    }
                    url = url.replaceAll("\\\\", "%5C");
                    jImage.put("url", url);
                    jImage.put("studyId", image.getStudyId());
                    jImage.put("imageUid", image.getImageUid());
                    jImage.put("imageReportFlag", image.getImageReportFlag());
                    jImage.put("imageKeyFlag", image.getImageKeyFlag());
                    jImage.put("imagePrivateFlag", image.getImagePrivateFlag());
                    jImage.put("seriesUid", image.getSeriesUid());
                    jImage.put("seriesNumber", image.getSeriesNumber());
                    jArray.add(jImage);
                }
            }*/
           /* List<Map<String,String>> mapList=JSONArray.toList(jArray,new HashMap<>(), new JsonConfig());
            Map<String,List<Map<String,String>>> listMap1=new LinkedHashMap<>();
            mapList.stream().collect(Collectors.groupingBy(map -> map.get("seriesNumber"))).entrySet().stream()
                    .sorted(Map.Entry.comparingByKey()).forEachOrdered(m -> listMap1.put(m.getKey(),m.getValue()));
            List<List<Map<String,String>>> maps=new ArrayList<>();
            listMap1.forEach((s, maps1) -> {
                maps.add(maps1);
            });
            JSONObject json = CheckImgService.getDataReturnJson("images", maps);*/
            return size;
        }
        return 0;
    }

    public static JSONObject getDataReturnJson(String dataKey, Object data) {
        JSONObject jData = new JSONObject();
        jData.put(dataKey, data);

        JSONObject jb = new JSONObject();
        jb.put("code", "200");
        jb.put("msg", "成功");
        jb.put("data", jData);
        return jb;
    }

}
