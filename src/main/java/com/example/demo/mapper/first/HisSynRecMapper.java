package com.example.demo.mapper.first;

import com.example.demo.bean.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 云胶片上传记录表
 */
@Mapper
public interface HisSynRecMapper {
    List<String> select();

    int insert(HisSynRecBean hisSynRec);

    int selectIsExist(String examId);

    int update(HisSynRecBean hisSynRec);

    int updateOne(String examId);

    List<RecLoadBean> selectRecLoad();

    int updateFlag(String examId, String msg,int count);

    List<FileConvertedPdfBean> selectFileConvertedPdfEntityList();

    int updateFileConvertedPdfOne(FileConvertedPdfBean fileConvertedPdfEntity);

    int insertFileConvertedPdfOne(FileConvertedPdfBean fileConvertedPdfEntity);


    /**
     * 通过申请单号获取所有对应的子ID v_sub_applyId
     */
    List<String> getSubApplyId(String applyId);

    public void insertReports(ExamSynReportsBean examSynReportsEntity);

    public int updateReports(ExamSynReportsBean examSynReportsEntity);

    public String selectReportsBySubApplyId(@Param("subApplyId") String subApplyId);


    /**
     * 获取30分钟前 1分钟内的所有需要移动文件的记录
     */
    public List<FileRemoveBean> selectAllFileRemove();

    int updateOneFileRemove(@Param("examId") String examId, @Param("url") String newUrl, @Param("flag") String flag);

    String getItemNameBySubApplyId(@Param("subApplyId") String subApplyId);

    void updateByApplyId(@Param("applyId") String applyId);
    List<String> getApplyIdBySex();
}
