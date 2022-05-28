import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SliderPages {
	private static final String URL = "https://demoqa.com/slider";
	
	@FindBy(xpath= "//a[@id='created']")
	private WebElement CreatedLink;
	
	@FindBy(xpath= "//*[@id=\"linkResponse\"]")
	private WebElement ResponseLink;

}
