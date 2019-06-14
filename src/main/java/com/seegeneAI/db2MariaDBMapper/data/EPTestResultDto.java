package com.seegeneAI.db2MariaDBMapper.data;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;


/**
 * @brief 검사 결과
 * @author HTG
 * @version 1.00
 * @date 2019.05.17
 * @section MODIFYINFO 수정정보 
 *  - 수정일/수정자 : 수정내역
 *  - 2019.05.17/HTG : 최초작성
 */
public class EPTestResultDto
{
    /** LMB코드 */
    private String lmbCode;
    /** 접수일자 */
    private int receiptDate;
    /** 접수번호 */
    private int receiptNo;
    /** 검사코드 */
    private String testCode;
    /** 부속코드 */
    private String testSubCode;
    /** 검체유형코드 */
    private String specimenCode;
    /** 검체명 */
    private String specimenName;
    /** 검사명 */
    private String testName;
    /** 작업명 */
    private String workName;
    /** 검사학부코드 */
    private String departmentCode;
    /** 검사학부명 */
    private String departmentName;
    /** 검사담당자 */
    private String testStaff;
    /** 결과유형 */
    private String resultType;
    /** 수치결과 */
    private BigDecimal totalVolume;
    /** 수치결과 */
    private BigDecimal numResult1;
    /** 수치결과 */
    private BigDecimal numResult2;
    /** 수치결과 */
    private BigDecimal numResult3;
    /** 선택여부 */
    private String choiceFlag;
    /** 문자결과 */
    private String chrResult;
    /** M Spike 수량 */
    private int quantityOfMSpike;
    /** 판정코드 */
    private String decisionCode;
    /** 선택여부 */
    private Integer testDate;
    /** 검사시작일자 */
    private BigDecimal testStartDate;
    /** 장비 Flag */
    private String equipmentFlag;
    /** 검사장비 */
    private String equipmentCode;
    /** 바코드 */
    private String barcode;
    /** 생성일시 */
    private Date   creationDate;
    /** 수정일시 */
    private Date   updateDate;
    /** 사용자ID */
    private String userId;
    
    /** default constructor */
    public EPTestResultDto()
    {
        this.lmbCode = "";
        this.receiptDate = 0;
        this.receiptNo = 0;
        this.testCode = "";
        this.testSubCode = "";
        this.specimenCode = "";
        this.specimenName = "";
        this.testName = "";
        this.workName = "";
        this.departmentCode = "";
        this.departmentName = "";
        this.testStaff = "";
        this.resultType = "";
        this.totalVolume = null;
        this.numResult1 = null;
        this.numResult2 = null;
        this.numResult3 = null;
        this.choiceFlag = "";
        this.chrResult = "";
        this.quantityOfMSpike = 0;
        this.decisionCode = "";
        this.testDate = null;
        this.testStartDate = null;
        this.equipmentFlag = "";
        this.equipmentCode = "";
        this.barcode = "";
        this.creationDate = null;
        this.updateDate = null;
        this.userId = "";
    }

