package Foundation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public abstract class TestBases {
	private WebDriver driver;
	@BeforeMethod
	public void setup() {
		String osName = System.getProperty("os.name").toLowerCase();
		String BrowserType = System.getProperty("browzer.name").toLowerCase();
		String path = "";

		if(osName.contains("mac")) {
			if (BrowserType.equals("chrome")) {
			path ="src/test/resources/chromedriver"; }
			else if(BrowserType.equals("edge")) {
				path ="src/test/resources/msedgedriver";
			}
		}else if(osName.contains("windows")) {
			path ="src\\test\\resources\\chromedriver.exe"; 
		}

		File file = new File(path);
		String absolutePath = file.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", absolutePath);
		this.driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", absolutePath);
		this.driver = new EdgeDriver();

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
