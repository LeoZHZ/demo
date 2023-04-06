package com.example.demo.bean;

import java.io.Serializable;


/**
 * 回写报告实体类
 *
 * @author Administrator
 */
public class ExamSynReportsBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String examId;
    private String applyId;

    private String sickName;

    private String examNo;

    private String examStatus;

    private String examStatusMemo;

    private String reportParam;

    private String reportDescription;

    private String reportImpression;

    private String reportRecommendation;

    private String reportAbnormal;

    private String examRisks;

    private String reportUserName;

    private String reportDatetime;

    private String verifyUserName;

    private String verifyDatetime;

    private String updateDatetime;

    private String reportFileContent;

    private String fileUrl;

    private String reportUserCode;

    private String verifyUserCode;

    private  String ftpUrl;
    private  String jpgUrl;

    @Override
    public String toString() {
        return "ExamSynReportsEntity{" +
                "examId='" + examId + '\'' +
                ", applyId='" + applyId + '\'' +
                ", sickName='" + sickName + '\'' +
                ", examNo='" + examNo + '\'' +
                ", examStatus='" + examStatus + '\'' +
                ", examStatusMemo='" + examStatusMemo + '\'' +
                ", reportParam='" + reportParam + '\'' +
                ", reportDescription='" + reportDescription + '\'' +
                ", reportImpression='" + reportImpression + '\'' +
                ", reportRecommendation='" + reportRecommendation + '\'' +
                ", reportAbnormal='" + reportAbnormal + '\'' +
                ", examRisks='" + examRisks + '\'' +
                ", reportUserName='" + reportUserName + '\'' +
                ", reportDatetime='" + reportDatetime + '\'' +
                ", verifyUserName='" + verifyUserName + '\'' +
                ", verifyDatetime='" + verifyDatetime + '\'' +
                ", updateDatetime='" + updateDatetime + '\'' +
                ", reportFileContent='" + reportFileContent + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", reportUserCode='" + reportUserCode + '\'' +
                ", verifyUserCode='" + verifyUserCode + '\'' +
                ", ftpUrl='" + ftpUrl + '\'' +
                ", jpgUrl='" + jpgUrl + '\'' +
                '}';
    }

    public String getFtpUrl() {
        return ftpUrl;
    }

    public void setFtpUrl(String ftpUrl) {
        this.ftpUrl = ftpUrl;
    }

    public String getJpgUrl() {
        return jpgUrl;
    }

    public void setJpgUrl(String jpgUrl) {
        this.jpgUrl = jpgUrl;
    }

    public String getReportUserCode() {
        return reportUserCode;
    }

    public void setReportUserCode(String reportUserCode) {
        this.reportUserCode = reportUserCode;
    }

    public String getVerifyUserCode() {
        return verifyUserCode;
    }

    public void setVerifyUserCode(String verifyUserCode) {
        this.verifyUserCode = verifyUserCode;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getReportFileContent() {
        return reportFileContent;
    }

    public void setReportFileContent(String reportFileContent) {
        this.reportFileContent = reportFileContent;
    }

    public ExamSynReportsBean() {
    }

    public String getApplyId() {
        return this.applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getExamNo() {
        return this.examNo;
    }

    public void setExamNo(String examNo) {
        this.examNo = examNo;
    }

    public String getExamRisks() {
        return this.examRisks;
    }

    public void setExamRisks(String examRisks) {
        this.examRisks = examRisks;
    }

    public String getExamStatus() {
        return this.examStatus;
    }

    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus;
    }

    public String getExamStatusMemo() {
        return this.examStatusMemo;
    }

    public void setExamStatusMemo(String examStatusMemo) {
        this.examStatusMemo = examStatusMemo;
    }

    public String getReportAbnormal() {
        return this.reportAbnormal;
    }

    public void setReportAbnormal(String reportAbnormal) {
        this.reportAbnormal = reportAbnormal;
    }

    public String getReportDatetime() {
        return this.reportDatetime;
    }

    public void setReportDatetime(String reportDatetime) {
        this.reportDatetime = reportDatetime;
    }

    public String getReportDescription() {
        return this.reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    public String getReportImpression() {
        return this.reportImpression;
    }

    public void setReportImpression(String reportImpression) {
        this.reportImpression = reportImpression;
    }

    public String getReportParam() {
        return this.reportParam;
    }

    public void setReportParam(String reportParam) {
        this.reportParam = reportParam;
    }

    public String getReportRecommendation() {
        return this.reportRecommendation;
    }

    public void setReportRecommendation(String reportRecommendation) {
        this.reportRecommendation = reportRecommendation;
    }

    public String getReportUserName() {
        return this.reportUserName;
    }

    public void setReportUserName(String reportUserName) {
        this.reportUserName = reportUserName;
    }

    public String getSickName() {
        return this.sickName;
    }

    public void setSickName(String sickName) {
        this.sickName = sickName;
    }

    public String getUpdateDatetime() {
        return this.updateDatetime;
    }

    public void setUpdateDatetime(String updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getVerifyDatetime() {
        return this.verifyDatetime;
    }

    public void setVerifyDatetime(String verifyDatetime) {
        this.verifyDatetime = verifyDatetime;
    }

    public String getVerifyUserName() {
        return this.verifyUserName;
    }

    public void setVerifyUserName(String verifyUserName) {
        this.verifyUserName = verifyUserName;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

}