package com.seegeneAI.testServer.dao.db2;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seegeneAI.db2MariaDBMapper.data.EPTestResultDto;

@Mapper
@Repository
public interface Db2EPTestResultDao {
	public ArrayList<EPTestResultDto> selectDb2EPTestResultList() throws Exception;
}
