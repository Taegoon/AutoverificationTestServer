package com.seegeneAI.testServer.dao.db1;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Db1Dao {
	List<Map<String, Object>> getMc600mList();
}

