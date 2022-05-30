
public class DriverManagerFactory extends DriverManager {
	public String getmanager (String browserType ) {
		if (browserType.equals("chrome")) {
			this.setDriver(getDriver());
			this.Chromedriver();
	 }else if(browserType.equals("edge")) {
			this.setDriver(getDriver());
	 }else {
		 throw new RuntimeException();
	 }
		return browserType;
	}

}
