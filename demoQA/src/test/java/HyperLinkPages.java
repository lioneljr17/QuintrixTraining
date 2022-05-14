import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Framework.PageObjectBase;

public class HyperLinkPages extends PageObjectBase {

		private static final String URL = "https://demoqa.com/links";
		
		@FindBy(xpath= "//a[@id='created']")
		private WebElement CreatedLink;
		
		@FindBy(xpath= "//*[@id=\"linkResponse\"]")
		private WebElement ResponseLink;
		
		public HyperLinkPages(WebDriver driver) {
			super(driver);

}
		public HyperLinkPages navigate() {
			this.getDriver().navigate().to(URL);
			return this;
		}
		public HyperLinkPages ClickCreatedLink() {
			ControlExtensionFactory.ClickCreatedLink(CreatedLink).setValue();
			
			return this;
		}

		public String getLinkResponse() {
			return ControlExtensionFactory.getlinkResponse(ResponseLink).getValue();
			
			
		}
}
