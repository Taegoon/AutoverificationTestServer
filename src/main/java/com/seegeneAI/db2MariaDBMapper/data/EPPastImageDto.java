package com.seegeneAI.db2MariaDBMapper.data;

import java.util.Date;
/**
 * @brief 이전 결과 이미지
 * @author HTG
 * @version 1.00
 * @date 2019.05.20
 * @section MODIFYINFO 수정정보 
 *  - 수정일/수정자 : 수정내역
 *  - 2019.05.20/HTG : 최초작성
 */
public class EPPastImageDto {

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
    private String pastLmbCode;
    /** 이전 접수일자*/
    private String pastReceiptDate;
    /** 이전 접수번호*/
    private int pastReceiptNo;
    /** 이전 검사코드*/
    private String pastTestCode;
    /** 이전 검체유형코드*/
    private String pastSpecimenCode;
    /** 검체유형코드 */
    private String pastSourcePath;
    /** 검체유형코드 */
    private String pastStoragePath;
    /** 생성일시 */
    private Date   creationDate;
    /** 수정일시 */
    private Date   updateDate;
    /** 사용자ID */
    private String userId;
    
	public EPPastImageDto() {
		super();
		// TODO Auto-generated constructor stub
		this.lmbCode = "";
		this.receiptData = "";
		this.receiptNo = 0;
		this.testCode = "";
		this.specimenCode = "";
		this.criteriaId = 0;
		this.pastLmbCode = "";
		this.pastReceiptDate = "";
		this.pastReceiptNo = 0;
		this.pastTestCode = "";
		this.pastSpecimenCode = "";
		this.pastSourcePath = "";
		this.pastStoragePath = "";
		this.creationDate = null;
		this.updateDate = null;
		this.userId = "";
	}
	
	public EPPastImageDto(String lmbCode, String receiptData, int receiptNo, String testCode, String specimenCode,
			int criteriaId, String pastLmbCode, String pastReceiptDate, int pastReceiptNo, String pastTestCode,
			String pastSpecimenCode, String pastSourcePath, String pastStoragePath, Date creationDate, Date updateDate,
			String userId) {
		super();
		this.lmbCode = lmbCode;
		this.receiptData = receiptData;
		this.receiptNo = receiptNo;
		this.testCode = testCode;
		this.specimenCode = specimenCode;
		this.criteriaId = criteriaId;
		this.pastLmbCode = pastLmbCode;
		this.pastReceiptDate = pastReceiptDate;
		this.pastReceiptNo = pastReceiptNo;
		this.pastTestCode = pastTestCode;
		this.pastSpecimenCode = pastSpecimenCode;
		this.pastSourcePath = pastSourcePath;
		this.pastStoragePath = pastStoragePath;
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

	public String getPastLmbCode() {
		return pastLmbCode;
	}

	public void setPastLmbCode(String pastLmbCode) {
		this.pastLmbCode = pastLmbCode;
	}

	public String getPastReceiptDate() {
		return pastReceiptDate;
	}

	public void setPastReceiptDate(String pastReceiptDate) {
		this.pastReceiptDate = pastReceiptDate;
	}

	public int getPastReceiptNo() {
		return pastReceiptNo;
	}

	public void setPastReceiptNo(int pastReceiptNo) {
		this.pastReceiptNo = pastReceiptNo;
	}

	public String getPastTestCode() {
		return pastTestCode;
	}

	public void setPastTestCode(String pastTestCode) {
		this.pastTestCode = pastTestCode;
	}

	public String getPastSpecimenCode() {
		return pastSpecimenCode;
	}

	public void setPastSpecimenCode(String pastSpecimenCode) {
		this.pastSpecimenCode = pastSpecimenCode;
	}

	public String getPastSourcePath() {
		return pastSourcePath;
	}

	public void setPastSourcePath(String pastSourcePath) {
		this.pastSourcePath = pastSourcePath;
	}

	public String getPastStoragePath() {
		return pastStoragePath;
	}

	public void setPastStoragePath(String pastStoragePath) {
		this.pastStoragePath = pastStoragePath;
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
