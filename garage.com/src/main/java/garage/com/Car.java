package garage.com;
 


public class Car {
	
	
	private int odometer;
	
	String model;
	
	
	public void StartEngine() {
		
	}
	public void StopEngine() {
		
	}
	


	public int getOdometer() {
		return odometer;
	}
	
	 
}

interface IEngine {
    
    // public, static and final
    final int CylinderCount =0;
  
    // public and abstract
    void Start ();
}
  
abstract // A class that implements the interface.
class LargeEngine implements IEngine {
    
    // Implementing the capabilities of
    // interface.
    public void Start(){ 
      System.out.println("Engine Started"); 
    }
}