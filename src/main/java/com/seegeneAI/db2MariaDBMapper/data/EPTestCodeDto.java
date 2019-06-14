package com.seegeneAI.db2MariaDBMapper.data;

import java.util.Date;

/**
 * @brief 대상 검사 코드
 * @author HTG
 * @version 1.00
 * @date 2019.05.20
 * @section MODIFYINFO 수정정보 
 *  - 수정일/수정자 : 수정내역
 *  - 2019.05.20/HTG : 최초작성
 */
public class EPTestCodeDto {
    /** 소견코드 */
    private String lmbCode;
    /** 검사코드 */
    private String testCode;
    /** 검체유형코드 */
    private String specimenCode;
    /** 부속코드 */
    private String testSubCode;
    /** 검사학부코드 */
    private String departmentCode;
    /** 검사학부명 */
    private String departmentName;
    /** 검사명 */
    private String testName;
    /** 부속명 */
    private String testSubName;
    /** 검체명 */
    private String specimenName;
    /** 작업명 */
    private String workName;
    /** 결과유형 */
    private String dataType;
    /** 사용여부 */
    private String useFlag;
    /** 생성일시 */
    private Date   creationDate;
    /** 수정일시 */
    private Date   updateDate;
    /** 사용자ID */
    private String userId;
    
	public EPTestCodeDto() {
		super();
		// TODO Auto-generated constructor stub
		this.lmbCode = "";
		this.testCode = "";
		this.specimenCode = "";
		this.testSubCode = "";
		this.departmentCode = "";
		this.departmentName = "";
		this.testName = "";
		this.testSubName = "";
		this.specimenName = "";
		this.workName = "";
		this.dataType = "";
		this.useFlag = "";
		this.creationDate = null;
		this.updateDate = null;
		this.userId = "";
	}
	
	public EPTestCodeDto(String lmbCode, String testCode, String specimenCode, String testSubCode,
			String departmentCode, String departmentName, String testName, String testSubName, String specimenName,
			String workName, String dataType, String useFlag, Date creationDate, Date updateDate, String userId) {
		super();
		this.lmbCode = lmbCode;
		this.testCode = testCode;
		this.specimenCode = specimenCode;
		this.testSubCode = testSubCode;
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
		this.testName = testName;
		this.testSubName = testSubName;
		this.specimenName = specimenName;
		this.workName = workName;
		this.dataType = dataType;
		this.useFlag = useFlag;
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
	public String getTestSubCode() {
		return testSubCode;
	}
	public void setTestSubCode(String testSubCode) {
		this.testSubCode = testSubCode;
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
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestSubName() {
		return testSubName;
	}
	public void setTestSubName(String testSubName) {
		this.testSubName = testSubName;
	}
	public String getSpecimenName() {
		return specimenName;
	}
	public void setSpecimenName(String specimenName) {
		this.specimenName = specimenName;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getUseFlag() {
		return useFlag;
	}
	public void setUseFlag(String useFlag) {
		this.useFlag = useFlag;
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
