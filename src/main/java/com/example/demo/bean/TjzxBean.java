package com.example.demo.bean;

import java.math.BigDecimal;
import java.util.Date;

/*美和体检中心实体类*/
public class TjzxBean {

    /*DJLSH
     * */
    String applyId;
    /*DJLSH* */
    String examNo;
    /*JCLX*/
    String examClass;

    /*TJBH*/
    String sickId;
    /*XM*/
    String sickName;
    /*XB*/
    String sickSex;
    /*NL*/
    String sickAge;
    /*SFZH*/
    String sickIdentity;
    /*ADDRESS*/
    String sickAddress;
    /*PHONE*/
    String sickPhone;
    String birthPlace;
    String sickWeight;
    /*体检*/
    String examSource = "体检";
    String examOrder = "普通";
    /*DJLSH* */
    String patInNo;
    /*DJLSH* */
    String patOutNo;
    /*DJLSH* */
    String patPhyNo;

    String patLendNo;
    /*SQKSBH*/
    String reqDeptCode;
    /*SQKS*/
    String reqDeptName;
    /*SQYSXM*/
    String reqPhysician;
    /*SQYSBH*/
    String reqPhysicianNo;
    String bedNo;
    /*SQSJ*/
    String reqDateTime;
    String clinDiag;
    String examNotice;
    String clinSymp;
    String reqMemo;

    String executeDeptName;
    /*ZXBSBM*/
    String executeDeptCode;
    String lastUpdateTime;
    String sourceSystemId;
    String updateTime;
    String examDateTime;
    String subApplyId;
    /*CSNYR*/
    String patBirthday;
    Date CSNYR;
    String itemName;
    String itemCode;
    BigDecimal itemCharge;

    int XH;
    String examStatus;

