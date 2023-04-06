package com.example.demo.bean;
/**
 *
 * 骨密度数据相关类
 * 此类为DICOMPDF转PDF用实体类
 * */
public class FileConvertedPdfBean {

    String applyId;
    String fileUrl;
    String pdfUrl;
    String flag;
    String dateTime;

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "FileConvertedPdfEntity{" +
                "applyId='" + applyId + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", pdfUrl='" + pdfUrl + '\'' +
                ", flag='" + flag + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}';
    }
}
