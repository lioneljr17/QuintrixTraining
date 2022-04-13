import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.*;
import java.util.HashMap;

public class CSVTest {
  @Test
  public void f() {
	  String path ="//Users//lioneldesroses//git/QuintrixTraining/garage.com//src//test//resources//basses.csv";
	  String C =null;
	  BufferedReader Base = null;
	  String Make[] = null;
	  String Models[] = null;
	  try {
		Base  = new BufferedReader (new FileReader(path));
		while((C=Base.readLine())!= null) {
			Make = 	C.split(",");
			Models = C.split(",");
			//System.out.printf(Make[0],Model[1]);
			HashMap<String,String> newtest = new HashMap<String,String> ();
			newtest.put(Make[0], Models[1]);
			System.out.println(newtest);
		}	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	  assertEquals(C, C,"THE FILE WAS INCORECT");  
  }
}
