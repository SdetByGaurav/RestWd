package RestAssuredPratice;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;
import io.restassured.response.Response;

public class RealGetReqTest {

	@Test
	public void testParameter()
	{
		Response resp = given()
	.param("userId", "2")
//	.param("id" , "13")
	.pathParam("key", "posts")
	.get("https://jsonplaceholder.typicode.com/{key}");
	//System.out.println(resp.asString());
	//resp.then().log().all();
	Object obj = resp.jsonPath().get("title[2]");
	System.out.println("title is: ");
	System.out.println(obj);
	List idList = resp.jsonPath().get("");
	for(Object obj1 : idList)
	{
		System.out.println(obj1);
	}
	}
}








