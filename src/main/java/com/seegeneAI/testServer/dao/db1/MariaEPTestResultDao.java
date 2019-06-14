package com.seegeneAI.testServer.dao.db1;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seegeneAI.db2MariaDBMapper.data.EPTestResultDto;

@Mapper
@Repository
public interface MariaEPTestResultDao {
	public void saveMariaEPTestResultList(EPTestResultDto mariaEPTestResultList) throws Exception;
}
