package WebDrivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {
	@Override
	public void createDriver() {
		ChromeOptions options = buildOptions();
		ChromeDriver driver = new ChromeDriver(options);		

		this.setDriver(driver);	
	}
	private ChromeOptions buildOptions() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

		ChromeOptions options = new ChromeOptions();

		return options;
	}

}
