import org.openqa.selenium.WebElement;

import Framework.ControlExtensionBase;

public class HyperLinkControlExtension extends ControlExtensionBase {
	
	public HyperLinkControlExtension(WebElement element) {
		this.wrappedElement = element;
	}
	
	public void setValue() {
		this.wrappedElement.click();
	}
	

	public String getValue() {
		return this.wrappedElement.getText();
		
	}

}
