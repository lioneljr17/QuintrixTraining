import org.openqa.selenium.WebElement;

public class ControlExtensionFactory {
	public static RadioButtonControlExtention selectRadioButton(WebElement element) {
		 return new RadioButtonControlExtention(element);
	}
	public static RadioGroupControlExtension getselectedRadioButton(WebElement element) {
		 return new RadioGroupControlExtension(element);
}
	public static  HyperLinkControlExtension ClickCreatedLink(WebElement element) {
		
		return new HyperLinkControlExtension(element);
	}
	public static HyperLinkControlExtension getlinkResponse(WebElement element) {
		
		return new HyperLinkControlExtension(element);
	}
	
	

}
