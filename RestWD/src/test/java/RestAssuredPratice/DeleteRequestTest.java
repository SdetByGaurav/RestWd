package RestAssuredPratice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequestTest {

	@Test
	public void removeData()
	{
		Response resp = RestAssured
				.delete("http://localhost:3000/posts/500");
		
		System.out.println(resp.statusCode());
	}
}
