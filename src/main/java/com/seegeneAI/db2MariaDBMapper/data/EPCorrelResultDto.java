package com.seegeneAI.db2MariaDBMapper.data;

import java.util.Date;
import java.util.Objects;


/**
 * @brief 연관 검사
 * @author HTG
 * @version 1.00
 * @date 2019.05.17
 * @section MODIFYINFO 수정정보 
 *  - 수정일/수정자 : 수정내역
 *  - 2019.05.17/HTG : 최초작성
 */
public class EPCorrelResultDto {

    /** LMB코드 */
    private String lmbCode;
    /** 접수일자 */
    private String receiptDate;
    /** 접수번호 */
    private int    receiptNo;
    /** 검사코드 */
    private String testCode;
    /** 검체유형코드 */
    private String specimenCode;
    /** 조건ID*/
    private int criteriaId;
    /** 연관 LMB코드*/
    private String correlatedLmbCode;
    /** 연관 접수일자*/
    private String correlatedReceiptDate;
    /** 연관 접수번호*/
    private int correlatedReceiptNo;
    /** 연관 검사코드*/
    private String correlatedTestCode;
    /** 연관 검체유형코드*/
    private String correlatedSpecimenCode;
    /** 연관 부속코드*/
    private String correlatedTestSubCode;
    /** 연관 검사명*/
    private String correlatedTestName;
    /** 연관 검체명*/
    private String correlatedSpecimenName;
    /** 연관 작업명*/
    private String correlatedWorkName;
    /** 연관 검사학부코드*/
    private String correlatedDepartmentCode;
    /** 연관 검사학부명*/
    private String correlatedDepartmentName;
    /** 연관 결과유형*/
    private String correlatedResultType;
    /** 연관 결과자료유형*/
    private String correlatedResultDataType;
    /** 연관 문자결과*/
    private String correlatedCharResult;
    /** 연관 수치결과*/
    private String correlatedNumResult;
    /** 생성일시 */
    private Date   creationDate;
    /** 수정일시 */
    private Date   updateDate;
    /** 사용자ID */
    private String userId;
    
	public EPCorrelResultDto() {
		super();
		// TODO Auto-generated constructor stub
		this.lmbCode = "";
		this.receiptDate = "";
		this.receiptNo = 0;
		this.testCode = "";
		this.specimenCode = "";
		this.criteriaId = 0;
		this.correlatedLmbCode = "";
		this.correlatedReceiptDate = "";
		this.correlatedReceiptNo = 0;
		this.correlatedTestCode = "";
		this.correlatedSpecimenCode = "";
		this.correlatedTestSubCode = "";
		this.correlatedTestName = "";
		this.correlatedSpecimenName = "";
		this.correlatedWorkName = "";
		this.correlatedDepartmentCode = "";
		this.correlatedDepartmentName = "";
		this.correlatedResultType = "";
		this.correlatedResultDataType = "";
		this.correlatedCharResult = "";
		this.correlatedNumResult = "";
		this.creationDate = null;
		this.updateDate = null;
		this.userId = "";
	}

