import org.openqa.selenium.WebElement;

import Framework.ControlExtensionBase;

public class SliderControlExtension extends ControlExtensionBase {
	
	public SliderControlExtension(WebElement radioBTN) {
		this.wrappedElement = radioBTN;
	}

	public void setValue() {
		this.wrappedElement.click();
	}
	

	public String getValue() {
		return this.wrappedElement.getText();
		
	}
}
