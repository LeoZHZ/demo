package com.example.demo.bean;

//import java.math.BigDecimal;
//import java.util.Date;
//import com.imagecloud.util.DateUtil;
//import com.imagecloud.util.StringUtils;

public class HisExamBean {
	String applyId;
	String examId;
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	//String patId;
	String examNo;
	String examStatus;
	String targetOrganization;  //,[TARGET_ORGANIZATION]
	String targetUserName;	     // ,[TARGET_USER_NAME]
	String examClass;
	//String orgId;
	String sickName;
	String sickSex;
	String sickAge;
	String sickId;
	String sickAddress;
	String zipCode;
	//String phoneNo;
	String birthPlace;
	String sickHeight;
	String sickWeight;
	String examSource;
	//String priorityOrder;
	//String orgNo;
	String reqDeptName;
	String reqDeptCode;
	String reqPhysician;
	//String reqPhysicianCode;
	String bedNo;
	String reqDateTime;
	String scheduledDateTime;
	String clinDiag;
	//String labTest;
	//String relevantDiag;
	String clinSymp;
	String reqMemo;
	Double charges;
	//String chargeFlage;
	String updateDateTime;
	String sickIdentity;
	String sickPhone;
	String examOrder;
	String sickNo;
	String examNotice;
	String examSynType;
	//String examTWr;
	//String examTUser;
	//String examTWrName;
	String examRWr;
	String examRUser;

	//String organName;
	String reportParam;
	String reportDescription;
	String reportImpression;
	String reportRecommendation;
	String reportAbnormal;
	String reportDateTime;
	String reporter;
	String verifier;
	String verifyDateTime;
	String examDateTime;
	/** 检查急缓*/
	//String examOrgELevel;
	
	public String getSickIdentity() {
		return sickIdentity;
	}
	public void setSickIdentity(String sickIdentity) {
		this.sickIdentity = sickIdentity;
	}
	
	public String getExamStatus() {
		return examStatus;
	}
	public void setExamStatus(String examStatus) {
		this.examStatus = examStatus;
	}
	
