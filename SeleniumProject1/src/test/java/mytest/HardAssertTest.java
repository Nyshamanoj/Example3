package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {
  @Test
  public void f() {
	  String actualvalue="Hello";
	  //String expectedvalue="Hello";
	  String expectedvalue="world";
	  //In hard assert we will use the static methods of Assert class
	  Assert.assertEquals(actualvalue, expectedvalue);
  }
  @Test
  public void h() {
	  boolean f=false;
	  //boolean f=true;
	   Assert.assertTrue(f);
	   //true=pass
	  //false=fail
  }
 }
