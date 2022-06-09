package WebDrivers;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManagemer extends DriverManager {
 @Override
 public void createDriver () {
	 System.setProperty("webdriver.Edge.driver","src/main/resources/Edgedriver");
		this.setDriver(new EdgeDriver());
 }
}
