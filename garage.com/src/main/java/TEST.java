import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Foundation.TestBases;

import PageObject.HomePage;


@Test
public class TEST extends TestBases {
	@Test
  public void Product() throws InterruptedException{
		String producturl="";
	  HomePage url = new HomePage(this.getDriver())
				.navigate()
				.ClickProduct();
	  Assert.assertEquals(url,producturl,"Search result should be displaying dresses");
	  
  }
}

