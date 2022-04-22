package garage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	@Test
	public void comparesValueTypesUsingIsEqualToOperator() {
		  String Data1 = "test";
		  String Data2 = "test";
		  
		  boolean result = Data1 == Data2;
		  
		 assertEquals(result,true,"Data1 and Data2 does not have the same string");  
	  }
	
  @Test
  public void comparesReferenceTypesUsingIsEqualToOperator() {
	  String Data1 = new String("this is 1");
	  String Data2 = new String("this is not 1");
	 
	  boolean Should = Data1 ==Data2;

	  assertEquals(false, Should,"the boolean was true");  
  	   }
  
  @Test
  public void comparesReferenceTypesUsingEqualsMethod() {
	  String Data1 = new String("this is 1");
	  String Data2 = new String("this is 1");
	  
	  boolean result = Data1.equals(Data2);
	  
	 assertEquals(result,true,"the value of data1 does not match data2");  
  	   }
  
  @Test
  public void compareUsinglogicoperation() {
	 String fun ="hi";
	 String expected = "having fun";
	 int x = 1;
	 int y =3;
	 
	 if((x == 1)&& (y ==3 )) {
		 fun = fun.replace("hi", "having fun");
		
	 }
	 assertEquals(fun, expected,"the string 'fun' did not get replace");
	  
  	 }
  
  @Test
  public void compareusinglogicoperation() {
	  String fun ="hi";
		 String expected = "having fun";
		 int x = 1;
		 int y =3;
		 
		 if((x == 1)|| (y ==3 )) {
			 fun = fun.replace("hi", "having fun");	
		 }
		 
		 assertEquals(fun, expected,"the string 'fun' did not get replace");
  	   }
  @Test
  public void numbersArePostIncrementedanddecremented() {
	  int ManyStudents= 5;
	  int Manyteacher =5 ;
	  
	  ManyStudents = Manyteacher++;
	  ManyStudents = --Manyteacher;
	  
	  assertEquals(ManyStudents, Manyteacher,"manyStudents did not incrumented");
	  
	  
  	  }
  @Test
  public void creatingabooleantobefalse() {
	 String MyName= "lionel";
	 String Name ="";
	 
	 boolean Getname =! true;
	 
	 if ( Getname == false) {
		  Name = Name.replace("",  "lionel");
	 }
	  
	  assertEquals(MyName, Name,"myname and name so not have the same value");
  	 }
  
  @Test
  public void compareusingifoperator() {
	  int AmountOfWeek =6;
	  int Day = 0;
	  
	  if (AmountOfWeek >=6) {
		   Day =6;
	  }
	  
	  assertEquals(AmountOfWeek,Day,"day is nor equal to amount do weeks");
    }
  
  @Test
  public void compareusingifelseoperator() {
	  int AmountOfWeek =6;
	  int Day = 0;
	  
	  if (AmountOfWeek == 8) {
		   Day =5;
	  } else {
		  Day = 6;
	  }
	  
	  assertEquals(AmountOfWeek,Day,"day did not update to amountOfweek");
	  
      }
  
  @Test
  public void compareusingloop() {
	  int x =5;
	  int y =0;
	  
	  for (int i= 0; i < 5 ; i++) {
		   y++;	  
	  }
	  assertEquals(y, x,"the int Y did not incrumented everytime the look run to equal to x");  
    }
  
  @Test
  public void comparewithexeption() {
	  int FirstNum= 50;
	  int secondNum =0;
	  boolean doestthrowexception = false;
	  
	  
		  try {
			  int result = FirstNum/secondNum;
		  }
		  catch(ArithmeticException NOT) {
			  System.out.println("you cannot divid");
			  doestthrowexception = true;
		  } 
	  assertTrue(doestthrowexception,"exection was not throw");  		
  	 }  
  
  @Test
  public void compareusingarraylistloop() {
	  List<String> weeks = Arrays.asList("week1","week2","week3");
	  int weeksnumber =0;
	  for (int i= 0;i< weeks.size();i++) {
		  System.out.println(weeks.get(i));
		  weeksnumber++;
	  }
	  assertEquals(3, weeksnumber, "the for loop did not run properly for the weeksnumber to incrument");  
  }
  
}
