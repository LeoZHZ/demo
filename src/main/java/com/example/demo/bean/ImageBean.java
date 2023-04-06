package com.example.demo.bean;

public class ImageBean {
	/** 图像唯一号 */
	String imageUid;
	/** 检查序号 */
	String studyId;
	/** 序列唯一号 */
	String seriesUid;
	/** 检查号 */
	String examId;
	/** 图像号 */
	String imageNumber;
	/** 序列号 */
	String seriesNumber;
	/** 文件名 */
	String imageFileName;
	/** 文件大小 */
	Integer imageFileSize;
	/** 标记 */
	Integer imageFlag;
	/** 文件路径 */
	String imagePath;

	Integer imageWindowCenter;

	Integer imageWindowWidth;


   	String imageReportFlag;
	String imageKeyFlag;
   	String imagePrivateFlag;

	public ImageBean(){}
	
	public String getImageUid() {
		return imageUid;
	}
	public void setImageUid(String imageUid) {
		this.imageUid = imageUid;
	}
	public String getStudyId() {
		return studyId;
	}
	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}
	public String getSeriesUid() {
		return seriesUid;
	}
	public void setSeriesUid(String seriesUid) {
		this.seriesUid = seriesUid;
	}
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	public String getImageNumber() {
		return imageNumber;
	}
	public void setImageNumber(String imageNumber) {
		if(imageNumber!=null){
			Integer len=imageNumber.length();
			if(len>8){
				this.imageNumber = imageNumber.substring((len-8),len);
			}else {
				this.imageNumber = imageNumber;
			}
		}
	}
	public String getSeriesNumber() {
		return seriesNumber;
	}
	public void setSeriesNumber(String seriesNumber) {
		this.seriesNumber = seriesNumber;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public Integer getImageFileSize() {
		return imageFileSize;
	}
	public void setImageFileSize(Integer imageFileSize) {
		this.imageFileSize = imageFileSize;
	}
	public Integer getImageFlag() {
		return imageFlag;
	}
	public void setImageFlag(Integer imageFlag) {
		this.imageFlag = imageFlag;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Integer getImageWindowCenter() {
		return imageWindowCenter;
	}
	public void setImageWindowCenter(Integer imageWindowCenter) {
		this.imageWindowCenter = imageWindowCenter;
	}
	public Integer getImageWindowWidth() {
		return imageWindowWidth;
	}
	public void setImageWindowWidth(Integer imageWindowWidth) {
		this.imageWindowWidth = imageWindowWidth;
	}

	public String getImageReportFlag() {
		return imageReportFlag;
	}
	public void setImageReportFlag(String imageReportFlag) {
		this.imageReportFlag = imageReportFlag;
	}
	
	public String getImageKeyFlag() {
		return imageKeyFlag;
	}
	public void setImageKeyFlag(String imageKeyFlag) {
		this.imageKeyFlag = imageKeyFlag;
	}
	
	public String getImagePrivateFlag() {
		return imagePrivateFlag;
	}
	public void setImagePrivateFlag(String imagePrivateFlag) {
		this.imagePrivateFlag = imagePrivateFlag;
	}

	@Override
	public String toString() {
		return "ImageBean{" +
				"imageUid='" + imageUid + '\'' +
				", studyId='" + studyId + '\'' +
				", seriesUid='" + seriesUid + '\'' +
				", examId='" + examId + '\'' +
				", imageNumber='" + imageNumber + '\'' +
				", seriesNumber='" + seriesNumber + '\'' +
				", imageFileName='" + imageFileName + '\'' +
				", imageFileSize=" + imageFileSize +
				", imageFlag=" + imageFlag +
				", imagePath='" + imagePath + '\'' +
				", imageWindowCenter=" + imageWindowCenter +
				", imageWindowWidth=" + imageWindowWidth +
				", imageReportFlag='" + imageReportFlag + '\'' +
				", imageKeyFlag='" + imageKeyFlag + '\'' +
				", imagePrivateFlag='" + imagePrivateFlag + '\'' +
				'}';
	}
}
