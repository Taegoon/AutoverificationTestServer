$(document).ready(function(){
	var data = '{ \n'+
		'    "lmbCode" : "0000", \n'+
		'    "receiptDate" : "20180831", \n'+
		'    "receiptNo" : "12345", \n'+
		'    "testCode" : "41002", \n'+
		'    "testSubCode" : "", \n'+
		'    "specimentCode" : "A01", \n'+
		'    "workNo" : "12", \n'+
		'    "testStaff" : "L54321", \n'+
		'    "testStaffName" : "검사담당자", \n'+
		'    "resultType" : "N", \n'+
		'    "tsRackNo" : "", \n'+
		'    "tsPosNo" : "", \n'+
		'    "equipmentCode" : "611", \n'+
		'    "rackNo" : "", \n'+
		'    "posNo" : "", \n'+
		'    "equipmentFlag" : "", \n'+
		'    "numericResultRecv" : "", \n'+
		'    "charResultRecv" : "", \n'+
		'    "testStartDate" : "20180831223010", \n'+
		'    "testDate" : "20180831211314", \n'+
		'    "numericResultRecv1" : "", \n'+
		'    "charResultRecv1" : "", \n'+
		'    "testStartDate1" : "", \n'+
		'    "testDate1" : "", \n'+
		'    "numericResultRecv2" : "", \n'+
		'    "charResultRecv2" : "", \n'+
		'    "testStartDate2" : "", \n'+
		'    "testDate2" : "", \n'+
		'    "prevResult" : "", \n'+
		'    "refResultHigh" : "176.7", \n'+
		'    "refResultLow" : "75.7", \n'+
		'    "resultStatus" : "1", \n'+
		'    "barcode" : "1234567890" \n'+
		'} \n';
	
	var isEmpty = function(value){
		if( value == "" || value == null || value == undefined || ( value != null && typeof value == "object" && !Object.keys(value).length ) ) {
			return true
		} else {
			return false
		}
	}
	function $http_auth(urlStr, callback){
		var obj = {"authUserId":"apiadmin","authPassword":"apiadmin"};
//		var settings = {
//				  "async": true,
//				  "crossDomain": true,
//				  "url": "http://localhost:8081/autoverification/auth/token",
//				  "method": "POST",
//				  "headers": {
//				    "content-type": "application/json",
//				    "cache-control": "no-cache"
//				  },
//				  "processData": false,
//				  "data": "{\"authUserId\":\"apiadmin\",\"authPassword\":\"apiadmin\"}\n"
//				}
//
//				$.ajax(settings).done(function (response) {
//				  console.log(response);
//				});
		
		$.ajax({
			type : "POST",
			contentType : 'application/json',
			url : "http://localhost:8081/autoverification/auth/token",
			data : "{\"authUserId\":\"apiadmin\",\"authPassword\":\"apiadmin\"}\n",
			success : function(result)
			{
				console.log('success!', result);
				//{"validity":"valid","msg":"10건 성공"}
				//{"validity":"error","msg":"검사항목정보 업데이트에 실패하였습니다"}

			},
			error : function(e) 
			{
				console.log("ERROR: ", e);
			}
		});
		
	}
	function $http(urlStr, jsonData){
		
		$.ajax({
			type : "POST",
			contentType : 'application/json',
			url : urlStr,
			data : jsonData,
			success : function(result)
			{
				console.log('success!', result);
				//{"validity":"valid","msg":"10건 성공"}
				//{"validity":"error","msg":"검사항목정보 업데이트에 실패하였습니다"}

			},
			error : function(e) 
			{
				console.log("ERROR: ", e);
			}
		});
	}
	
	$("#btn").click(function(){
		var baseUrl = $("#baseurl").val();
		var apiurl = $("#apiurl").val();
		var jsonData = $("#jsonData").val();

		
		if(isEmpty(baseUrl) || isEmpty(apiurl) || isEmpty(jsonData)){
			alert("URL 또는 내용을 입력해주세요.");
			return false;
		}
		
		$http(baseUrl + apiurl, jsonData);
		
		// API 인증
//		$http_auth(baseUrl, function(result){
//			
////			// update test result
////			$http(baseUrl + apiurl, jsonData);
//		});
	});
	
	$("#btnHome").click(function(){
		location.href = "./";
	});
	
	$("#jsonData").val(data);
	
});