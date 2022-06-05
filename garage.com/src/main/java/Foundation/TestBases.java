package Foundation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBases {
	private WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/msedgedriver");
		this.driver =  new EdgeDriver();
		this.driver = new ChromeDriver();

		SetOptions();
	}

	private void SetOptions() {
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void quit() {
		if (this.getDriver() != null) {
			this.getDriver().quit();
		}
	}

	protected WebDriver getDriver() {
		return this.driver;
	}
}
