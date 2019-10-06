package com.api.testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.rootLib.BaseClass;
import com.aventstack.extentreports.ExtentTest;

import io.restassured.response.Response;

public class FetchTest extends BaseClass{

	@Test
	public void getPosts()
	{
		
		String testobj = conf
			.getPropertyObject("AllEmp");
		
		Response resp = conf.executeRequest(testobj);
		if(resp != null)
		{
			logger = extent.createTest("Fetch all employee test" , "Test case pass");
		}
		Assert.assertTrue(false);
		resp.then().log().all();
	}
}
