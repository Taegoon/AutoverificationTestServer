package com.seegeneAI.testServer.dao.db1;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seegeneAI.db2MariaDBMapper.data.EPReceiptDto;

@Mapper
@Repository
public interface MariaEPReceiptDao {
	public void saveMariaEPReceiptList(EPReceiptDto mariaEPReceiptList) throws Exception;
}
