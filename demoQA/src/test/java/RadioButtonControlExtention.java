import org.openqa.selenium.WebElement;

import Framework.ControlExtensionBase;

public class RadioButtonControlExtention extends ControlExtensionBase {

	//private  WebElement wrappedElement;

	public RadioButtonControlExtention(WebElement radioBTN) {
		this.wrappedElement = radioBTN;
	}

	public void setValue() {
		boolean select = wrappedElement.isEnabled();;
		if (select == false) {
		this.wrappedElement.click();
		}else 
			this.wrappedElement.click();
	}
}
