package Foundation;

public class WebDriverFactory extends TestBases {
	
	public String getManager(String browserType) {
		if(browserType.equals("edge")) {
			this.setup();
		}else if(browserType.equals("chrome")) {
			this.setup();
		}
		return browserType;

	}
}
