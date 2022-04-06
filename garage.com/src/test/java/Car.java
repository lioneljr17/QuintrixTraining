
 
public class Car {
	public Car() {
		this.model = "Corvette";
	
		
		
		
	}
	
	
	private int odometer;
	
	public String model;
	
	public String engine;
	
	
	public void StartEngine() {
		
		}
	public void StopEngine() {
		
		}
	


	public int getOdometer() {
		return odometer;
		}
	
}


//interface
interface IEngine {
    
    
    final int CylinderCount =0;
  
    
    void Start ();
	}
  
abstract 
class LargeEngine implements IEngine {
    
    
    public void Start(){ 
      System.out.println("Engine Started"); 
    }
}