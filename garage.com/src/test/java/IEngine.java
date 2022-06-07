//interface
interface IEngine {

	final int CylinderCount =0;
	void Start ();
	}

abstract class LargeEngine implements IEngine {

	public void Start(){ 
		System.out.println("Engine Started"); 
	}
}

  
