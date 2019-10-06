package RestAssuredPratice;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CheckAuthTest {

	@Test
	public void authcheck()
	{
	Response resp = given()
	.auth()
	.basic("ToolsQA", "TestPassword")
	.get("http://restapi.demoqa.com/authentication"
			+ "/CheckForAuthentication");
		
		System.out.println(resp.statusCode());
		System.out.println(resp.asString());
	}
}