	public String getSickPhone() {
		return sickPhone;
	}
	public void setSickPhone(String sickPhone) {
		this.sickPhone = sickPhone;
	}
	public String getExamOrder() {
		return examOrder;
	}
	public void setExamOrder(String examOrder) {
		this.examOrder = examOrder;
	}
	public String getSickNo() {
		return sickNo;
	}
	public void setSickNo(String sickNo) {
		this.sickNo = sickNo;
	}
	public String getExamNotice() {
		return examNotice;
	}
	public void setExamNotice(String examNotice) {
		this.examNotice = examNotice;
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
	//public String getOrgId() {
	//	return orgId;
	//}
	//public void setOrgId(String orgId) {
	//	this.orgId = orgId;
	//}
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
	public String getSickAge() {
		return sickAge;
	}
	public void setSickAge(String sickAge) {
		this.sickAge = sickAge;
	}
	public String getSickId() {
		return sickId;
	}
	public void setSickId(String sickId) {
		this.sickId = sickId;
	}
	public String getSickAddress() {
		return sickAddress;
	}
	public void setSickAddress(String sickAddress) {
		this.sickAddress = sickAddress;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	//public String getPhoneNo() {
	//	return phoneNo;
	//}
	//public void setPhoneNo(String phoneNo) {
	//	this.phoneNo = phoneNo;
	//}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getSickHeight() {
		return sickHeight;
	}
	public void setSickHeight(String sickHeight) {
		this.sickHeight = sickHeight;
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
	//public String getPriorityOrder() {
	//	return priorityOrder;
	//}
	//public void setPriorityOrder(String priorityOrder) {
	//	this.priorityOrder = priorityOrder;
	//}
	//public String getOrgNo() {
	//	return orgNo;
	//}
	//public void setOrgNo(String orgNo) {
	//	this.orgNo = orgNo;
	//}

	public void setVerifyDateTime(String verifyDateTime) {
		this.verifyDateTime = verifyDateTime;
	}

	public String getExamRWr() {
		return examRWr;
	}

	public void setExamRWr(String examRWr) {
		this.examRWr = examRWr;
	}

	public String getExamRUser() {
		return examRUser;
	}

	public void setExamRUser(String examRUser) {
		this.examRUser = examRUser;
	}

	public String getReqDeptName() {
		return reqDeptName;
	}
	public void setReqDeptName(String reqDeptName) {
		this.reqDeptName = reqDeptName;
	}
	public String getReqDeptCode() {
		return reqDeptCode;
	}
	public void setReqDeptCode(String reqDeptCode) {
		this.reqDeptCode = reqDeptCode;
	}
	public String getReqPhysician() {
		return reqPhysician;
	}
	public void setReqPhysician(String reqPhysician) {
		this.reqPhysician = reqPhysician;
	}
	//public String getReqPhysicianCode() {
	//	return reqPhysicianCode;
	//}
	//public void setReqPhysicianCode(String reqPhysicianCode) {
	//	this.reqPhysicianCode = reqPhysicianCode;
	//}
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
	
	public String getScheduledDateTime() {
		return scheduledDateTime;
	}
	public void setScheduledDateTime(String scheduledDateTime) {
		this.scheduledDateTime = scheduledDateTime;
	}
	
	public String getClinDiag() {
		return clinDiag;
	}
	public void setClinDiag(String clinDiag) {
		this.clinDiag = clinDiag;
	}
	//public String getLabTest() {
	//	return labTest;
	//}
	//public void setLabTest(String labTest) {
	//	this.labTest = labTest;
	//}
	//public String getRelevantDiag() {
	//	return relevantDiag;
	//}
	//public void setRelevantDiag(String relevantDiag) {
	//	this.relevantDiag = relevantDiag;
	//}
	public String getClinSymp() {
		if(clinSymp!=null&&clinSymp.length()>=400) {
			return null;
		}
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

	public Double getCharges() {
		return charges;
	}
	public void setCharges(Double charges) {
		this.charges = charges;
	}
	public void setCharges(String charges) {
		this.charges = new Double(charges);
	}
	
	//public String getChargeFlage() {
	///	return chargeFlage;
	//}
	//public void setChargeFlage(String chargeFlage) {
	//	this.chargeFlage = chargeFlage;
	//}
	
	public String getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(String updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
	public String getReportParam(){
		return reportParam;
	}
	public void setReportParam(String reportParam){
		this.reportParam = reportParam;
	}
	
	public String getReportDescription(){
		return reportDescription;
	}	
	public void setReportDescription(String reportDescription){
		this.reportDescription = reportDescription;
	}
	
	public String getReportImpression(){
		return reportImpression;
	}
	public void setReportImpression(String reportImpression){
		this.reportImpression = reportImpression;
	}
	
	public String getReportRecommendation(){
		return reportRecommendation;
	}
	public void setReportRecommendation(String reportRecommendation){
		this.reportRecommendation = reportRecommendation;
	}
	
	public String getReportAbnormal(){
		return reportAbnormal;
	}
	public void setReportAbnormal(String reportAbnormal){
		this.reportAbnormal = reportAbnormal;
	}
	
	public String getReportDateTime(){
		return reportDateTime;
	}
	public void setReportDateTime(String reportDateTime){
		this.reportDateTime = reportDateTime;
	}
	
	
	public String getReporter(){
		return reporter;
	}
	public void setReporter(String reporter){
		this.reporter = reporter;
	}
	
	public String getVerifier(){
		return verifier;
	}
	public void setVerifier(String verifier){
		this.verifier = verifier;
	}
	
	public String getVerifyDateTime(){
		return verifyDateTime;
	}
	public void setVeriftDateTime(String verifyDateTime){
		this.verifyDateTime = verifyDateTime;
	}
	
	public String getExamDateTime(){
		return examDateTime;
	}
	public void setExamDateTime(String examDateTime){
		this.examDateTime = examDateTime;
	}
	

	//public String getWrClinicKey() {
	//	return wrClinicKey;
	//}
	//public void setWrClinicKey(String wrClinicKey) {
	//	this.wrClinicKey = wrClinicKey;
	//}
	//public String getExamDcmSex() {
	//	return examDcmSex;
	//}
	//public void setExamDcmSex(String examDcmSex) {
	//	this.examDcmSex = examDcmSex;
	//}
	
	//public String getExamOrgELevel() {
	//	return examOrgELevel;
	//}
	//public void setExamOrgELevel(String examOrgELevel) {
	//	this.examOrgELevel = examOrgELevel;
	//}
	
	public String getTargetOrganization() {
		return targetOrganization;
	}
	public void setTargetOrganization(String targetOrganization) {
		this.targetOrganization = targetOrganization;
	}
	
	public String getTargetUserName() {
		return targetUserName;
	}
	public void setTargetUserName(String targetUserName) {
		this.targetUserName = targetUserName;
	}
}
