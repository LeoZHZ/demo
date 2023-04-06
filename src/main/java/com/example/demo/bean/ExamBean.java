package com.example.demo.bean;



public class ExamBean {
	/** 检查流水号 */
	String examId;
	/** 送检工作室ID */
	String wrId;
	/** 检查类型 */
	String examEclass;
	/** 病人机构编号 */
	String examOrgPatId;

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String getWrId() {
		return wrId;
	}

	public void setWrId(String wrId) {
		this.wrId = wrId;
	}



	public String getExamOrgPatId() {
		return examOrgPatId;
	}

	public void setExamOrgPatId(String examOrgPatId) {
		this.examOrgPatId = examOrgPatId;
	}

	@Override
	public String toString() {
		return "ExamBean{" +
				"examId='" + examId + '\'' +
				", wrId='" + wrId + '\'' +
				", examEclass='" + examEclass + '\'' +
				", examOrgPatId='" + examOrgPatId + '\'' +
				'}';
	}
}
