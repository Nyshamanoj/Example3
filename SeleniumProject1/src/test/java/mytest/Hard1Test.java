package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard1Test {
  @Test
  public void f() {
	  String actualvalue="Hello";
	  String expectedvalue="Hello";
	 // String expectedvalue="world";
	  //In hard assert we will use the static methods of Assert class
	  Assert.assertEquals(actualvalue, expectedvalue);
  }
  @Test
  public void g() {
	  boolean expected=false;
	  Assert.assertTrue(expected);
	  //expect=true
	  //pass=true
	  //fail=false
  }
  @Test
  public void h() {
	  boolean expected=false;
	  Assert.assertFalse(expected);
	  //expect=false
	  //pass=false
	  //fail=true
  }
}

