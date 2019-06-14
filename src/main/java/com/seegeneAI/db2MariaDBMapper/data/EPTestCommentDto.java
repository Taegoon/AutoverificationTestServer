package com.seegeneAI.db2MariaDBMapper.data;

import java.util.Date;
/**
 * @brief 검사 소견
 * @author HTG
 * @version 1.00
 * @date 2019.05.20
 * @section MODIFYINFO 수정정보 
 *  - 수정일/수정자 : 수정내역
 *  - 2019.05.20/HTG : 최초작성
 */
public class EPTestCommentDto {
    /** 소견코드 */
    private String lmbCode;
    /** 접수일자 */
    private int receiptDate;
    /** 접수번호*/
    private int receiptNo;
    /** 검사코드 */
    private String testCode;
    /** 검체유형코드 */
    private String specimenCode;
    /** 소견코드 */
    private String commentCode;
    /** 소견코드 */
    private String comment;
    /** 소견코드 */
    private String commentType;
    /** 생성일시 */
    private Date   creationDate;
    /** 수정일시 */
    private Date   updateDate;
    /** 사용자ID */
    private String userId;
    
	public EPTestCommentDto() {
		super();
		// TODO Auto-generated constructor stub
		this.lmbCode = "";
		this.receiptDate = 0;
		this.receiptNo = 0;
		this.testCode = "";
		this.specimenCode = "";
		this.commentCode = "";
		this.comment = "";
		this.commentType = "";
		this.creationDate = null;
		this.updateDate = null;
		this.userId = "";
	}

	public EPTestCommentDto(String lmbCode, int receiptDate, int receiptNo, String testCode, String specimenCode,
			String commentCode, String comment, String commentType, Date creationDate, Date updateDate, String userId) {
		super();
		this.lmbCode = lmbCode;
		this.receiptDate = receiptDate;
		this.receiptNo = receiptNo;
		this.testCode = testCode;
		this.specimenCode = specimenCode;
		this.commentCode = commentCode;
		this.comment = comment;
		this.commentType = commentType;
		this.creationDate = creationDate;
		this.updateDate = updateDate;
		this.userId = userId;
	}

	public String getLmbCode() {
		return lmbCode;
	}

	public void setLmbCode(String lmbCode) {
		this.lmbCode = lmbCode;
	}

	public int getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(int receiptDate) {
		this.receiptDate = receiptDate;
	}

	public int getReceiptNo() {
		return receiptNo;
	}

	public void setReceiptNo(int receiptNo) {
		this.receiptNo = receiptNo;
	}

	public String getTestCode() {
		return testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	public String getSpecimenCode() {
		return specimenCode;
	}

	public void setSpecimenCode(String specimenCode) {
		this.specimenCode = specimenCode;
	}

	public String getCommentCode() {
		return commentCode;
	}

	public void setCommentCode(String commentCode) {
		this.commentCode = commentCode;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommentType() {
		return commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
    
    
    
    
    
    
    
}
