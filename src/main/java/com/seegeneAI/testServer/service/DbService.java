package com.seegeneAI.testServer.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seegeneAI.db2MariaDBMapper.data.EPReceiptDto;
import com.seegeneAI.db2MariaDBMapper.data.EPTestCodeDto;
import com.seegeneAI.db2MariaDBMapper.data.EPTestCommentDto;
import com.seegeneAI.db2MariaDBMapper.data.EPTestImageDto;
import com.seegeneAI.db2MariaDBMapper.data.EPTestResultDto;
import com.seegeneAI.testServer.dao.db1.Db1Dao;
import com.seegeneAI.testServer.dao.db1.MariaEPReceiptDao;
import com.seegeneAI.testServer.dao.db1.MariaEPTestCodeDao;
import com.seegeneAI.testServer.dao.db1.MariaEPTestCommentDao;
import com.seegeneAI.testServer.dao.db1.MariaEPTestImageDao;
import com.seegeneAI.testServer.dao.db1.MariaEPTestResultDao;
import com.seegeneAI.testServer.dao.db2.Db2Dao;
import com.seegeneAI.testServer.dao.db2.Db2EPReceiptDao;
import com.seegeneAI.testServer.dao.db2.Db2EPTestCodeDao;
import com.seegeneAI.testServer.dao.db2.Db2EPTestCommentDao;
import com.seegeneAI.testServer.dao.db2.Db2EPTestImageDao;
import com.seegeneAI.testServer.dao.db2.Db2EPTestResultDao;

@Service
public class DbService {

	@Autowired
	private Db1Dao db1Dao;
	
	@Autowired
	private Db2Dao db2Dao;
	
	/**
	 * 	EP 접수 정보
	 */
	@Autowired
	private MariaEPReceiptDao mariaEPReceiptDao;
	
	@Autowired
	private Db2EPReceiptDao db2EPReceiptDao;
	
	/**
	 * 	EP 결과 정보
	 */
	@Autowired
	private MariaEPTestResultDao mariaEPTestResultDao;
	
	@Autowired
	private Db2EPTestResultDao db2EPTestResultDao;
	
	/**
	 * 	EP 결과 Image
	 */
	@Autowired
	private MariaEPTestImageDao mariaEPTestImageDao;
	
	@Autowired
	private Db2EPTestImageDao db2EPTestImageDao;
	
	/**
	 * 	EP Test Comment
	 */
	@Autowired
	private MariaEPTestCodeDao mariaEPTestCodeDao;
	
	@Autowired
	private Db2EPTestCodeDao db2EPTestCodeDao;
	
	/**
	 * 	EP Test Code
	 */
	@Autowired
	private MariaEPTestCommentDao mariaEPTestCommentDao;
	
	@Autowired
	private Db2EPTestCommentDao db2EPTestCommentDao;

	
	public void getMc600mList() {
		List<Map<String, Object>> testList = db1Dao.getMc600mList();
		for(Map<String, Object> map : testList) {
			
		}
		List<Map<String, Object>> test2List = db2Dao.getMc600mList2();
		for(Map<String, Object> map : test2List) {
			
		}
	}
	
