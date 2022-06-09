package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Foundation.PageObjectBase;

public class ProductsPage extends PageObjectBase{
	

	//private WebDriver driver;

	public ProductsPage(WebDriver driver) {
		super(driver);
		}
	public ProductsPage ClickOnClassicSeries() {
		WebElement element = this.getDriver().findElement(By.cssSelector("a[href='/products/classic/']"));
		element.click();

		return this;
	}
	public ProductsPage ClickOnSVTPRO() {
		WebElement element = this.getDriver().findElement(By.cssSelector("a[href='/products/pro/']"));
		element.click();

		return this;
	}
	public ProductsPage ClickOnSVT3PRO() {
		WebElement element = this.getDriver().findElement(By.cssSelector("a[href='svt3pro/']"));
		element.click();

		return this;
	}
	public ProductsPage ClickOnSVT410() {
		WebElement element = this.getDriver().findElement(By.cssSelector("a[href='svt410hlf/']"));
		element.click();

		return this;
	}
	public  ProductsPage  ClickHome() {
		WebElement element = this.getDriver().findElement(By.cssSelector("a[href='/']"));
		element.click();

		return this ;
	}
	public String getname() {
		WebElement element = this.getDriver().findElement(By.cssSelector("#artist > p > b"));
		element.getAttribute("value");
		String text = element.getText();
		return text;
	}

}
