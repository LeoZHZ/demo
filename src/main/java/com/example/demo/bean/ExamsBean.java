package com.example.demo.bean;

import java.io.Serializable;

import lombok.Data;
/**
 * ExamEntity
 *
 * @author 007
 * @Description 创建时间  2018年8月17日
 */
@Data
public class ExamsBean implements Serializable {
    //	检查ID	EXAM_ID
    public String examId;
    //申请单号
    public String applyId;
    //	送检单位编号	EXAM_ NO
    public String examNo;
    //	患者ID	PAT_ID
    public String patId;
    //	患者编号	PAT_NO
    public String patNo;
    public String patName;
    //	检查类型	EXAM_CLASS
    public String examClass;
    //	病人来源	PAT_SOURCE
    public String patSource;
    // 检查间
    public String roomId;
    //	门诊号	PAT_OUT_NO
    public String patOutNo;
    //	住院号	PAT_IN_NO
    public String patInNo;
    //体检号
    public String patPhyNo;
    //借检号
    public String patLendNo;

    //	检查级别	EXAM_LEVEL
    public String examLevel;
    //	影像年龄	PAT_AGE
    public String patAge;
    //	影像性别	PAT_SEX
    public String patSex;
    //  检查部位

    public String examDt;
    //	身高	PAT_HEIGHT
    public String patHeight;
    //	体重	PAT_WEIGHT
    public String patWeight;
    //	床号	BED_NO
    public String bedNo;
    //	通信地址	PAT_ADDRESS
    public String patAddress;
    //	联系电话	PAT_PHONE
    public String patPhone;
    //	申请科室名称	CLIN_DEPT
    public String clinDept;
    //	申请医生	CLIN_DOC
    public String clinDoc;
    //	临床症状	CLIN_SYMP
    public String clinSymp;
    //	临床诊断	CLIN_DIAG
    public String clinDiag;
    //	检查目的	EXAM_NOTICE
    public String examNotice;
    //	申请备注	EXAM_MEMO
    public String examMemo;
    //	申请日期	REQ_DT
    public String reqDt;
    //	检查次数	EXAM_COUNT
    public Integer examCount;
    //  检查颜色
    public String examColor;
    //	检查费用	EXAM_PRICE
    public String examPrice;
    //	标志	EXAM_STATUS
    public String examStatus;
    //	危机值	EXAM_RISKS
    public String examRisks;
    //	锁定状态	LOCKED_FLAGS
    public String lockedFlags;
    //	锁定者ID	LOCKED_USER_ID
    public String lockedUserId;
    //	锁定者用户名	LOCKED_USER_NAME
    public String lockedUserName;
    //	锁定时间	LOCKED_DT
    public String lockedDt;
    //	执行科室ID 	EXECUTE_DEPT_ID

    public String executeDeptId;
    public String executeDeptCode;
    //	执行科室名称 	EXECUTE_DEPT_NAME
    public String executeDeptName;
    //	执行医生ID 	EXECUTE_USER_ID
    public String executeUserId;
    //	执行医生姓名 	EXECUTE_USER_NAME
    public String executeUserName;
    //	放射云ID	FSY_ID
    public String fsyId;
    //	是否传输上云	FSY_FLAGS
    public String fsyFlags;
    //	传输上云的状态	FSY_STATUS
    public String fsyStatus;
    //HIS登记标志(默认0)
    public String hisStatus = "0";
    public String subApplyId;
    public String itemCode;
    public String dicomFlag;
    public String roomName;


}
