package com.example.demo.bean;

public class FileRemoveBean {
    String examId;
    String oldFileUrl;
    String newFileUrl;
    String flag;
    String gmtCreate;
    String gmtModifie;

    @Override
    public String toString() {
        return "FileRemoveBean{" +
                "examId='" + examId + '\'' +
                ", oldFileUrl='" + oldFileUrl + '\'' +
                ", newFileUrl='" + newFileUrl + '\'' +
                ", flag='" + flag + '\'' +
                ", gmtCreate='" + gmtCreate + '\'' +
                ", gmtModifie='" + gmtModifie + '\'' +
                '}';
    }

    public String getGmtModifie() {
        return gmtModifie;
    }

    public void setGmtModifie(String gmtModifie) {
        this.gmtModifie = gmtModifie;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getOldFileUrl() {
        return oldFileUrl;
    }

    public void setOldFileUrl(String oldFileUrl) {
        this.oldFileUrl = oldFileUrl;
    }

    public String getNewFileUrl() {
        return newFileUrl;
    }

    public void setNewFileUrl(String newFileUrl) {
        this.newFileUrl = newFileUrl;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
