package com.seegeneAI.testServer.dao.db2;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seegeneAI.db2MariaDBMapper.data.EPTestCommentDto;

@Mapper
@Repository
public interface Db2EPTestCommentDao {
	public ArrayList<EPTestCommentDto> selectDb2EPTestCommentList() throws Exception;

}