	public EPTestResultDto(String lmbCode, int receiptDate, int receiptNo, String testCode, String testSubCode,
			String specimenCode, String specimenName, String testName, String workName, String departmentCode,
			String departmentName, String testStaff, String resultType, BigDecimal totalVolume, BigDecimal numResult1,BigDecimal numResult2,BigDecimal numResult3,
			String choiceFlag, String chrResult, int quantityOfMSpike, String decisionCode, Integer testDate, BigDecimal testStartDate,
			String equipmentFlag, String equipmentCode, String barcode, Date creationDate, Date updateDate,
			String userId) {
		super();
		this.lmbCode = lmbCode;
		this.receiptDate = receiptDate;
		this.receiptNo = receiptNo;
		this.testCode = testCode;
		this.testSubCode = testSubCode;
		this.specimenCode = specimenCode;
		this.specimenName = specimenName;
		this.testName = testName;
		this.workName = workName;
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
		this.testStaff = testStaff;
		this.resultType = resultType;
		this.totalVolume = totalVolume;
		this.numResult1 = numResult1;
		this.numResult2 = numResult2;
		this.numResult3 = numResult3;
		this.choiceFlag = choiceFlag;
		this.chrResult = chrResult;
		this.quantityOfMSpike = quantityOfMSpike;
		this.decisionCode = decisionCode;
		this.testDate = testDate;
		this.testStartDate = testStartDate;
		this.equipmentFlag = equipmentFlag;
		this.equipmentCode = equipmentCode;
		this.barcode = barcode;
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

	public String getTestSubCode() {
		return testSubCode;
	}

	public void setTestSubCode(String testSubCode) {
		this.testSubCode = testSubCode;
	}

	public String getSpecimenCode() {
		return specimenCode;
	}

	public void setSpecimenCode(String specimenCode) {
		this.specimenCode = specimenCode;
	}

	public String getSpecimenName() {
		return specimenName;
	}

	public void setSpecimenName(String specimenName) {
		this.specimenName = specimenName;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getTestStaff() {
		return testStaff;
	}

	public void setTestStaff(String testStaff) {
		this.testStaff = testStaff;
	}

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public BigDecimal getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(BigDecimal totalVolume) {
		this.totalVolume = totalVolume;
	}

	public BigDecimal getnumResult1() {
		return numResult1;
	}

	public void setnumResult1(BigDecimal numResult1) {
		this.numResult1 = numResult1;
	}
	public BigDecimal getnumResult2() {
		return numResult2;
	}
	
	public void setnumResult2(BigDecimal numResult2) {
		this.numResult2 = numResult2;
	}
	public BigDecimal getnumResult3() {
		return numResult3;
	}
	
	public void setnumResult3(BigDecimal numResult3) {
		this.numResult3 = numResult3;
	}

	public String getChoiceFlag() {
		return choiceFlag;
	}

	public void setChoiceFlag(String choiceFlag) {
		this.choiceFlag = choiceFlag;
	}
	public String getChrResult() {
		return chrResult;
	}
	
	public void setChrResult(String chrResult) {
		this.chrResult = chrResult;
	}

	public int getQuantityOfMSpike() {
		return quantityOfMSpike;
	}

	public void setQuantityOfMSpike(int quantityOfMSpike) {
		this.quantityOfMSpike = quantityOfMSpike;
	}

	public String getDecisionCode() {
		return decisionCode;
	}

	public void setDecisionCode(String decisionCode) {
		this.decisionCode = decisionCode;
	}

	public Integer getTestDate() {
		return testDate;
	}

	public void setTestDate(Integer testDate) {
		this.testDate = testDate;
	}

	public BigDecimal getTestStartDate() {
		return testStartDate;
	}

	public void setTestStartDate(BigDecimal testStartDate) {
		this.testStartDate = testStartDate;
	}

	public String getEquipmentFlag() {
		return equipmentFlag;
	}

	public void setEquipmentFlag(String equipmentFlag) {
		this.equipmentFlag = equipmentFlag;
	}

	public String getEquipmentCode() {
		return equipmentCode;
	}

	public void setEquipmentCode(String equipmentCode) {
		this.equipmentCode = equipmentCode;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
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
        hash = 31 * hash + Objects.hashCode(this.testSubCode);
        hash = 31 * hash + Objects.hashCode(this.specimenCode);
        hash = 31 * hash + Objects.hashCode(this.specimenName);
        hash = 31 * hash + Objects.hashCode(this.testName);
        hash = 31 * hash + Objects.hashCode(this.workName);
        hash = 31 * hash + Objects.hashCode(this.departmentCode);
        hash = 31 * hash + Objects.hashCode(this.departmentName);
        hash = 31 * hash + Objects.hashCode(this.testStaff);
        hash = 31 * hash + Objects.hashCode(this.resultType);
        hash = 31 * hash + Objects.hashCode(this.totalVolume);
        hash = 31 * hash + Objects.hashCode(this.numResult1);
        hash = 31 * hash + Objects.hashCode(this.numResult2);
        hash = 31 * hash + Objects.hashCode(this.numResult3);
        hash = 31 * hash + Objects.hashCode(this.choiceFlag);
        hash = 31 * hash + Objects.hashCode(this.chrResult);
        hash = 31 * hash + Objects.hashCode(this.quantityOfMSpike);
        hash = 31 * hash + Objects.hashCode(this.decisionCode);
        hash = 31 * hash + Objects.hashCode(this.testDate);
        hash = 31 * hash + Objects.hashCode(this.testStartDate);
        hash = 31 * hash + Objects.hashCode(this.equipmentFlag);
        hash = 31 * hash + Objects.hashCode(this.equipmentCode);
        hash = 31 * hash + Objects.hashCode(this.barcode);
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

        final EPTestResultDto other = (EPTestResultDto)obj;
        if (!Objects.equals(this.lmbCode, other.lmbCode)) { return false; }
        if (!Objects.equals(this.receiptDate, other.receiptDate)) { return false; }
        if (this.receiptNo != other.receiptNo) { return false; }
        if (!Objects.equals(this.testCode, other.testCode)) { return false; }
        if (!Objects.equals(this.testSubCode, other.testSubCode)) { return false; }
        if (!Objects.equals(this.specimenCode, other.specimenCode)) { return false; }
        return true;
    }
}
