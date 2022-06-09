import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestBase extends {
  @Test
  public void DriverTest() {
	  HomePage URL = new HomePage(this.getDriver())
				.navigate();
  }
}
