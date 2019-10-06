package RestAssuredPratice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestTest {

	@Test
	public void AddData()
	{
		RequestSpecification req = RestAssured.given();
		
		JSONObject jobj = new JSONObject();
		jobj.put("id", 500);
		jobj.put("author", "Ramesh");
		jobj.put("title", "TestEngineer");
		
		req.body(JSONObject.toJSONString(jobj));
		req.contentType(ContentType.JSON);
		
		Response resp = req
				.post("http://localhost:3000/posts");
		
		int statusCode = resp.statusCode();
		String respInString = resp.asString();
		String contentType = resp.contentType();
		System.out.println("Status code is: " + statusCode);
		System.out.println("String Response: " + respInString);
		System.out.println("Content Type: " + contentType);
	}
}













