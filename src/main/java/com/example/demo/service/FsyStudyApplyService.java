package com.example.demo.service;

import com.example.demo.bean.ExamSynReportsBean;
import com.example.demo.bean.FileConvertedPdfBean;
import com.example.demo.bean.FileRemoveBean;
import com.example.demo.bean.RecLoadBean;
import com.example.demo.mapper.first.HisSynRecMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class FsyStudyApplyService {
    @Autowired
    HisSynRecMapper hisSynRecMapper;

    public Object reUpload(String examId) {

        int i = hisSynRecMapper.updateOne(examId);
        if (i > 0) {
            return examId + "影像同步码已改为0，等待重传0";
        }
        return "未存在需要上传的影像。。。。。。";
    }

    public List<RecLoadBean> getRecLoadFlagIsZero() {
        return hisSynRecMapper.selectRecLoad();
    }

    public int updateFlag(String examId, String msg,int count) {
        return hisSynRecMapper.updateFlag(examId, msg,count);
    }

    public List<FileConvertedPdfBean> selectFileConvertedPdfEntityList() {
        return hisSynRecMapper.selectFileConvertedPdfEntityList();
    }

    public int updateFileConvertedPdfOne(FileConvertedPdfBean fileConvertedPdfBean) {
        return hisSynRecMapper.updateFileConvertedPdfOne(fileConvertedPdfBean);
    }

    public List<String> getSubApplyId(String applyId) {
        return hisSynRecMapper.getSubApplyId(applyId);

    }

    public void insertReports(ExamSynReportsBean examSynReportsEntity) {
        hisSynRecMapper.insertReports(examSynReportsEntity);
    }

    public int updateReports(ExamSynReportsBean examSynReportsEntity) {
        return hisSynRecMapper.updateReports(examSynReportsEntity);
    }

    public String selectReportsBySubApplyId(String subApplyId) {
        return hisSynRecMapper.selectReportsBySubApplyId(subApplyId);
    }

    public List<FileRemoveBean> selectNeedRemoveFile() {
        return hisSynRecMapper.selectAllFileRemove();
    }

    public int updateOneFileRemove(String examId, String newUrl, String flag) {
        return hisSynRecMapper.updateOneFileRemove(examId, newUrl, flag);
    }

    public String getItemNameBySubApplyId(String subApplyId) {
        return hisSynRecMapper.getItemNameBySubApplyId(subApplyId);
    }
}
