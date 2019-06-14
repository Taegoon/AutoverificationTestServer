package com.seegeneAI.db2MariaDBMapper.data;

import java.util.Date;
import java.util.Objects;

/**
 * @brief 검사 소견 마스터
 * @author HTG
 * @version 1.00
 * @date 2019.05.20
 * @section MODIFYINFO 수정정보 
 *  - 수정일/수정자 : 수정내역
 *  - 2019.05.17/HTG : 최초작성
 */
public class EPTestCommentMasterDto {

    /** 소견코드 */
    private String commentCode;
    /** 소견 */
    private String comment;
    /** 소견타입*/
    private String commentType;
    /** 생성일시 */
    private Date   creationDate;
    /** 수정일시 */
    private Date   updateDate;
    /** 사용자ID */
    private String userId;
    
	public EPTestCommentMasterDto() {
		super();
		// TODO Auto-generated constructor stub
		this.commentCode = "";
		this.comment = "";
		this.commentType = "";
		this.creationDate = null;
		this.updateDate = null;
		this.userId = "";
	}
	
	public EPTestCommentMasterDto(String commentCode, String comment, String commentType, Date creationDate,
			Date updateDate, String userId) {
		super();
		this.commentCode = commentCode;
		this.comment = comment;
		this.commentType = commentType;
		this.creationDate = creationDate;
		this.updateDate = updateDate;
		this.userId = userId;
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
    
	@Override
    public int hashCode()
    {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.commentCode);
        hash = 31 * hash + Objects.hashCode(this.comment);
        hash = 31 * hash + Objects.hashCode(this.commentType);
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

        final EPTestCommentMasterDto other = (EPTestCommentMasterDto)obj;
        if (!Objects.equals(this.commentCode, other.commentCode)) { return false; }
        return true;
    }
    
    
}
