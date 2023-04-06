package com.example.demo.bean;

public class TjzxItemBean {
    String itemNo;
    String itemName;
    String itemCode;
    Double itemCharge;
    String applyId;

    @Override
    public String toString() {
        return "TjzxItemBean{" +
                "itemNo='" + itemNo + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemCharge=" + itemCharge +
                ", applyId='" + applyId + '\'' +
                '}';
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Double getItemCharge() {
        return itemCharge;
    }

    public void setItemCharge(Double itemCharge) {
        this.itemCharge = itemCharge;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }
}
