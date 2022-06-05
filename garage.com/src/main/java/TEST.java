import org.testng.Assert;
import org.testng.annotations.Test;
import Foundation.TestBases;

import PageObject.HomePage;




public class TEST extends TestBases {
	@Test
  public void Product() throws InterruptedException{
		String producturl="https://ampeg.com/index.html";
	  String URL = new HomePage(this.getDriver())
				.navigate()
				.ClickProduct()
				.ClickOnSVTPRO()
				.ClickOnSVT3PRO()
	            .ClickHome()
	            .getCurrentUrl();
	  
	  Assert.assertEquals(URL,producturl,"should be back to the homePage");
	  
  }
	@Test
	public void test2() throws InterruptedException{
		 String name ="Bootsy Collins";
		String text = new HomePage(this.getDriver())
				.navigate()
				.ClickProduct()
				.ClickOnClassicSeries()
				.ClickOnSVT410()
				.getname();
		
		  Assert.assertEquals(text,name,"should be receiving the artise name");
	}
}