    @Override
    public String toString() {
        return "TjzxBean{" +
                "applyId='" + applyId + '\'' +
                ", examNo='" + examNo + '\'' +
                ", examClass='" + examClass + '\'' +
                ", sickId='" + sickId + '\'' +
                ", sickName='" + sickName + '\'' +
                ", sickSex='" + sickSex + '\'' +
                ", sickAge='" + sickAge + '\'' +
                ", sickIdentity='" + sickIdentity + '\'' +
                ", sickAddress='" + sickAddress + '\'' +
                ", sickPhone='" + sickPhone + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", sickWeight='" + sickWeight + '\'' +
                ", examSource='" + examSource + '\'' +
                ", examOrder='" + examOrder + '\'' +
                ", patInNo='" + patInNo + '\'' +
                ", patOutNo='" + patOutNo + '\'' +
                ", patPhyNo='" + patPhyNo + '\'' +
                ", patLendNo='" + patLendNo + '\'' +
                ", reqDeptCode='" + reqDeptCode + '\'' +
                ", reqDeptName='" + reqDeptName + '\'' +
                ", reqPhysician='" + reqPhysician + '\'' +
                ", reqPhysicianNo='" + reqPhysicianNo + '\'' +
                ", bedNo='" + bedNo + '\'' +
                ", reqDateTime='" + reqDateTime + '\'' +
                ", clinDiag='" + clinDiag + '\'' +
                ", examNotice='" + examNotice + '\'' +
                ", clinSymp='" + clinSymp + '\'' +
                ", reqMemo='" + reqMemo + '\'' +
                ", executeDeptName='" + executeDeptName + '\'' +
                ", executeDeptCode='" + executeDeptCode + '\'' +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                ", sourceSystemId='" + sourceSystemId + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", examDateTime='" + examDateTime + '\'' +
                ", subApplyId='" + subApplyId + '\'' +
                ", patBirthday='" + patBirthday + '\'' +
                ", CSNYR=" + CSNYR +
                ", itemName='" + itemName + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemCharge='" + itemCharge + '\'' +
                ", XH=" + XH +
                ", examStatus='" + examStatus + '\'' +
                '}';
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


    public BigDecimal getItemCharge() {
        return itemCharge;
    }

    public void setItemCharge(BigDecimal itemCharge) {
        this.itemCharge = itemCharge;
    }

    public Date getCSNYR() {
        return CSNYR;
    }

    public void setCSNYR(Date CSNYR) {
        this.CSNYR = CSNYR;
    }

    public String getPatBirthday() {
        return patBirthday;
    }

    public void setPatBirthday(String patBirthday) {
        this.patBirthday = patBirthday;
    }

    public String getExamStatus() {
        return examStatus;
    }

    public void setExamStatus(String examStatus) {
        this.examStatus = examStatus;
    }

    public int getXH() {
        return XH;
    }

    public void setXH(int XH) {
        this.XH = XH;
    }

    public String getSubApplyId() {
        return subApplyId;
    }

    public void setSubApplyId(String subApplyId) {
        this.subApplyId = subApplyId;
    }

    public String getPatOutNo() {
        return patOutNo;
    }

    public void setPatOutNo(String patOutNo) {
        this.patOutNo = patOutNo;
    }

    public String getPatPhyNo() {
        return patPhyNo;
    }

    public void setPatPhyNo(String patPhyNo) {
        this.patPhyNo = patPhyNo;
    }

    public String getSickAge() {
        return sickAge;
    }

    public void setSickAge(String sickAge) {
        this.sickAge = sickAge;
    }

    public String getReqDeptName() {
        return reqDeptName;
    }

    public void setReqDeptName(String reqDeptName) {
        this.reqDeptName = reqDeptName;
    }

    public String getReqPhysician() {
        return reqPhysician;
    }

    public void setReqPhysician(String reqPhysician) {
        this.reqPhysician = reqPhysician;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getExamNo() {
        return examNo;
    }

    public void setExamNo(String examNo) {
        this.examNo = examNo;
    }

    public String getExamClass() {
        return examClass;
    }

    public void setExamClass(String examClass) {
        this.examClass = examClass;
    }

    public String getSickId() {
        return sickId;
    }

    public void setSickId(String sickId) {
        this.sickId = sickId;
    }

    public String getSickName() {
        return sickName;
    }

    public void setSickName(String sickName) {
        this.sickName = sickName;
    }

    public String getSickSex() {
        return sickSex;
    }

    public void setSickSex(String sickSex) {
        this.sickSex = sickSex;
    }


    public String getSickIdentity() {
        return sickIdentity;
    }

    public void setSickIdentity(String sickIdentity) {
        this.sickIdentity = sickIdentity;
    }

    public String getSickAddress() {
        return sickAddress;
    }

    public void setSickAddress(String sickAddress) {
        this.sickAddress = sickAddress;
    }

    public String getSickPhone() {
        return sickPhone;
    }

    public void setSickPhone(String sickPhone) {
        this.sickPhone = sickPhone;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getSickWeight() {
        return sickWeight;
    }

    public void setSickWeight(String sickWeight) {
        this.sickWeight = sickWeight;
    }

    public String getExamSource() {
        return examSource;
    }

    public void setExamSource(String examSource) {
        this.examSource = examSource;
    }

    public String getExamOrder() {
        return examOrder;
    }

    public void setExamOrder(String examOrder) {
        this.examOrder = examOrder;
    }

    public String getPatInNo() {
        return patInNo;
    }

    public void setPatInNo(String patInNo) {
        this.patInNo = patInNo;
    }

    public String getPatLendNo() {
        return patLendNo;
    }

    public void setPatLendNo(String patLendNo) {
        this.patLendNo = patLendNo;
    }

    public String getReqDeptCode() {
        return reqDeptCode;
    }

    public void setReqDeptCode(String reqDeptCode) {
        this.reqDeptCode = reqDeptCode;
    }

    public String getReqPhysicianNo() {
        return reqPhysicianNo;
    }

    public void setReqPhysicianNo(String reqPhysicianNo) {
        this.reqPhysicianNo = reqPhysicianNo;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getReqDateTime() {
        return reqDateTime;
    }

    public void setReqDateTime(String reqDateTime) {
        this.reqDateTime = reqDateTime;
    }

    public String getClinDiag() {
        return clinDiag;
    }

    public void setClinDiag(String clinDiag) {
        this.clinDiag = clinDiag;
    }

    public String getExamNotice() {
        return examNotice;
    }

    public void setExamNotice(String examNotice) {
        this.examNotice = examNotice;
    }

    public String getClinSymp() {
        return clinSymp;
    }

    public void setClinSymp(String clinSymp) {
        this.clinSymp = clinSymp;
    }

    public String getReqMemo() {
        return reqMemo;
    }

    public void setReqMemo(String reqMemo) {
        this.reqMemo = reqMemo;
    }

    public String getExecuteDeptName() {
        return executeDeptName;
    }

    public void setExecuteDeptName(String executeDeptName) {
        this.executeDeptName = executeDeptName;
    }

    public String getExecuteDeptCode() {
        return executeDeptCode;
    }

    public void setExecuteDeptCode(String executeDeptCode) {
        this.executeDeptCode = executeDeptCode;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getSourceSystemId() {
        return sourceSystemId;
    }

    public void setSourceSystemId(String sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getExamDateTime() {
        return examDateTime;
    }

    public void setExamDateTime(String examDateTime) {
        this.examDateTime = examDateTime;
    }

}
