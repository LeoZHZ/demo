package com.example.demo.bean;

/**ExamPatientEntity
 * @author 007
 * @Description 
 * 创建时间  2018年8月17日
 */
public class ExamPatientBean {

//	患者ID	PAT_ID
	 public String patId;
//	身份证号	PAT_IDENTITY
	 public String patIdentity;
//	医保卡号	PAT_SSC_ID
	 public String patSscId;
//	姓名	PAT_NAME

	 public String patName;
//	姓名拼音	PAT_ PHONETIC
	 public String patPhonetic;
//	性别	PAT_SEX

	 public String patSex;
//	出生日期	PAT_BIRTH_DATE
	 public String patBirthDate;
//	国别	PAT_COUNTRY
	 public String patCountry;
//	民族	PAT_NATION
	 public String  patNation;
//	出生地	PAT_BIRTH_PLACE
	 public String patBirthPlace;
//	职业	PAT_PROFESSION
	 public String patProfession;
//	身份	PAT_DEGREE
	 public String patDegree;
//	病人备注	PAT_MEMO
	 public String patMemo;
//	特殊标志	PAT_FLAGS
	 public String patFlags;
	public String getPatId() {
		return patId;
	}
	public void setPatId(String patId) {
		this.patId = patId;
	}
	public String getPatIdentity() {
		return patIdentity;
	}
	public void setPatIdentity(String patIdentity) {
		this.patIdentity = patIdentity;
	}
	public String getPatSscId() {
		return patSscId;
	}
	public void setPatSscId(String patSscId) {
		this.patSscId = patSscId;
	}
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public String getPatPhonetic() {
		return patPhonetic;
	}
	public void setPatPhonetic(String patPhonetic) {
		this.patPhonetic = patPhonetic;
	}
	public String getPatSex() {
		return patSex;
	}
	public void setPatSex(String patSex) {
		this.patSex = patSex;
	}
	public String getPatBirthDate() {
		return patBirthDate;
	}
	public void setPatBirthDate(String patBirthDate) {
		this.patBirthDate = patBirthDate;
	}
	public String getPatCountry() {
		return patCountry;
	}
	public void setPatCountry(String patCountry) {
		this.patCountry = patCountry;
	}
	public String getPatNation() {
		return patNation;
	}
	public void setPatNation(String patNation) {
		this.patNation = patNation;
	}
	public String getPatBirthPlace() {
		return patBirthPlace;
	}
	public void setPatBirthPlace(String patBirthPlace) {
		this.patBirthPlace = patBirthPlace;
	}
	public String getPatProfession() {
		return patProfession;
	}
	public void setPatProfession(String patProfession) {
		this.patProfession = patProfession;
	}
	public String getPatDegree() {
		return patDegree;
	}
	public void setPatDegree(String patDegree) {
		this.patDegree = patDegree;
	}
	public String getPatMemo() {
		return patMemo;
	}
	public void setPatMemo(String patMemo) {
		this.patMemo = patMemo;
	}
	public String getPatFlags() {
		return patFlags;
	}
	public void setPatFlags(String patFlags) {
		this.patFlags = patFlags;
	}
	@Override
	public String toString() {
		return "ExamPatientEntity [patId=" + patId + ", patIdentity=" + patIdentity + ", patSscId=" + patSscId
				+ ", patName=" + patName + ", patPhonetic=" + patPhonetic + ", patSex=" + patSex + ", patBirthDate="
				+ patBirthDate + ", patCountry=" + patCountry + ", patNation=" + patNation + ", patBirthPlace="
				+ patBirthPlace + ", patProfession=" + patProfession + ", patDegree=" + patDegree + ", patMemo="
				+ patMemo + ", patFlags=" + patFlags + "]";
	}

}
