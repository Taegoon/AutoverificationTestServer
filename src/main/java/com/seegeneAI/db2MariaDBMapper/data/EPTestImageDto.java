package com.seegeneAI.db2MariaDBMapper.data;

import java.util.Date;

/**
 * @brief 검사 이미지
 * @author HTG
 * @version 1.00
 * @date 2019.05.20
 * @section MODIFYINFO 수정정보 
 *  - 수정일/수정자 : 수정내역
 *  - 2019.05.20/HTG : 최초작성
 */
public class EPTestImageDto {
    /** 소견코드 */
    private String lmbCode;
    /** 접수일자 */
    private int receiptDate;
    /** 접수번호*/
    private int receiptNo;
    /** 접수번호*/
    private int seq;
    /** 검사코드 */
    private String testCode;
    /** 검사코드 */
    private String testSubCode;
    /** 검체유형코드 */
    private String specimenCode;
    /** 검체유형코드 */
    private String sourcePath;
    /** 검체유형코드 */
    private String storagePath;
    /** 생성일시 */
    private Date   creationDate;
    /** 수정일시 */
    private Date   updateDate;
    /** 사용자ID */
    private String userId;
    
	public EPTestImageDto() {
		super();
		// TODO Auto-generated constructor stub
		this.lmbCode = "";
		this.receiptDate = 0;
		this.receiptNo = 0;
		this.seq = 0;
		this.testCode = "";
		this.testSubCode = "";
		this.specimenCode = "";
		this.sourcePath = "";
		this.storagePath = "";
		this.creationDate = null;
		this.updateDate = null;
		this.userId = "";
	}

	public EPTestImageDto(String lmbCode, int receiptDate, int receiptNo,int seq, String testCode, String testSubCode, String specimenCode,
			String sourcePath, String storagePath, Date creationDate, Date updateDate, String userId) {
		super();
		this.lmbCode = lmbCode;
		this.receiptDate = receiptDate;
		this.receiptNo = receiptNo;
		this.seq = seq;
		this.testCode = testCode;
		this.testSubCode = testSubCode;
		this.specimenCode = specimenCode;
		this.sourcePath = sourcePath;
		this.storagePath = storagePath;
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

	public String getSourcePath() {
		return sourcePath;
	}

	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

	public String getStoragePath() {
		return storagePath;
	}

	public void setStoragePath(String storagePath) {
		this.storagePath = storagePath;
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

	public String getTestSubCode() {
		return testSubCode;
	}

	public void setTestSubCode(String testSubCode) {
		this.testSubCode = testSubCode;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}
    
    
    
    
}
