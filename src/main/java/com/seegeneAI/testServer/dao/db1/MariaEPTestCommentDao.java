package com.seegeneAI.testServer.dao.db1;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seegeneAI.db2MariaDBMapper.data.EPTestCommentDto;

@Mapper
@Repository
public interface MariaEPTestCommentDao {
	public void saveMariaEPTestCommentList(EPTestCommentDto mariaEPTestCommentList) throws Exception;
}
