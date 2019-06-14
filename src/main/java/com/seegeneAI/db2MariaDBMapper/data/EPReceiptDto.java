package com.seegeneAI.db2MariaDBMapper.data;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @brief 접수정보
 * @author HTG
 * @version 1.00
 * @date 2019.05.16
 * @section MODIFYINFO 수정정보 
 *  - 수정일/수정자 : 수정내역
 *  - 2019.05.16/HTG : 최초작성
 */
public class EPReceiptDto
{
    /** LMB코드 */
    private String lmbCode;
    /** 접수일자 */
    private String receiptDate;
    /** 접수번호 */
    private int    receiptNo;
    /** 병원코드 */
    private String hospitalCode;
    /** 병원명 */
    private String hospitalName;
    /** 환자명 */
    private String patientName;
    /** 성별 */
    private String sex;
    /** 연령_년 */
    private int    ageYear;
    /** 상태 */
    private String status;
    /** 주민번호앞자리 */
    private String   pidPre ;
    /** 병원차트번호 */
    private String  hospitalChartNo;
    /** 생성일시 */
    private Date   creationDate;
    /** 수정일시 */
    private Date   updateDate;
    /** 사용자ID */
    private String userId;
    
    private List<String> receiptNos;
    private List<String> receiptDates;

    /** default constructor */
    public EPReceiptDto()
    {
        this.lmbCode = "";
        this.receiptDate = "";
        this.receiptNo = 0;
        this.hospitalCode = "";
        this.hospitalName = "";
        this.patientName = "";
        this.sex = "";
        this.ageYear = 0;
        this.status = "";
        this.pidPre  = "";
        this.hospitalChartNo = "";
        this.creationDate = null;
        this.updateDate = null;
        this.userId = "";
    }

    /** constructor */
    public EPReceiptDto(final String pLmbCode, final String pReceiptDate, final int pReceiptNo, final String pHospitalCode, final String pHospitalName, final String pPatientName, final String pSex, final int pAgeYear, final String pStatus, final String pPidPre , final String pHospitalChartNo, final Date pCreationDate, final Date pUpdateDate, final String pUserId)
    {
        this.lmbCode = pLmbCode;
        this.receiptDate = pReceiptDate;
        this.receiptNo = pReceiptNo;
        this.hospitalCode = pHospitalCode;
        this.hospitalName = pHospitalName;
        this.patientName = pPatientName;
        this.sex = pSex;
        this.ageYear = pAgeYear;
        this.status = pStatus;
        this.pidPre  = pPidPre ;
        this.hospitalChartNo = pHospitalChartNo;
        this.creationDate = pCreationDate;
        this.updateDate = pUpdateDate;
        this.userId = pUserId;
    }

    /** get 함수 : LMB코드 */
    public String getLmbCode()
    {
        return lmbCode;
    }

    /** get 함수 : 접수일자 */
    public String getReceiptDate()
    {
        return receiptDate;
    }

    /** get 함수 : 접수번호 */
    public int getReceiptNo()
    {
        return receiptNo;
    }

    /** get 함수 : 병원코드 */
    public String getHospitalCode()
    {
        return hospitalCode;
    }

    /** get 함수 : 병원명 */
    public String getHospitalName()
    {
        return hospitalName;
    }

    /** get 함수 : 환자명 */
    public String getPatientName()
    {
        return patientName;
    }

    /** get 함수 : 성별 */
    public String getSex()
    {
        return sex;
    }

    /** get 함수 : 연령_년 */
    public int getAgeYear()
    {
        return ageYear;
    }

    /** get 함수 : 상태 */
    public String getStatus()
    {
        return status;
    }

    /** get 함수 : 주민번호앞자리 */
    public String getPidPre ()
    {
        return pidPre ;
    }

    /** get 함수 : 병원차트번호 */
    public String getHospitalChartNo()
    {
        return hospitalChartNo;
    }

    /** get 함수 : 생성일시 */
    public Date getCreationDate()
    {
        return creationDate;
    }

    /** get 함수 : 수정일시 */
    public Date getUpdateDate()
    {
        return updateDate;
    }

    /** get 함수 : 사용자ID */
    public String getUserId()
    {
        return userId;
    }

    /** set 함수 : LMB코드 */
    public void setLmbCode(final String pLmbCode)
    {
        this.lmbCode = pLmbCode;
    }

