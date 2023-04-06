package com.example.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**ExamItemsEntity
 * @author 007
 * @Description 
 * 创建时间  2018年8月17日
 */
public class ExamItemsBean implements Serializable {
	private static final long serialVersionUID = 1L;
//	检查ID	EXAM_ID
	private String examId;
//	项目序号	ITEM_NO

	private String itemNo;
//	项目编号	ITEM_CODE
	private String itemCode;
//	项目名称	ITEM_NAME

	private String itemName;
//	项目费用	ITEM_PRICE
	private BigDecimal itemPrice;
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public BigDecimal getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(BigDecimal itemPrice) {
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "ExamItemsEntity [examId=" + examId + ", itemNo=" + itemNo + ", itemCode=" + itemCode + ", itemName="
				+ itemName + ", itemPrice=" + itemPrice + "]";
	}

}
