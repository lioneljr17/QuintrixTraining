package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Foundation.PageObjectBase;
import Foundation.TestBases;
import io.cucumber.java.en.*;


public class LoginStepDefinition extends Foundation.TestBases {
	

	@Given("driver is open")
	public void driver_is_open() {
		this.setup();
		this.getDriver();
		this.getDriver().navigate().to("https://invenauto.tech/index.php");   
	}

	@And("user is on the login page")
	public void user_is_on_the_login_page() {
		WebElement element = getDriver().findElement(By.xpath("//a[@class='login']"));
		element.click();	
	}

	@When("user enters Username and password")
	public void user_enters_username_and_password() {
	WebElement username =getDriver().findElement(By.id("email"));
	username.sendKeys("17@mail.com");
		WebElement passwrd=getDriver().findElement(By.id("passwd"));
		passwrd.sendKeys("Test15");
		WebElement element=getDriver().findElement(By.id("SubmitLogin"));
		element.click();
	}

	@Then("user is navigate to the homepage")
	public void user_is_navigate_to_the_homepage() {
			
		String accounturl="https://invenauto.tech/index.php?controller=my-account";
		String loginurl = this.getDriver().getCurrentUrl();
		
		Assert.assertEquals(loginurl,accounturl,"User should be able to login.");
		
		this.getDriver().close();
		this.getDriver().quit();
	}
}
