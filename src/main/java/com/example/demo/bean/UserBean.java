package com.example.demo.bean;

import java.io.Serializable;
import java.util.List;


/**
 * UserBean
 *
 * @author 007
 * @Description 创建时间  2018年8月20日
 */
public class UserBean implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     *
     */

    /**
     * 用户ID	USER_ID
     * 登陆ID	USER_LOGIN_ID
     * 用户密码	USER_PWD
     * 姓名	USER_NAME
     * 别名	USER_ALIAS
     * 出生日期	USER_BIRTH_DATE
     * 性别	USER_SEX
     * 证件ID	USER_ID_NO
     * 证件类型	USER_ID_TYPE
     * 建立日期	USER_CREATE_DT
     * 现实头衔	USER_TITLE
     * 用户QQ号	USER_QQ_NO
     * 用户邮件地址	USER_EMAIL_ADDR
     * 用户微信号	USER_WECHAT_NO
     * 用户通信地址	USER_ADDRESS
     * 用户联系电话	USER_PHONE
     * 用户照片	USER_PHOTO
     * 用户头像	USER_IMG
     * 用户介绍	USER_MEMO
     * 签名图片	USER_SIGN
     * 登陆累计	LOGIN_CNT
     * 最后登陆日期	LOGIN_LAST_DT
     * 标志	USER_FLAGS
     * 放射云账号	FSY_LOGIN_ID
     */
    private String userId;
    private String userLoginId;
    private String userPwd;
    private String userName;
    private String userAlias;
    private String userBirthDate;
    private String userSex;
    private String userIdNo;
    private String userIdType;
    private String userCreateDt;
    private String userTitle;
    private String userQqNo;
    private String userEmailAddr;
    private String userWechatNo;
    private String userAddress;
    private String userPhone;
    private String userPhoto;
    private String userImg;
    private String userMemo;
    private String userSign;
    private int loginCnt;
    private String loginLastDt;
    private String userFlags;
    private String fsyLoginId;
    private String userRole;
    private  int errCnt;
    private String lockTime;
    String passwordUpdateTime;
String userDeptName;

    public String getUserDeptName() {
        return userDeptName;
    }

    public void setUserDeptName(String userDeptName) {
        this.userDeptName = userDeptName;
    }

    public String getPasswordUpdateTime() {
        return passwordUpdateTime;
    }

    public void setPasswordUpdateTime(String passwordUpdateTime) {
        this.passwordUpdateTime = passwordUpdateTime;
    }

    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime;
    }

    public int  getErrCnt() {
        return errCnt;
    }

    public void setErrCnt(int errCnt) {
        this.errCnt = errCnt;
    }

    public UserBean() {
    }

    public UserBean(String userLoginId, String userPwd) {
        this.userLoginId = userLoginId;
        this.userPwd = userPwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getUserPwd() {
        //return FunCommon.Encrypt(userPwd);
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public String getUserBirthDate() {
        return userBirthDate;
    }

    public void setUserBirthDate(String userBirthDate) {
        this.userBirthDate = userBirthDate;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserIdNo() {
        return userIdNo;
    }

    public void setUserIdNo(String userIdNo) {
        this.userIdNo = userIdNo;
    }

    public String getUserIdType() {
        return userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getUserCreateDt() {
        return userCreateDt;
    }

    public void setUserCreateDt(String userCreateDt) {
        this.userCreateDt = userCreateDt;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public String getUserQqNo() {
        return userQqNo;
    }

    public void setUserQqNo(String userQqNo) {
        this.userQqNo = userQqNo;
    }

    public String getUserEmailAddr() {
        return userEmailAddr;
    }

    public void setUserEmailAddr(String userEmailAddr) {
        this.userEmailAddr = userEmailAddr;
    }

    public String getUserWechatNo() {
        return userWechatNo;
    }

    public void setUserWechatNo(String userWechatNo) {
        this.userWechatNo = userWechatNo;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserMemo() {
        return userMemo;
    }

    public void setUserMemo(String userMemo) {
        this.userMemo = userMemo;
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    public int getLoginCnt() {
        return loginCnt;
    }

    public void setLoginCnt(int loginCnt) {
        this.loginCnt = loginCnt;
    }

    public String getLoginLastDt() {
        if (loginLastDt == null || loginLastDt.equals("") || loginLastDt.length() < 19) {
            return loginLastDt;
        }
        return loginLastDt.substring(0, 19);
    }

    public void setLoginLastDt(String loginLastDt) {
        this.loginLastDt = loginLastDt;
    }

    public String getUserFlags() {
        return userFlags;
    }

    public void setUserFlags(String userFlags) {
        this.userFlags = userFlags;
    }

    public String getFsyLoginId() {
        return fsyLoginId;
    }

    public void setFsyLoginId(String fsyLoginId) {
        this.fsyLoginId = fsyLoginId;
    }


    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                ", userName='" + userName + '\'' +
                ", userDeptName='" + userDeptName + '\'' +
                '}';
    }


}
