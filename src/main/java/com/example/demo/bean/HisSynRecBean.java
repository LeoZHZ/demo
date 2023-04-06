package com.example.demo.bean;

/**云胶片视图同步记录
 * @author Yuan
 * @date 2018年10月24日
 * @Description
 */
public class HisSynRecBean {
	private String examId;
	private String patName;
	private String examSynFlag;
	private String examSynDt;
	private String reportSynFlag;
	private String reportSynDt;
	private String dicomSynFlag;
	private String dicomSynDt;
	private String errorType;
	private String errorInfo;
	private String qrUrl;
	private String qrImage;
	
	public String getExamId() {
		return examId;
	}

	public void setExamId(String applyId) {
		this.examId = applyId;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public String getExamSynFlag() {
		return examSynFlag;
	}

	public void setExamSynFlag(String examSynFlag) {
		this.examSynFlag = examSynFlag;
	}

	public String getExamSynDt() {
		return examSynDt;
	}

	public void setExamSynDt(String examSynDt) {
		this.examSynDt = examSynDt;
	}


	public String getReportSynFlag() {
		return reportSynFlag;
	}

	public void setReportSynFlag(String reportSynFlag) {
		this.reportSynFlag = reportSynFlag;
	}

	public String getReportSynDt() {
		return reportSynDt;
	}

	public void setReportSynDt(String reportSynDt) {
		this.reportSynDt = reportSynDt;
	}


	public String getDicomSynFlag() {
		return dicomSynFlag;
	}

	public void setDicomSynFlag(String dicomSynFlag) {
		this.dicomSynFlag = dicomSynFlag;
	}

	public String getDicomSynDt() {
		return dicomSynDt;
	}

	public void setDicomSynDt(String dicomSynDt) {
		this.dicomSynDt = dicomSynDt;
	}


	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public String getQrUrl() {
		return qrUrl;
	}

	public void setQrUrl(String qrUrl) {
		this.qrUrl = qrUrl;
	}

	public String getQrImage() {
		return qrImage;
	}

	public void setQrImage(String qrImage) {
		this.qrImage = qrImage;
	}

	//	@Override
//	public String toString() {
//		return "ExamSynRec [applyId=" + applyId + ", synDateTime=" + synDateTime + ", flags=" + flags + "]";
//	}
	
}
