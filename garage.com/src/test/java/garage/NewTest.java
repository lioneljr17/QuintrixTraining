package garage;
import static org.testng.Assert.assertEquals;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	@Test
	public void f1() {
		  String Data1 = "test";
		  String Data2 = "test";
		  
		  boolean result = Data1 == Data2;
		  
		 assertEquals(result,true,"Data1 and Data2 does not have the same string");  
	  }
	
  @Test
  public void f2() {
	  String Data1 = new String("this is 1");
	  String Data2 = new String  ("this is not 1");
	 
	  boolean Should = Data1 ==Data2;

	  assertEquals( false, Should,"the boolean was true");  
  	   }
  
  @Test
  public void f3() {
	  String Data1 = new String("this is 1");
	  String Data2 = new String  ("this is 1");
	  
	  boolean result = Data1.equals(Data2);
	  
	 assertEquals(result,true,"the value of data1 does not match data2");  
  	   }
  
  @Test
  public void f4() {
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
  public void f5() {
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
  public void f6() {
	  int ManyStudents= 5;
	  int Manyteacher =5 ;
	  
	  ManyStudents = Manyteacher++;
	  ManyStudents = --Manyteacher;
	  
	  assertEquals(ManyStudents, Manyteacher,"manyStudents did not incrumented");
	  
	  
  	  }
  @Test
  public void f7() {
	 String MyName= "lionel";
	 String Name ="";
	 
	 boolean Getname =! true;
	 
	 if ( Getname == false) {
		  Name = Name.replace("",  "lionel");
	 }
	  
	  assertEquals(MyName, Name,"myname and name so not have the same value");
  	 }
  
  @Test
  public void f8() {
	  int AmountOfWeek =6;
	  int Day = 0;
	  
	  if (AmountOfWeek >=6) {
		   Day =6;
	  }
	  
	  assertEquals(AmountOfWeek,Day,"day is nor equal to amount do weeks");
    }
  
  @Test
  public void f9() {
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
  public void f10() {
	  int x =5;
	  int y =0;
	  
	  for (int i= 0; i < 5 ; i++) {
		   y++;	  
	  }
	  assertEquals(y, x,"the int Y did not incrumented everytime the look run to equal to x");  
    }
  
  @Test
  public void f11() {
	  int FirstNum= 50;
	  int secondNum =0;
	  int result = 0;
	  
		  try {
			  result = FirstNum/secondNum;
		  }
		  catch(ArithmeticException NOT) {
			  System.out.println("you cannot divid");
		  } 
	  assertEquals(secondNum, result, "numbers could not be divided.");  		
  	 }  
  
  @Test
  public void f12() {
	  List<String> weeks = Arrays.asList("week1","week2","week3");
	  int weeksnumber =0;
	  for (int i= 0;i< weeks.size();i++) {
		  System.out.println(weeks.get(i));
		  weeksnumber++;
	  }
	  assertEquals(3, weeksnumber, "the for loop did not run properly for the weeksnumber to incrument");  
  }
  
}
