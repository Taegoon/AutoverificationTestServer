package com.seegeneAI.testServer.dao.db2;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seegeneAI.db2MariaDBMapper.data.EPTestCodeDto;

@Mapper
@Repository
public interface Db2EPTestCodeDao {
	public ArrayList<EPTestCodeDto> selectDb2EPTestCodeList() throws Exception;
}
