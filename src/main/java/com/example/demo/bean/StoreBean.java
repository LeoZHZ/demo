package com.example.demo.bean;



/**
 * 影像资源存储位置
 * @author Administrator
 *
 */
public class StoreBean {
	/** 流水号 */
	String storeId;
	/** 所在服务器ID */
	String serverId;
	/** 影像资源ID */
	String studyId;
	/** 资源大小 */
	Integer storeSize;
	/** 级别 */
	Integer storeLevel;
	/** 读取次数 */
	Integer storeReadCnt;
	/** 上传日期 */
	String storeDate;
	/** 上传时间 */
	String storeTime;
	/** 存储路径 */
	String storePath;
	/** 在线标识 */
	String storeOnlineFlag;
	/** 上传类型：1:离线;0:在线 */
	String storeUploadType;
	public String getStorePath() {
		return storePath;
	}
	public void setStorePath(String storePath) {
		this.storePath = storePath;
	}
	public String getStoreOnlineFlag() {
		return storeOnlineFlag;
	}
	public void setStoreOnlineFlag(String storeOnlineFlag) {
		this.storeOnlineFlag = storeOnlineFlag;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public String getStudyId() {
		return studyId;
	}
	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}
	public Integer getStoreSize() {
		return storeSize;
	}
	public void setStoreSize(Integer storeSize) {
		this.storeSize = storeSize;
	}
	public Integer getStoreLevel() {
		return storeLevel;
	}
	public void setStoreLevel(Integer storeLevel) {
		this.storeLevel = storeLevel;
	}
	public Integer getStoreReadCnt() {
		return storeReadCnt;
	}
	public void setStoreReadCnt(Integer storeReadCnt) {
		this.storeReadCnt = storeReadCnt;
	}
	public String getStoreDate() {
		return storeDate;
	}
	public void setStoreDate(String storeDate) {
		this.storeDate = storeDate;
	}
	public String getStoreTime() {
		return storeTime;
	}
	public void setStoreTime(String storeTime) {
		this.storeTime = storeTime;
	}
	public String getStoreUploadType() {
		return storeUploadType;
	}
	public void setStoreUploadType(String storeUploadType) {
		this.storeUploadType = storeUploadType;
	}

	@Override
	public String toString() {
		return "StoreBean{" +
				"storeId='" + storeId + '\'' +
				", serverId='" + serverId + '\'' +
				", studyId='" + studyId + '\'' +
				", storeSize=" + storeSize +
				", storeLevel=" + storeLevel +
				", storeReadCnt=" + storeReadCnt +
				", storeDate='" + storeDate + '\'' +
				", storeTime='" + storeTime + '\'' +
				", storePath='" + storePath + '\'' +
				", storeOnlineFlag='" + storeOnlineFlag + '\'' +
				", storeUploadType='" + storeUploadType + '\'' +
				'}';
	}
}
