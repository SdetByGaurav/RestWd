package com.api.testScripts;

import org.testng.annotations.Test;

import com.api.rootLib.BaseClass;

import io.restassured.response.Response;

public class FetchDatabyID extends BaseClass{

	@Test
	public void userIDData()
	{
		logger = extent.createTest("Fetch All USERID data");
		String testobj = conf.getPropertyObject
							("getEmployeeUserIDTest");
		
		Response resp = conf.executeRequest(testobj);
		resp.then().assertThat().statusCode(200);
		resp.then().log().all();
	}
}
