package RestAssuredPratice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestTest {

	@Test
	public void fetchAllPost()
	{
		Response resp = RestAssured
				.get("https://restcountries.eu/rest/v2/all");
		/*
		int statusCode = resp.statusCode();
		String respInString = resp.asString();
		String contentType = resp.contentType();
		System.out.println("Status code is: " + statusCode);
		System.out.println("String Response: " + respInString);
		System.out.println("Content Type: " + contentType);*/
		
		//resp.body().prettyPrint();
		System.out.println("==================");
		//resp.body().prettyPeek();
		
		resp.then().log().all();
	}
}







