package WebDrivers;


public class DriverManagerFactory {
	public DriverManager getmanager (String browserType ) {
		
		if (browserType.equals("chrome")) {
			return new ChromeDriverManager();
			
		}else if(browserType.equals("edge")) {
			return new EdgeDriverManagemer();
	 }else {
		 throw new RuntimeException(browserType + " is not a supported browser.");
	 }
	}

}
