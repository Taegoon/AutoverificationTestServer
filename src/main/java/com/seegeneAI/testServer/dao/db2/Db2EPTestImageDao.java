package com.seegeneAI.testServer.dao.db2;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.seegeneAI.db2MariaDBMapper.data.EPTestImageDto;

@Mapper
@Repository
public interface Db2EPTestImageDao {
	public ArrayList<EPTestImageDto> selectDb2EPTestImageList() throws Exception;
}