	/**
	 * 1. 접수 정보 
	 * DB2 -> MariaDB Migration
	 * @return
	 * @throws Exception
	 */
	public ArrayList<EPReceiptDto> selectDb2EPReceiptList() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Db2 Data 가져오기 진행중 ... ...");
		ArrayList<EPReceiptDto> list = db2EPReceiptDao.selectDb2EPReceiptList();
		System.out.println("Db2 Data 가져오기 완료 !!!!");
		return list;
	}
	
	public String saveMariaEPReceiptList(ArrayList<EPReceiptDto> mariaEPReceiptList) throws Exception {
		// TODO Auto-generated method stub
		//double processPercent = mariaEPReceiptList.size()%100;
		
		System.out.println("Db2-> MariaDB Migration 진행중 ... ...");
		for(EPReceiptDto mariaEPReceiptItem : mariaEPReceiptList) {
			mariaEPReceiptDao.saveMariaEPReceiptList(mariaEPReceiptItem);
		}
		System.out.println("Db2-> MariaDB Migration 완료 ");
		return "success";
	}
	
	/**
	 * 2. 결과 정보 
	 * 2019.06.03
	 * DB2 -> MariaDB Migration
	 * @return
	 * @throws Exception
	 */
	public ArrayList<EPTestResultDto> selectDb2EPTestResultList() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Db2 Data 가져오기 진행중 ... ...");
		ArrayList<EPTestResultDto> list = db2EPTestResultDao.selectDb2EPTestResultList();
		System.out.println("Db2 Data 가져오기 완료 !!!!");
		return list;
	}
	
	public String saveMariaEPTestResultList(ArrayList<EPTestResultDto> mariaEPTestResultList) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Db2-> MariaDB Migration 진행중 ... ...");
		for(EPTestResultDto mariaEPTestResultItem : mariaEPTestResultList) {
			mariaEPTestResultDao.saveMariaEPTestResultList(mariaEPTestResultItem);
		}
		System.out.println("Db2-> MariaDB Migration 완료 ");
		return "success";
	}
	
	/**
	 * 3. 결과 이미지 
	 * 2019.06.04
	 * DB2 -> MariaDB Migration
	 * @return
	 * @throws Exception
	 */
	public ArrayList<EPTestImageDto> selectDb2EPTestImageList() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Db2 Data 가져오기 진행중 ... ...");
		ArrayList<EPTestImageDto> list = db2EPTestImageDao.selectDb2EPTestImageList();
		System.out.println("Db2 Data 가져오기 완료 !!!!");
		return list;
	}
	
	public String saveMariaEPTestImageList(ArrayList<EPTestImageDto> mariaEPTestImageList) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Db2-> MariaDB Migration 진행중 ... ...");
		for(EPTestImageDto mariaEPTestImageItem : mariaEPTestImageList) {
			mariaEPTestImageDao.saveMariaEPTestImageList(mariaEPTestImageItem);
		}
		System.out.println("Db2-> MariaDB Migration 완료 ");
		return "success";
	}
	
	/**
	 * 4. Test Comment 
	 * 2019.06.07
	 * DB2 -> MariaDB Migration
	 * @return
	 * @throws Exception
	 */
	public ArrayList<EPTestCommentDto> selectDb2EPTestCommentList() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Db2 Data 가져오기 진행중 ... ...");
		ArrayList<EPTestCommentDto> list = db2EPTestCommentDao.selectDb2EPTestCommentList();
		System.out.println("Db2 Data 가져오기 완료 !!!!");
		return list;
	}
	
	public String saveMariaEPTestCommentList(ArrayList<EPTestCommentDto> mariaEPTestCommentList) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Db2-> MariaDB Migration 진행중 ... ...");
		for(EPTestCommentDto mariaEPTestCommentItem : mariaEPTestCommentList) {
			mariaEPTestCommentDao.saveMariaEPTestCommentList(mariaEPTestCommentItem);
		}
		System.out.println("Db2-> MariaDB Migration 완료 ");
		return "success";
	}
	
	/**
	 * 5. Test Code 
	 * 2019.06.10
	 * DB2 -> MariaDB Migration
	 * @return
	 * @throws Exception
	 */
	public ArrayList<EPTestCodeDto> selectDb2EPTestCodeList() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Db2 Data 가져오기 진행중 ... ...");
		ArrayList<EPTestCodeDto> list = db2EPTestCodeDao.selectDb2EPTestCodeList();
		System.out.println("Db2 Data 가져오기 완료 !!!!");
		return list;
	}
	
	public String saveMariaEPTestCodeList(ArrayList<EPTestCodeDto> mariaEPTestCodeList) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Db2-> MariaDB Migration 진행중 ... ...");
		for(EPTestCodeDto mariaEPTestCodeItem : mariaEPTestCodeList) {
			mariaEPTestCodeDao.saveMariaEPTestCodeList(mariaEPTestCodeItem);
		}
		System.out.println("Db2-> MariaDB Migration 완료 ");
		return "success";
	}
}
