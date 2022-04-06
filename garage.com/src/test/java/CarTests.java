import org.testng.annotations.Test;

public class CarTests {
  @Test
  public void f() {
  }
  
  @Test
  public void canBuildCar() {
	  Car myCar = new Car();
	  String model = myCar.model;
	  myCar.StartEngine();
	  
	  
  }
}

