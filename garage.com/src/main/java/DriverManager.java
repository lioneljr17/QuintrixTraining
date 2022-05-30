import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class DriverManager {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	protected void setDriver(WebDriver driver) {
		this.driver = driver;
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
		this.driver = new ChromeDriver();
		System.setProperty("webdriver.Edge.driver","src/test/resources/Edgedriver");
		this.driver = new EdgeDriver();
	}
	public void Chromedriver() {
		
	}

	public void EdgeManager() {
		// TODO Auto-generated method stub
		
	}
	public void quit() {
		if (this.getDriver() != null) {
			this.getDriver().quit();
		}
}
}