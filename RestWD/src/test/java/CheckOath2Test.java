import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class CheckOath2Test {

	@Test
	public String getSecurityToken()
	{
		Response resp = get("Access Api");
		// create JSon Path to capture tokenID
		
		String token = "21345";
		return token;
	}
	@Test
	public void getDataFromApi()
	{
		String token = getSecurityToken();
		Response resp = given()
		.auth()
		.oauth2(token)
		.get("Secured APi");
	}
}
