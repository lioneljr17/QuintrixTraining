import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Framework.PageObjectBase;

public class ButonPages extends PageObjectBase {
	private static final String URL = "https://demoqa.com/radio-button";
	
	@FindBy(xpath = "//label[@for='yesRadio']")
	private WebElement yesBTN;
	
	@FindBy(xpath = "//label[@for='impressiveRadio']")
	private WebElement impressiveBTN;
	
	@FindBy(xpath = "//label[@for='noRadio']")
	private WebElement noBTN;
	
  public ButonPages(WebDriver driver) {
		super(driver);
	}

public ButonPages navigate() {
	this.getDriver().navigate().to(URL);
	return this;
}
public ButonPages Selectyesbutton() {
	ControlExtensionFactory.selectRadioButton(yesBTN).setValue();
	
	return this;
}

public String getyesButton() {
	return ControlExtensionFactory.getselectedRadioButton(yesBTN).getValue();
	
	
}

public ButonPages SelectImpresivebutton() {
	ControlExtensionFactory.selectRadioButton(impressiveBTN).setValue();
	return this;
}
public String getImpressiveButton() {
	return ControlExtensionFactory.getselectedRadioButton(impressiveBTN).getValue();
	
	
}

public ButonPages SelectNobutton() {
	ControlExtensionFactory.selectRadioButton(noBTN).setValue();
	return this;
}
public String getnoButton() {
	return ControlExtensionFactory.getselectedRadioButton(noBTN).getValue();
	
}


  
}
