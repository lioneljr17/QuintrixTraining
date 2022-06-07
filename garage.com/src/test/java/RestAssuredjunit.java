import java.util.HashMap;
import java.util.Map;
import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import org.json.simple.JSONObject;
import org.junit.Test;

public class RestAssuredjunit {

	@Test
	public void GetSingleUserTest() {
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		
		System.out.println(response.asString());
		Assert.assertTrue(response.asString().contains("janet.weaver@reqres.in"));
	}
	@Test
	public void PostLoginTest() {
		Map <String ,Object> map = new HashMap<String, Object>();
		map.put("email", "eve.holt@reqres.in");
		map.put("password", "cityslicka");
		JSONObject request = new JSONObject(map);
		
		RequestSpecification postRequest = RestAssured.given();
		postRequest.header("content-type", "application/json");
	    postRequest.body(map);
		Response response = postRequest.post("https://reqres.in/api/login");
		
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		Assert.assertTrue(response.asString().contains("QpwL5tke4Pnpja7X4"));
	}
	
	
}
