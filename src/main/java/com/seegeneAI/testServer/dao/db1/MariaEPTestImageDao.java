package com.seegeneAI.testServer.dao.db1;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seegeneAI.db2MariaDBMapper.data.EPTestImageDto;

@Mapper
@Repository
public interface MariaEPTestImageDao {
	public void saveMariaEPTestImageList(EPTestImageDto mariaEPTestImageList) throws Exception;

}
