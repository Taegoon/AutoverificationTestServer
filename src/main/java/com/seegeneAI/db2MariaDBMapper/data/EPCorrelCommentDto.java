package com.seegeneAI.db2MariaDBMapper.data;

import java.util.Date;

/**
 * @brief 연관 결과 소견
 * @author HTG
 * @version 1.00
 * @date 2019.05.20
 * @section MODIFYINFO 수정정보 
 *  - 수정일/수정자 : 수정내역
 *  - 2019.05.20/HTG : 최초작성
 */
public class EPCorrelCommentDto {
	/** 소견코드 */
    private String lmbCode;
    /** 접수일자 */
    private String receiptData;
    /** 접수번호*/
    private int receiptNo;
    /** 검사코드 */
    private String testCode;
    /** 검체유형코드 */
    private String specimenCode;
    /** 조건ID*/
    private int criteriaId;
    /** 이전 LMB코드*/
    private String correlatedLmbCode;
    /** 이전 접수일자*/
    private String correlatedReceiptDate;
    /** 이전 접수번호*/
    private int correlatedReceiptNo;
    /** 이전 검사코드*/
    private String correlatedTestCode;
    /** 이전 검체유형코드*/
    private String correlatedSpecimenCode;
    /** 소견코드 */
    private String correlatedComment;
    /** 생성일시 */
    private Date   creationDate;
    /** 수정일시 */
    private Date   updateDate;
    /** 사용자ID */
    private String userId;
    
	public EPCorrelCommentDto() {
		super();
		// TODO Auto-generated constructor stub
		this.lmbCode = "";
		this.receiptData = "";
		this.receiptNo = 0;
		this.testCode = "";
		this.specimenCode = "";
		this.criteriaId = 0;
		this.correlatedLmbCode = "";
		this.correlatedReceiptDate = "";
		this.correlatedReceiptNo = 0;
		this.correlatedTestCode = "";
		this.correlatedSpecimenCode = "";
		this.correlatedComment = "";
		this.creationDate = null;
		this.updateDate = null;
		this.userId = "";
	}

	public EPCorrelCommentDto(String lmbCode, String receiptData, int receiptNo, String testCode, String specimenCode,
			int criteriaId, String correlatedLmbCode, String correlatedReceiptDate, int correlatedReceiptNo,
			String correlatedTestCode, String correlatedSpecimenCode, String correlatedComment, Date creationDate,
			Date updateDate, String userId) {
		super();
		this.lmbCode = lmbCode;
		this.receiptData = receiptData;
		this.receiptNo = receiptNo;
		this.testCode = testCode;
		this.specimenCode = specimenCode;
		this.criteriaId = criteriaId;
		this.correlatedLmbCode = correlatedLmbCode;
		this.correlatedReceiptDate = correlatedReceiptDate;
		this.correlatedReceiptNo = correlatedReceiptNo;
		this.correlatedTestCode = correlatedTestCode;
		this.correlatedSpecimenCode = correlatedSpecimenCode;
		this.correlatedComment = correlatedComment;
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

	public String getReceiptData() {
		return receiptData;
	}

	public void setReceiptData(String receiptData) {
		this.receiptData = receiptData;
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

	public int getCriteriaId() {
		return criteriaId;
	}

	public void setCriteriaId(int criteriaId) {
		this.criteriaId = criteriaId;
	}

	public String getCorrelatedLmbCode() {
		return correlatedLmbCode;
	}

	public void setCorrelatedLmbCode(String correlatedLmbCode) {
		this.correlatedLmbCode = correlatedLmbCode;
	}

	public String getCorrelatedReceiptDate() {
		return correlatedReceiptDate;
	}

	public void setCorrelatedReceiptDate(String correlatedReceiptDate) {
		this.correlatedReceiptDate = correlatedReceiptDate;
	}

	public int getCorrelatedReceiptNo() {
		return correlatedReceiptNo;
	}

	public void setCorrelatedReceiptNo(int correlatedReceiptNo) {
		this.correlatedReceiptNo = correlatedReceiptNo;
	}

	public String getCorrelatedTestCode() {
		return correlatedTestCode;
	}

	public void setCorrelatedTestCode(String correlatedTestCode) {
		this.correlatedTestCode = correlatedTestCode;
	}

	public String getCorrelatedSpecimenCode() {
		return correlatedSpecimenCode;
	}

	public void setCorrelatedSpecimenCode(String correlatedSpecimenCode) {
		this.correlatedSpecimenCode = correlatedSpecimenCode;
	}

	public String getCorrelatedComment() {
		return correlatedComment;
	}

	public void setCorrelatedComment(String correlatedComment) {
		this.correlatedComment = correlatedComment;
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
