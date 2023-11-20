package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WelcomeTest {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("tutorial");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("tutorial");
		WebElement submitbutton=driver.findElement(By.name("submit"));
		submitbutton.click();
  }
  @BeforeTest
  public void beforeTest() {
	   driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://demo.guru99.com/test/newtours/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();

}
}
