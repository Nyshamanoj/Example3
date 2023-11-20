package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTest {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement username=driver.findElement(By.id("username"));
	  username.sendKeys("admin");
	  WebElement password=driver.findElement(By.id("password"));
	  password.sendKeys("123123");
	 WebElement checkbox= driver.findElement(By.name("remember"));
	 checkbox.click();
	WebElement loginbutton= driver.findElement(By.className("btn-primary"));
	loginbutton.click();
  }
  @BeforeTest
  public void beforeTest() {
	   driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://qalegend.com/billing/public/login");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
