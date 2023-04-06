package com.example.demo.bean;

public class ServerBean {
	/** 服务器ID */
	String serverId;
	/** 公网IP */
	String serverIp;
	/** 公网域名 */
	String serverDomainName;
	/** 内网IP */
	String serverPrivateIp;
	/** 计算机名称 */
	String serverName;
	/** 图像地址 */
	String serverSharePath;
	/** 图像目录 */
	String serverShareName;
	/** 服务器说明 */
	String serverNote;
	/** 级别 */
	Integer serverLevel;
	/** 状态 */
	String serverStatus;
	/** 存储空间 */
	Integer serverSpaceSize;
	/** 存储已用空间 */
	Integer serverUseSpace;
	/** 存储空间报警线 */
	Integer serverAlarmLine;
	/** 公网传输模式 */
	String serverTransferMode;
	/** 内网传输模式 */
	String serverPrivateMode;
	/** 备份服务器ID */
	String bakServerId;
	/** 只读用户 */
	String serverReadUser;
	/** 只读密码 */
	String serverReadPwd;
	/** 可读写用户 */
	String serverWriteUser;
	/** 可读写密码 */
	String serverWritePwd;
	/** 服务器所在地 */
	String serverAddress;
	/** 标志 */
	String serverFlag;
	/** 服务上线日期 */
	String serverOnlineDate;
	/** '服务上线时间 */
	String serverOnlineTime;
	/** 服务下线日期 */
	String serverOfflineDate;
	/** 服务下线时间 */
	String serverOffLineTime;
	/** 服务的端口*/
	String serverPort;
	
	/** tomcat服务端口 */
	String serverWsPort;

	/**
	 * 服务器请求协议
	 * @return
	 */
	String serverProtocol;

