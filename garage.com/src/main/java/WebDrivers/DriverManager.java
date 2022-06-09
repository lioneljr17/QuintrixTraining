package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class DriverManager {
	private WebDriver driver;

	public WebDriver getDriver() {
		return this.driver;
	}
	public abstract void createDriver();
	

	protected void setDriver(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void quit() {
		if (this.getDriver() != null) {
			this.getDriver().quit();
		}
}
}