package com.example.demo.bean;

/**
 * com.pacs.entity
 * DevicesStatistiscEntity
 *
 * @author leo
 * @Description
 * @date 2022/10/17 14:15
 */
public class DevicesStatisticsBean {

    String id;
    String time;
    String examSource;
    String examClass;
    String number;
    String summaryClass;

    @Override
    public String toString() {
        return "DevicesStatisticsEntity{" +
                "id='" + id + '\'' +
                ", time='" + time + '\'' +
                ", examSource='" + examSource + '\'' +
                ", examClass='" + examClass + '\'' +
                ", number='" + number + '\'' +
                ", summaryClass='" + summaryClass + '\'' +
                '}';
    }

    public String getSummaryClass() {
        return summaryClass;
    }

    public void setSummaryClass(String summaryClass) {
        this.summaryClass = summaryClass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getExamSource() {
        return examSource;
    }

    public void setExamSource(String examSource) {
        this.examSource = examSource;
    }

    public String getExamClass() {
        return examClass;
    }

    public void setExamClass(String examClass) {
        this.examClass = examClass;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