	public EPCorrelResultDto(String lmbCode, String receiptDate, int receiptNo, String testCode, String specimenCode,
			int criteriaId, String correlatedLmbCode, String correlatedReceiptDate, int correlatedReceiptNo,
			String correlatedTestCode, String correlatedSpecimenCode, String correlatedTestSubCode,
			String correlatedTestName, String correlatedSpecimenName, String correlatedWorkName,
			String correlatedDepartmentCode, String correlatedDepartmentName, String correlatedResultType,
			String correlatedResultDataType, String correlatedCharResult, String correlatedNumResult, Date creationDate,
			Date updateDate, String userId) {
		super();
		this.lmbCode = lmbCode;
		this.receiptDate = receiptDate;
		this.receiptNo = receiptNo;
		this.testCode = testCode;
		this.specimenCode = specimenCode;
		this.criteriaId = criteriaId;
		this.correlatedLmbCode = correlatedLmbCode;
		this.correlatedReceiptDate = correlatedReceiptDate;
		this.correlatedReceiptNo = correlatedReceiptNo;
		this.correlatedTestCode = correlatedTestCode;
		this.correlatedSpecimenCode = correlatedSpecimenCode;
		this.correlatedTestSubCode = correlatedTestSubCode;
		this.correlatedTestName = correlatedTestName;
		this.correlatedSpecimenName = correlatedSpecimenName;
		this.correlatedWorkName = correlatedWorkName;
		this.correlatedDepartmentCode = correlatedDepartmentCode;
		this.correlatedDepartmentName = correlatedDepartmentName;
		this.correlatedResultType = correlatedResultType;
		this.correlatedResultDataType = correlatedResultDataType;
		this.correlatedCharResult = correlatedCharResult;
		this.correlatedNumResult = correlatedNumResult;
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

	public String getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(String receiptDate) {
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

	public String getCorrelatedTestSubCode() {
		return correlatedTestSubCode;
	}

	public void setCorrelatedTestSubCode(String correlatedTestSubCode) {
		this.correlatedTestSubCode = correlatedTestSubCode;
	}

	public String getCorrelatedTestName() {
		return correlatedTestName;
	}

	public void setCorrelatedTestName(String correlatedTestName) {
		this.correlatedTestName = correlatedTestName;
	}

	public String getCorrelatedSpecimenName() {
		return correlatedSpecimenName;
	}

	public void setCorrelatedSpecimenName(String correlatedSpecimenName) {
		this.correlatedSpecimenName = correlatedSpecimenName;
	}

	public String getCorrelatedWorkName() {
		return correlatedWorkName;
	}

	public void setCorrelatedWorkName(String correlatedWorkName) {
		this.correlatedWorkName = correlatedWorkName;
	}

	public String getCorrelatedDepartmentCode() {
		return correlatedDepartmentCode;
	}

	public void setCorrelatedDepartmentCode(String correlatedDepartmentCode) {
		this.correlatedDepartmentCode = correlatedDepartmentCode;
	}

	public String getCorrelatedDepartmentName() {
		return correlatedDepartmentName;
	}

	public void setCorrelatedDepartmentName(String correlatedDepartmentName) {
		this.correlatedDepartmentName = correlatedDepartmentName;
	}

	public String getCorrelatedResultType() {
		return correlatedResultType;
	}

	public void setCorrelatedResultType(String correlatedResultType) {
		this.correlatedResultType = correlatedResultType;
	}

	public String getCorrelatedResultDataType() {
		return correlatedResultDataType;
	}

	public void setCorrelatedResultDataType(String correlatedResultDataType) {
		this.correlatedResultDataType = correlatedResultDataType;
	}

	public String getCorrelatedCharResult() {
		return correlatedCharResult;
	}

	public void setCorrelatedCharResult(String correlatedCharResult) {
		this.correlatedCharResult = correlatedCharResult;
	}

	public String getCorrelatedNumResult() {
		return correlatedNumResult;
	}

	public void setCorrelatedNumResult(String correlatedNumResult) {
		this.correlatedNumResult = correlatedNumResult;
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
        hash = 31 * hash + Objects.hashCode(this.receiptDate);
        hash = 31 * hash + this.receiptNo;
        hash = 31 * hash + Objects.hashCode(this.testCode);
        hash = 31 * hash + Objects.hashCode(this.specimenCode);
        hash = 31 * hash + this.criteriaId;
        hash = 31 * hash + Objects.hashCode(this.correlatedLmbCode);
        hash = 31 * hash + Objects.hashCode(this.correlatedReceiptDate );
        hash = 31 * hash + this.correlatedReceiptNo ;
        hash = 31 * hash + Objects.hashCode(this.correlatedTestCode );
        hash = 31 * hash + Objects.hashCode(this.correlatedSpecimenCode );
        hash = 31 * hash + Objects.hashCode(this.correlatedTestSubCode );
        hash = 31 * hash + Objects.hashCode(this.correlatedTestName );
        hash = 31 * hash + Objects.hashCode(this.correlatedSpecimenName );
        hash = 31 * hash + Objects.hashCode(this.correlatedWorkName );
        hash = 31 * hash + Objects.hashCode(this.correlatedDepartmentCode );
        hash = 31 * hash + Objects.hashCode(this.correlatedDepartmentName );
        hash = 31 * hash + Objects.hashCode(this.correlatedResultType );
        hash = 31 * hash + Objects.hashCode(this.correlatedResultDataType );
        hash = 31 * hash + Objects.hashCode(this.correlatedCharResult );
        hash = 31 * hash + Objects.hashCode(this.correlatedNumResult );
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

        final EPCorrelResultDto other = (EPCorrelResultDto)obj;
        if (!Objects.equals(this.lmbCode, other.lmbCode)) { return false; }
        if (!Objects.equals(this.receiptDate, other.receiptDate)) { return false; }
        if (this.receiptNo != other.receiptNo) { return false; }
        if (!Objects.equals(this.testCode, other.testCode)) { return false; }
        if (!Objects.equals(this.specimenCode, other.specimenCode)) { return false; }
        if (!Objects.equals(this.criteriaId , other.criteriaId )) { return false; }
        if (!Objects.equals(this.correlatedLmbCode , other.correlatedLmbCode )) { return false; }
        if (!Objects.equals(this.correlatedReceiptDate, other.correlatedReceiptDate)) { return false; }
        if (!Objects.equals(this.correlatedReceiptNo , other.correlatedReceiptNo )) { return false; }
        if (!Objects.equals(this.correlatedTestCode , other.correlatedTestCode )) { return false; }
        if (!Objects.equals(this.correlatedSpecimenCode , other.correlatedSpecimenCode )) { return false; }
        if (!Objects.equals(this.correlatedTestSubCode , other.correlatedTestSubCode )) { return false; }
        return true;
    }
    
    
    
}
