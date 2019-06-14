package com.seegeneAI.testServer.dao.db1;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seegeneAI.db2MariaDBMapper.data.EPTestCodeDto;

@Mapper
@Repository
public interface MariaEPTestCodeDao {
	public void saveMariaEPTestCodeList(EPTestCodeDto mariaEPTestCodeList) throws Exception;
}
