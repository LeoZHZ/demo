package com.example.demo.bean;

/**
 * com.pacs.entity
 * RecLoadEntity
 *
 * @author leo
 * @Description
 * @date 2021/5/27 11:26
 */
public class RecLoadBean {
    String examId;
    String filePath;
    String flag;
    String loadDateTime;
    String msg;
    String examEclass;
    String wrId;
    String patNo;
    Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getPatNo() {
        return patNo;
    }

    public void setPatNo(String patNo) {
        this.patNo = patNo;
    }

    public String getWrId() {
        return wrId;
    }

    public void setWrId(String wrId) {
        this.wrId = wrId;
    }

    public String getExamEclass() {
        return examEclass;
    }

    public void setExamEclass(String examEclass) {
        this.examEclass = examEclass;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getLoadDateTime() {
        return loadDateTime;
    }

    public void setLoadDateTime(String loadDateTime) {
        this.loadDateTime = loadDateTime;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "RecLoadBean{" +
                "examId='" + examId + '\'' +
                ", filePath='" + filePath + '\'' +
                ", flag='" + flag + '\'' +
                ", loadDateTime='" + loadDateTime + '\'' +
                ", msg='" + msg + '\'' +
                ", examEclass='" + examEclass + '\'' +
                ", wrId='" + wrId + '\'' +
                ", patNo='" + patNo + '\'' +
                ", count=" + count +
                '}';
    }
}
