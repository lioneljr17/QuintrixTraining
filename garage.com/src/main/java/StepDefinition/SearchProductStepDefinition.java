package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Foundation.TestBases;
import io.cucumber.java.en.*;

public class SearchProductStepDefinition extends TestBases{
	
	@Given("driver is openn")
	public void driver_is_openn() {
		this.setup();
		this.getDriver();
		
	}

	@And("user is on the home page")
	public void user_is_on_the_home_page() {
		this.getDriver().navigate().to("https://invenauto.tech/index.php"); 
	}

	@When("user search any product")
	public void user_search_any_product() {
		WebElement element = this.getDriver().findElement(By.id("search_query_top"));
		element.sendKeys("dresses");
	}

	@And("user click serach button")
	public void user_click_serach_button() {
		WebElement element = this.getDriver().findElement(By.name("submit_search"));
		element.click();
	}

	@Then("user is navigate to the serach page")
	public void user_is_navigate_to_the_serach_page() {
		String Searchurl="https://invenauto.tech/index.php?controller=search&orderby=position&orderway=desc&search_query=dresses&submit_search=";
		String loginurl = this.getDriver().getCurrentUrl();
		
		Assert.assertEquals(loginurl,Searchurl,"User should be on the searchpage");
		
		this.getDriver().close();
		this.getDriver().quit();
	}

}
