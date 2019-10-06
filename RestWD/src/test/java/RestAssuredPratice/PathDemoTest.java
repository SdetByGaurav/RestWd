package RestAssuredPratice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class PathDemoTest {

	@Test
	public void pathdemo()
	{
		//Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees");
		Response resp = given()
		.pathParam("x", "api")
		.pathParam("y", "v1")
		.get("http://dummy.restapiexample.com/{x}/{y}"
									+ "/employees");
		System.out.println(resp.asString());
	}
}
