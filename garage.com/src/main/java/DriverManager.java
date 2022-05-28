import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	protected void setDriver(WebDriver driver) {
		this.driver = driver;
		
	}
	public void quit() {
		if (this.getDriver() != null) {
			this.getDriver().quit();
		}

}
}