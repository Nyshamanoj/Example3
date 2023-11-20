package mytest;

import org.testng.annotations.Test;

public class Hard3Test {
  @Test(priority=1)
  public void b() {
	  System.out.println("@testb");
  }
  @Test(priority=2)
  public void a() {
	  System.out.println("@testa");
  }
  @Test(priority=3)
  public void c() {
	  System.out.println("@testc");
  }
  }

