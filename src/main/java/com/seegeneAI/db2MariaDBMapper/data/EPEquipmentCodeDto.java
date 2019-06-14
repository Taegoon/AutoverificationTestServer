package com.seegeneAI.db2MariaDBMapper.data;

import java.util.Date;
import java.util.Objects;


public class EPEquipmentCodeDto {

    /** LMB코드 */
    private String lmbCode;
    /** 검사코드 */
    private String testCode;
    /** 검사명*/
    private String testName;
    /** 검체유형코드 */
    private String specimenCode;
    /** 검체명 */
    private String specimenName;
    /** 장비코드 */
    private String equipmentCode;
    /** 검사학부명 */
    private String departmentName;
    /** 검사학부코드 */
    private String departmentCode;
    /** 작업명 */
    private String workName;
    /** 사용여부 */
    private String  useFlag;
    /** 생성일시 */
    private Date   creationDate;
    /** 수정일시 */
    private Date   updateDate;
    /** 사용자ID */
    private String userId;
    
    /** default constructor */
	public EPEquipmentCodeDto() {
		super();
		// TODO Auto-generated constructor stub
		this.lmbCode = "";
		this.testCode = "";
		this.testName = "";
		this.specimenCode = "";
		this.specimenName = "";
		this.equipmentCode = "";
		this.departmentName = "";
		this.departmentCode = "";
		this.workName = "";
		this.useFlag = "";
		this.creationDate = null;
		this.updateDate = null;
		this.userId = "";
	}

	public EPEquipmentCodeDto(String lmbCode, String testCode, String testName, String specimenCode,
			String specimenName, String equipmentCode, String departmentName, String departmentCode, String workName,
			String useFlag, Date creationDate, Date updateDate, String userId) {
		super();
		this.lmbCode = lmbCode;
		this.testCode = testCode;
		this.testName = testName;
		this.specimenCode = specimenCode;
		this.specimenName = specimenName;
		this.equipmentCode = equipmentCode;
		this.departmentName = departmentName;
		this.departmentCode = departmentCode;
		this.workName = workName;
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

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
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

	public String getEquipmentCode() {
		return equipmentCode;
	}

	public void setEquipmentCode(String equipmentCode) {
		this.equipmentCode = equipmentCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
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
   
	@Override
    public int hashCode()
    {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.lmbCode);
        hash = 31 * hash + Objects.hashCode(this.testCode);
        hash = 31 * hash + Objects.hashCode(this.specimenCode);
        hash = 31 * hash + Objects.hashCode(this.equipmentCode);
        hash = 31 * hash + Objects.hashCode(this.departmentCode);
        hash = 31 * hash + Objects.hashCode(this.testName);
        hash = 31 * hash + Objects.hashCode(this.specimenName);
        hash = 31 * hash + Objects.hashCode(this.departmentName);
        hash = 31 * hash + Objects.hashCode(this.workName);
        hash = 31 * hash + Objects.hashCode(this.useFlag);
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

	        final EPEquipmentCodeDto other = (EPEquipmentCodeDto)obj;
	        if (!Objects.equals(this.lmbCode, other.lmbCode)) { return false; }
	        if (!Objects.equals(this.testCode, other.testCode)) { return false; }
	        if (!Objects.equals(this.specimenCode, other.specimenCode)) { return false; }
	        if (!Objects.equals(this.equipmentCode, other.equipmentCode)) { return false; }
	        return true;
	    }
    
    
}
