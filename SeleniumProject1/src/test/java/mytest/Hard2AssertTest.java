package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard2AssertTest {
  @Test
  public void f() {
	  String actualvalue="Hello";
	  String expectedvalue="world";
	 // String expectedvalue="world";
	  //In hard assert we will use the static methods of Assert class
	  Assert.assertEquals(actualvalue, expectedvalue);
	  System.out.println("remaining statement");
  }
}
