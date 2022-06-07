import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.*;
import java.util.HashMap;

public class CSVTest {
  @Test
  public void HAshMapTest() {
	  HashMap<String,String> ExpectedMap = new HashMap<String,String> ();
	    ExpectedMap.put("Make","Model");
		ExpectedMap.put("Warwick","Corvette");
		ExpectedMap.put("Warwick","Thumb");
		ExpectedMap.put("Warwick","Streamer");
		ExpectedMap.put("Fender","Precision");
	    ExpectedMap.put("Fender","Jazz");
	    ExpectedMap.put("Yamaha","BB500");
	  
	    HashMap<String,String> MapTest = new HashMap<String,String> ();
	        
	  String path = "src//test//resources//basses.csv";
	  String sp =null;
	  String First[] = null;
	  String Second[] = null;
	  try {
		  BufferedReader Base  = new BufferedReader (new FileReader(path));
		while((sp=Base.readLine())!= null) {
			First = sp.split(",");
			Second = sp.split(",");
			MapTest.put(First[0], Second[1]);
			
		}	
	} catch (FileNotFoundException e) {
		e.printStackTrace();	
	} catch (IOException I) {
		I.printStackTrace();
	} 
	  
	System.out.println(ExpectedMap);
	System.out.println(MapTest);
	 assertEquals(MapTest,ExpectedMap,"one hash map did not match "); 
  }
}
