package mytest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
  @Test
  public void f() {
	  SoftAssert softassert =new SoftAssert();
	  String expectedvalue="hello";
	  String actualvalue="world";
	  softassert.assertEquals(actualvalue, expectedvalue);  
	  System.out.println("remaining statement");
	  softassert.assertAll();
  }
  @Test
  public void g() {
	  SoftAssert softassert =new SoftAssert();
	  boolean expected=false;
	  softassert.assertTrue(expected);
	  	 //expect=true
	  	  //pass=true
	  	  //fail=false
	  softassert.assertAll();

	  }
  @Test
  public void h() {
	  SoftAssert softassert =new SoftAssert();
	  boolean expected=true;
	  softassert.assertFalse(expected);
	  //expect=false
	  //pass=false
	  //fail=true
	  	  softassert.assertAll();
	  
}
}
