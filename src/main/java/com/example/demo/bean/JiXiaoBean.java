package com.example.demo.bean;

/**
 * com.pacs.entity
 * JiXiaoEntity
 * 美和绩效统计
 *
 * @author leo
 * @Description
 * @date 2022/8/23 15:23
 */
public class JiXiaoBean {


    String reportDt;
    String deptName;
    String checkDoctorName;
    String checkDoctorNo;
    String deptNo;
    String examClass;
    String examSource;
    int checkPeopleNumber;
    int checkNumber;
    int reportNumber;
    int examineNumber;

    @Override
    public String toString() {
        return "JiXiaoBean{" +
                "reportDt='" + reportDt + '\'' +
                ", deptName='" + deptName + '\'' +
                ", checkDoctorName='" + checkDoctorName + '\'' +
                ", checkDoctorNo='" + checkDoctorNo + '\'' +
                ", deptNo='" + deptNo + '\'' +
                ", examClass='" + examClass + '\'' +
                ", examSource='" + examSource + '\'' +
                ", checkPeopleNumber=" + checkPeopleNumber +
                ", checkNumber=" + checkNumber +
                ", reportNumber=" + reportNumber +
                ", examineNumber=" + examineNumber +
                '}';
    }

    public String getReportDt() {
        return reportDt;
    }

    public void setReportDt(String reportDt) {
        this.reportDt = reportDt;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCheckDoctorName() {
        return checkDoctorName;
    }

    public void setCheckDoctorName(String checkDoctorName) {
        this.checkDoctorName = checkDoctorName;
    }

    public String getCheckDoctorNo() {
        return checkDoctorNo;
    }

    public void setCheckDoctorNo(String checkDoctorNo) {
        this.checkDoctorNo = checkDoctorNo;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getExamClass() {
        return examClass;
    }

    public void setExamClass(String examClass) {
        this.examClass = examClass;
    }

    public String getExamSource() {
        return examSource;
    }

    public void setExamSource(String examSource) {
        this.examSource = examSource;
    }

    public int getCheckPeopleNumber() {
        return checkPeopleNumber;
    }

    public void setCheckPeopleNumber(int checkPeopleNumber) {
        this.checkPeopleNumber = checkPeopleNumber;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    public int getExamineNumber() {
        return examineNumber;
    }

    public void setExamineNumber(int examineNumber) {
        this.examineNumber = examineNumber;
    }
}
