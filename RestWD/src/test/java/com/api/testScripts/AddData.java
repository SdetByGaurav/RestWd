package com.api.testScripts;

import org.testng.annotations.Test;

import com.api.rootLib.BaseClass;

import io.restassured.response.Response;

public class AddData extends BaseClass{

	@Test
	public void createResource()
	{
		String testObj = conf.getPropertyObject("createPost");
		Response resp = conf.executeRequest(testObj);
		resp.then().log().all();
	}
}
