package com.seegeneAI.testServer.dao.db2;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Db2Dao {
	
	List<Map<String, Object>> getMc600mList2();
}

