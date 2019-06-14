package com.seegeneAI.testServer.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seegeneAI.db2MariaDBMapper.data.EPReceiptDto;
import com.seegeneAI.db2MariaDBMapper.data.EPTestCodeDto;
import com.seegeneAI.db2MariaDBMapper.data.EPTestCommentDto;
import com.seegeneAI.db2MariaDBMapper.data.EPTestImageDto;
import com.seegeneAI.db2MariaDBMapper.data.EPTestResultDto;
import com.seegeneAI.testServer.service.DbService;

@RestController
@RequestMapping("/testDb")
public class RestDbController {

	@Autowired
	private DbService dbService;

	@GetMapping(value = "/mc600")
	public void mc600() throws Exception {
		int count = 10;
		
		for(int i = 0; i < count; i++) {
			dbService.getMc600mList();
			System.out.println("test date : " + new Date());
			Thread.sleep(1000 * 30); // 30초
		}
	}

	/**
	 * 접수 정보 
	 * DB2 -> MariaDB Migration
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value = "/saveEpReceiptList")
	public ArrayList<EPReceiptDto> selectDb2EpReceipList() throws Exception {
		
		ArrayList<EPReceiptDto> Db2EpReceiptList =  dbService.selectDb2EPReceiptList();
		System.out.println("Db2EpReceiptList Count: "+ Db2EpReceiptList.size());
		dbService.saveMariaEPReceiptList(Db2EpReceiptList);
		
		return Db2EpReceiptList;
	}
	
	/**
	 * 결과 정보 
	 * DB2 -> MariaDB Migration
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value = "/saveEpTestResultList")
	public ArrayList<EPTestResultDto> selectDb2EpTestResultList() throws Exception {
		
		ArrayList<EPTestResultDto> Db2EpTestResultList =  dbService.selectDb2EPTestResultList();
		System.out.println("Db2EpTestResultList Count: "+ Db2EpTestResultList.size());
		dbService.saveMariaEPTestResultList(Db2EpTestResultList);
		
		return Db2EpTestResultList;
	}
	
	/**
	 * 결과 정보 
	 * DB2 -> MariaDB Migration
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value = "/saveEpTestImageList")
	public ArrayList<EPTestImageDto> selectDb2EPTestImageList() throws Exception {
		
		ArrayList<EPTestImageDto> Db2EPTestImageList =  dbService.selectDb2EPTestImageList();
		System.out.println("Db2EPTestImageList Count: "+ Db2EPTestImageList.size());
		dbService.saveMariaEPTestImageList(Db2EPTestImageList);
		
		return Db2EPTestImageList;
	}
	
	/**
	 * Test Comment 
	 * DB2 -> MariaDB Migration
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value = "/saveEpTestCommentList")
	public ArrayList<EPTestCommentDto> selectDb2EPTestCommentList() throws Exception {
		
		ArrayList<EPTestCommentDto> Db2EPTestCommentList =  dbService.selectDb2EPTestCommentList();
		System.out.println("Db2EPTestCommentList Count: "+ Db2EPTestCommentList.size());
		dbService.saveMariaEPTestCommentList(Db2EPTestCommentList);
		
		return Db2EPTestCommentList;
	}
	/**
	 * Test Code 
	 * DB2 -> MariaDB Migration
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value = "/saveEpTestCodeList")
	public ArrayList<EPTestCodeDto> selectDb2EPTestCodeList() throws Exception {
		
		ArrayList<EPTestCodeDto> Db2EPTestCodeList =  dbService.selectDb2EPTestCodeList();
		System.out.println("Db2EPTestCodeList Count: "+ Db2EPTestCodeList.size());
		dbService.saveMariaEPTestCodeList(Db2EPTestCodeList);
		
		return Db2EPTestCodeList;
	}
	
	
}