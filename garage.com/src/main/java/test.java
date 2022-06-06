import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.*;
import io.restassured.response.Response;


public class test {
@Test
 public void firsttest() {
	
	Response response = RestAssured.get("https://reqres.in/api/users/2");
	
	
	 
 }
}
