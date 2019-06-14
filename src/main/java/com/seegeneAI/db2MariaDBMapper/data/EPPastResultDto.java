package com.seegeneAI.db2MariaDBMapper.data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
/**
 * @brief 이전 결과
 * @author HTG
 * @version 1.00
 * @date 2019.05.20
 * @section MODIFYINFO 수정정보 
 *  - 수정일/수정자 : 수정내역
 *  - 2019.05.20/HTG : 최초작성
 */
public class EPPastResultDto {

    /** LMB코드 */
    private String lmbCode;
    /** 접수일자 */
    private int receiptDate;
    /** 접수번호 */
    private int    receiptNo;
    /** 검사코드 */
    private String testCode;
    /** 검체유형코드 */
    private String specimenCode;
    /** 조건ID*/
    private int criteriaId;
    /** 이전 LMB코드*/
    private String pastLmbCode;
    /** 이전 접수일자*/
    private int pastReceiptDate;
    /** 이전 접수번호*/
    private int pastReceiptNo;
    /** 이전 검사코드*/
    private String pastTestCode;
    /** 이전 검체유형코드*/
    private String pastSpecimenCode;
    /** 이전 부속코드*/
    private String pastTestSubCode;
    /** 이전 검사명*/
    private String pastTestName;
    /** 이전 검체명*/
    private String pastSpecimenName;
    /** 이전 작업명*/
    private String pastWorkName;
    /** 이전 검사학부코드*/
    private String pastDepartmentCode;
    /** 이전 검사학부명*/
    private String pastDepartmentName;
    /** 이전 문자검사*/
    private String pastChrResult;
    /** 이전 결과유형*/
    private BigDecimal pastNumArea;
    /** 이전 수치결과*/
    private BigDecimal pastNumConc;
    /** 이전 수치결과*/
    private BigDecimal pastNumFromEqpt;
    /** 생성일시 */
    private Date   creationDate;
    /** 수정일시 */
    private Date   updateDate;
    /** 사용자ID */
    private String userId;
    
