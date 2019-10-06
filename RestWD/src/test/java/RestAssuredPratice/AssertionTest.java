package RestAssuredPratice;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AssertionTest {

	@Test
	public void checkassert()
	{
		Response resp = given()
				.param("userId", "2")
				.param("id" , "13")
				.pathParam("key", "posts")
	.get("https://jsonplaceholder.typicode.com/{key}");
		/*resp.then().assertThat()
		.contentType(ContentType.JSON);
		
		resp.then().assertThat().statusCode(201);*/
		
		resp.then().assertThat()
		.contentType(ContentType.JSON)
		.and()
		.statusCode(200);
		
		String ct = resp.header("Content-Type");
		System.out.println("content type is: " + ct);
		resp.then().log().all();
	}
}









