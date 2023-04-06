package com.example.demo.bean;

import javax.xml.crypto.Data;

@lombok.Data
public class VExamOrgan {
    private String applyID;
    private Integer organNo;
    private String organName;

    @Override
    public String toString() {
        return "VExamOrgan{" +
                "applyID='" + applyID + '\'' +
                ", organNo=" + organNo +
                ", organName='" + organName + '\'' +
                '}';
    }
}