	public EPPastResultDto() {
		super();
		// TODO Auto-generated constructor stub
		this.lmbCode = "";
		this.receiptDate = 0;
		this.receiptNo = 0;
		this.testCode = "";
		this.specimenCode = "";
		this.criteriaId = 0;
		this.pastLmbCode = "";
		this.pastReceiptDate = 0;
		this.pastReceiptNo = 0;
		this.pastTestCode = "";
		this.pastSpecimenCode = "";
		this.pastTestSubCode = "";
		this.pastTestName = "";
		this.pastSpecimenName = "";
		this.pastWorkName = "";
		this.pastDepartmentCode = "";
		this.pastDepartmentName = "";
		this.pastChrResult = "";
		this.pastNumArea = null;
		this.pastNumConc = null;
		this.pastNumFromEqpt = null;
		this.creationDate = null;
		this.updateDate = null;
		this.userId = "";
	}

	
	
    
	public EPPastResultDto(String lmbCode, int receiptDate, int receiptNo, String testCode, String specimenCode,
			int criteriaId, String pastLmbCode, int pastReceiptDate, int pastReceiptNo, String pastTestCode,
			String pastSpecimenCode, String pastTestSubCode, String pastTestName, String pastSpecimenName,
			String pastWorkName, String pastDepartmentCode, String pastDepartmentName,String pastChrResult, BigDecimal pastNumArea,
			BigDecimal pastNumConc,BigDecimal pastNumFromEqpt, Date creationDate, Date updateDate, String userId) {
		super();
		this.lmbCode = lmbCode;
		this.receiptDate = receiptDate;
		this.receiptNo = receiptNo;
		this.testCode = testCode;
		this.specimenCode = specimenCode;
		this.criteriaId = criteriaId;
		this.pastLmbCode = pastLmbCode;
		this.pastReceiptDate = pastReceiptDate;
		this.pastReceiptNo = pastReceiptNo;
		this.pastTestCode = pastTestCode;
		this.pastSpecimenCode = pastSpecimenCode;
		this.pastTestSubCode = pastTestSubCode;
		this.pastTestName = pastTestName;
		this.pastSpecimenName = pastSpecimenName;
		this.pastWorkName = pastWorkName;
		this.pastDepartmentCode = pastDepartmentCode;
		this.pastDepartmentName = pastDepartmentName;
		this.pastChrResult = pastChrResult;
		this.pastNumArea = pastNumArea;
		this.pastNumConc = pastNumConc;
		this.pastNumFromEqpt = pastNumFromEqpt;
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


	public int getPastReceiptDate() {
		return pastReceiptDate;
	}


	public void setPastReceiptDate(int pastReceiptDate) {
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


	public String getPastTestSubCode() {
		return pastTestSubCode;
	}


	public void setPastTestSubCode(String pastTestSubCode) {
		this.pastTestSubCode = pastTestSubCode;
	}


	public String getPastTestName() {
		return pastTestName;
	}


	public void setPastTestName(String pastTestName) {
		this.pastTestName = pastTestName;
	}


	public String getPastSpecimenName() {
		return pastSpecimenName;
	}


	public void setPastSpecimenName(String pastSpecimenName) {
		this.pastSpecimenName = pastSpecimenName;
	}


	public String getPastWorkName() {
		return pastWorkName;
	}


	public void setPastWorkName(String pastWorkName) {
		this.pastWorkName = pastWorkName;
	}


	public String getPastDepartmentCode() {
		return pastDepartmentCode;
	}


	public void setPastDepartmentCode(String pastDepartmentCode) {
		this.pastDepartmentCode = pastDepartmentCode;
	}


	public String getPastDepartmentName() {
		return pastDepartmentName;
	}


	public void setPastDepartmentName(String pastDepartmentName) {
		this.pastDepartmentName = pastDepartmentName;
	}
	public String getPastChrResult() {
		return pastChrResult;
	}
	
	
	public void setPastChrResult(String pastChrResult) {
		this.pastChrResult = pastChrResult;
	}


	public BigDecimal getPastNumArea() {
		return pastNumArea;
	}


	public void setPastNumArea(BigDecimal pastNumArea) {
		this.pastNumArea = pastNumArea;
	}


	public BigDecimal getPastNumConc() {
		return pastNumConc;
	}


	public void setPastNumConc(BigDecimal pastNumConc) {
		this.pastNumConc = pastNumConc;
	}
	public BigDecimal getPastNumFromEqpt() {
		return pastNumFromEqpt;
	}
	
	
	public void setPastNumFromEqpt(BigDecimal pastNumFromEqpt) {
		this.pastNumFromEqpt = pastNumFromEqpt;
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


	@Override
    public int hashCode()
    {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.lmbCode);
        hash = 31 * hash + this.receiptDate;
        hash = 31 * hash + this.receiptNo;
        hash = 31 * hash + Objects.hashCode(this.testCode);
        hash = 31 * hash + Objects.hashCode(this.specimenCode);
        hash = 31 * hash + this.criteriaId;
        hash = 31 * hash + Objects.hashCode(this.pastLmbCode);
        hash = 31 * hash + this.pastReceiptDate;
        hash = 31 * hash + this.pastReceiptNo ;
        hash = 31 * hash + Objects.hashCode(this.pastTestCode );
        hash = 31 * hash + Objects.hashCode(this.pastSpecimenCode );
        hash = 31 * hash + Objects.hashCode(this.pastTestSubCode );
        hash = 31 * hash + Objects.hashCode(this.pastTestName );
        hash = 31 * hash + Objects.hashCode(this.pastSpecimenName );
        hash = 31 * hash + Objects.hashCode(this.pastWorkName );
        hash = 31 * hash + Objects.hashCode(this.pastDepartmentCode );
        hash = 31 * hash + Objects.hashCode(this.pastDepartmentName );
        hash = 31 * hash + Objects.hashCode(this.pastChrResult );
        hash = 31 * hash + Objects.hashCode(this.pastNumArea );
        hash = 31 * hash + Objects.hashCode(this.pastNumConc );
        hash = 31 * hash + Objects.hashCode(this.pastNumFromEqpt );
        hash = 31 * hash + Objects.hashCode(this.creationDate);
        hash = 31 * hash + Objects.hashCode(this.updateDate);
        hash = 31 * hash + Objects.hashCode(this.userId);
        return hash;
    }
    
    
	@Override
    public boolean equals(Object obj)
    {
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }

        final EPPastResultDto other = (EPPastResultDto)obj;
        if (!Objects.equals(this.lmbCode, other.lmbCode)) { return false; }
        if (this.receiptDate != other.receiptDate) { return false; }
        if (this.receiptNo != other.receiptNo) { return false; }
        if (!Objects.equals(this.testCode, other.testCode)) { return false; }
        if (!Objects.equals(this.specimenCode, other.specimenCode)) { return false; }
        if (!Objects.equals(this.criteriaId , other.criteriaId )) { return false; }
        if (!Objects.equals(this.pastLmbCode , other.pastLmbCode )) { return false; }
        if (this.pastReceiptDate != other.pastReceiptDate) { return false; }
        if (!Objects.equals(this.pastReceiptNo , other.pastReceiptNo )) { return false; }
        if (!Objects.equals(this.pastTestCode , other.pastTestCode )) { return false; }
        if (!Objects.equals(this.pastSpecimenCode , other.pastSpecimenCode )) { return false; }
        if (!Objects.equals(this.pastTestSubCode , other.pastTestSubCode )) { return false; }
        return true;
    }
    
    
    
}