	public String getServerPort() {
		return serverPort;
	}
	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}
	
	public String getServerSharePath() {
		return serverSharePath;
	}
	public void setServerSharePath(String serverSharePath) {
		this.serverSharePath = serverSharePath;
	}
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public String getServerIp() {
		return serverIp;
	}
	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}
	public String getServerDomainName() {
		return serverDomainName;
	}
	public void setServerDomainName(String serverDomainName) {
		this.serverDomainName = serverDomainName;
	}
	public String getServerPrivateIp() {
		return serverPrivateIp;
	}
	public void setServerPrivateIp(String serverPrivateIp) {
		this.serverPrivateIp = serverPrivateIp;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getServerShareName() {
		return serverShareName;
	}
	public void setServerShareName(String serverShareName) {
		this.serverShareName = serverShareName;
	}
	public String getServerNote() {
		return serverNote;
	}
	public void setServerNote(String serverNote) {
		this.serverNote = serverNote;
	}
	public Integer getServerLevel() {
		return serverLevel;
	}
	public void setServerLevel(Integer serverLevel) {
		this.serverLevel = serverLevel;
	}
	public String getServerStatus() {
		return serverStatus;
	}
	public void setServerStatus(String serverStatus) {
		this.serverStatus = serverStatus;
	}
	public Integer getServerSpaceSize() {
		return serverSpaceSize;
	}
	public void setServerSpaceSize(Integer serverSpaceSize) {
		this.serverSpaceSize = serverSpaceSize;
	}
	public Integer getServerUseSpace() {
		return serverUseSpace;
	}
	public void setServerUseSpace(Integer serverUseSpace) {
		this.serverUseSpace = serverUseSpace;
	}
	public Integer getServerAlarmLine() {
		return serverAlarmLine;
	}
	public void setServerAlarmLine(Integer serverAlarmLine) {
		this.serverAlarmLine = serverAlarmLine;
	}
	public String getServerTransferMode() {
		return serverTransferMode;
	}
	public void setServerTransferMode(String serverTransferMode) {
		this.serverTransferMode = serverTransferMode;
	}
	public String getServerPrivateMode() {
		return serverPrivateMode;
	}
	public void setServerPrivateMode(String serverPrivateMode) {
		this.serverPrivateMode = serverPrivateMode;
	}
	public String getBakServerId() {
		return bakServerId;
	}
	public void setBakServerId(String bakServerId) {
		this.bakServerId = bakServerId;
	}
	public String getServerReadUser() {
		return serverReadUser;
	}
	public void setServerReadUser(String serverReadUser) {
		this.serverReadUser = serverReadUser;
	}
	public String getServerReadPwd() {
		return serverReadPwd;
	}
	public void setServerReadPwd(String serverReadPwd) {
		this.serverReadPwd = serverReadPwd;
	}
	public String getServerWriteUser() {
		return serverWriteUser;
	}
	public void setServerWriteUser(String serverWriteUser) {
		this.serverWriteUser = serverWriteUser;
	}
	public String getServerWritePwd() {
		return serverWritePwd;
	}
	public void setServerWritePwd(String serverWritePwd) {
		this.serverWritePwd = serverWritePwd;
	}
	public String getServerAddress() {
		return serverAddress;
	}
	public void setServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
	}
	public String getServerFlag() {
		return serverFlag;
	}
	public void setServerFlag(String serverFlag) {
		this.serverFlag = serverFlag;
	}
	public String getServerOnlineDate() {
		return serverOnlineDate;
	}
	public void setServerOnlineDate(String serverOnlineDate) {
		this.serverOnlineDate = serverOnlineDate;
	}
	public String getServerOnlineTime() {
		return serverOnlineTime;
	}
	public void setServerOnlineTime(String serverOnlineTime) {
		this.serverOnlineTime = serverOnlineTime;
	}
	public String getServerOfflineDate() {
		return serverOfflineDate;
	}
	public void setServerOfflineDate(String serverOfflineDate) {
		this.serverOfflineDate = serverOfflineDate;
	}
	public String getServerOffLineTime() {
		return serverOffLineTime;
	}
	public void setServerOffLineTime(String serverOffLineTime) {
		this.serverOffLineTime = serverOffLineTime;
	}
	public String getServerWsPort() {
		return serverWsPort;
	}
	public void setServerWsPort(String serverWsPort) {
		this.serverWsPort = serverWsPort;
	}

	public String getServerProtocol() {
		return serverProtocol;
	}

	public void setServerProtocol(String serverProtocol) {
		this.serverProtocol = serverProtocol;
	}

	@Override
	public String toString() {
		return "ServerBean{" +
				"serverId='" + serverId + '\'' +
				", serverIp='" + serverIp + '\'' +
				", serverDomainName='" + serverDomainName + '\'' +
				", serverPrivateIp='" + serverPrivateIp + '\'' +
				", serverName='" + serverName + '\'' +
				", serverSharePath='" + serverSharePath + '\'' +
				", serverShareName='" + serverShareName + '\'' +
				", serverNote='" + serverNote + '\'' +
				", serverLevel=" + serverLevel +
				", serverStatus='" + serverStatus + '\'' +
				", serverSpaceSize=" + serverSpaceSize +
				", serverUseSpace=" + serverUseSpace +
				", serverAlarmLine=" + serverAlarmLine +
				", serverTransferMode='" + serverTransferMode + '\'' +
				", serverPrivateMode='" + serverPrivateMode + '\'' +
				", bakServerId='" + bakServerId + '\'' +
				", serverReadUser='" + serverReadUser + '\'' +
				", serverReadPwd='" + serverReadPwd + '\'' +
				", serverWriteUser='" + serverWriteUser + '\'' +
				", serverWritePwd='" + serverWritePwd + '\'' +
				", serverAddress='" + serverAddress + '\'' +
				", serverFlag='" + serverFlag + '\'' +
				", serverOnlineDate='" + serverOnlineDate + '\'' +
				", serverOnlineTime='" + serverOnlineTime + '\'' +
				", serverOfflineDate='" + serverOfflineDate + '\'' +
				", serverOffLineTime='" + serverOffLineTime + '\'' +
				", serverPort='" + serverPort + '\'' +
				", serverWsPort='" + serverWsPort + '\'' +
				", serverProtocol='" + serverProtocol + '\'' +
				'}';
	}
}
