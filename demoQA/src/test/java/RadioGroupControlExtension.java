import org.openqa.selenium.WebElement;

import Framework.ControlExtensionBase;

public class RadioGroupControlExtension extends ControlExtensionBase {
	//private  WebElement wrappedElement;

	
	public RadioGroupControlExtension(WebElement radioBTN) {
		this.wrappedElement = radioBTN;
	}

	public String getValue() {
		return this.wrappedElement.getText();
		
	}
}