    /** set 함수 : 접수일자 */
    public void setReceiptDate(final String pReceiptDate)
    {
        this.receiptDate = pReceiptDate;
    }

    /** set 함수 : 접수번호 */
    public void setReceiptNo(final int pReceiptNo)
    {
        this.receiptNo = pReceiptNo;
    }

    /** set 함수 : 병원코드 */
    public void setHospitalCode(final String pHospitalCode)
    {
        this.hospitalCode = pHospitalCode;
    }

    /** set 함수 : 병원명 */
    public void setHospitalName(final String pHospitalName)
    {
        this.hospitalName = pHospitalName;
    }

    /** set 함수 : 환자명 */
    public void setPatientName(final String pPatientName)
    {
        this.patientName = pPatientName;
    }

    /** set 함수 : 성별 */
    public void setSex(final String pSex)
    {
        this.sex = pSex;
    }

    /** set 함수 : 연령_년 */
    public void setAgeYear(final int pAgeYear)
    {
        this.ageYear = pAgeYear;
    }

    /** set 함수 : 상태 */
    public void setStatus(final String pStatus)
    {
        this.status = pStatus;
    }

    /** set 함수 : 주민번호앞자리 */
    public void setPidPre (final String pPidPre )
    {
        this.pidPre  = pPidPre ;
    }

    /** set 함수 : 병원차트번호 */
    public void setHospitalChartNo(final String pHospitalChartNo)
    {
        this.hospitalChartNo = pHospitalChartNo;
    }

    /** set 함수 : 생성일시 */
    public void setCreationDate(final Date pCreationDate)
    {
        this.creationDate = pCreationDate;
    }

    /** set 함수 : 수정일시 */
    public void setUpdateDate(final Date pUpdateDate)
    {
        this.updateDate = pUpdateDate;
    }

    /** set 함수 : 사용자ID */
    public void setUserId(final String pUserId)
    {
        this.userId = pUserId;
    }

    public List<String> getReceiptNos() {
		return receiptNos;
	}
    
    public void setReceiptNos(List<String> receiptNos) {
    	this.receiptNos = receiptNos;
    }

    public List<String> getReceiptDates() {
		return receiptDates;
	}
    
    public void setReceiptDates(List<String> receiptDates) {
    	this.receiptDates = receiptDates;
    }

	
	@Override
    public int hashCode()
    {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.lmbCode);
        hash = 31 * hash + Objects.hashCode(this.receiptDate);
        hash = 31 * hash + this.receiptNo;
        hash = 31 * hash + Objects.hashCode(this.hospitalCode);
        hash = 31 * hash + Objects.hashCode(this.hospitalName);
        hash = 31 * hash + Objects.hashCode(this.patientName);
        hash = 31 * hash + Objects.hashCode(this.sex);
        hash = 31 * hash + this.ageYear;
        hash = 31 * hash + Objects.hashCode(this.status);
        hash = 31 * hash + Objects.hashCode(this.pidPre );
        hash = 31 * hash + Objects.hashCode(this.hospitalChartNo);
        hash = 31 * hash + Objects.hashCode(this.creationDate);
        hash = 31 * hash + Objects.hashCode(this.updateDate);
        hash = 31 * hash + Objects.hashCode(this.userId);
        return hash;
    }

    @Override
    public String toString()
    {
        return lmbCode+","+receiptDate+","+receiptNo+","+hospitalCode+","+hospitalName+","+patientName+","+sex+","+ageYear+","+status+","+pidPre +","+hospitalChartNo+","+creationDate+","+updateDate+","+userId;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }

        final EPReceiptDto other = (EPReceiptDto)obj;
        if (!Objects.equals(this.lmbCode, other.lmbCode)) { return false; }
        if (!Objects.equals(this.receiptDate, other.receiptDate)) { return false; }
        if (this.receiptNo != other.receiptNo) { return false; }
        return true;
    }

    /** get header for csv file */
    public String header()
    {
        return "LMB_CODE,RECEIPT_DATE,RECEIPT_NO,HOSPITAL_CODE,HOSPITAL_NAME,PATIENT_NAME,SEX,AGE_DAY,AGE_MONTH,AGE_YEAR,BARCODE,BRANCH_CODE,BRANCH_NAME,STATUS,RESULT_STATUS,FETUS_NO,SCAN_WEEK,PREGNANCY_DAY,CREATION_DATE,UPDATE_DATE,USER_ID";
    }
}
