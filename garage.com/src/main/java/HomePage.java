import Foundation.PageObjectBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObjectBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage navigate() {
		this.getDriver().get("https://ampeg.com/index.html");

		return this;
	}

	public HomePage ClickProduct() {
		WebElement element = this.getDriver().findElement(By.cssSelector("a[class='main-item products']"));
		element.click();

		return this;
	}
	
	
	
}
