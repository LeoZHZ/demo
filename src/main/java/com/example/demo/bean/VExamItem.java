package com.example.demo.bean;

import javax.xml.crypto.Data;
import java.math.BigDecimal;

@lombok.Data
public class VExamItem {
    private String applyID;
    private Integer itemNo;
    private String itemCode;
    private String itemName;
    private BigDecimal itemCharge;

    @Override
    public String toString() {
        return "VExamItem{" +
                "applyID='" + applyID + '\'' +
                ", itemNo=" + itemNo +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemCharge=" + itemCharge +
                '}';
    }
}
