package com.seegeneAI.testServer.dao.db2;

import java.util.ArrayList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seegeneAI.db2MariaDBMapper.data.EPReceiptDto;

@Mapper
@Repository
public interface Db2EPReceiptDao {
	public ArrayList<EPReceiptDto> selectDb2EPReceiptList() throws Exception;

}
