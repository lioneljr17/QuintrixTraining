import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestBase {
  @Test
  public void DriverTest(String browserType) {
	  DriverManagerFactory driverManagerFactory = new DriverManagerFactory();
	  driverManagerFactory.getmanager(browserType);
  }
}
