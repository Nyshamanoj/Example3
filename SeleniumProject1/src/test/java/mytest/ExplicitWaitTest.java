package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class ExplicitWaitTest {
	WebDriver driver;
	@Parameters({"username","password"})
  @Test
  public void f(String username,String password) {
		
		 WebDriverWait wait=new WebDriverWait (driver, Duration.ofSeconds(10));
		
		 WebElement usernamefield=driver.findElement(By.name("userName"));
		 wait.until(ExpectedConditions.visibilityOf(usernamefield));//usernamefield is displayed or not and it will wait to come usernamefield max of 10 sec
		 usernamefield.sendKeys(username);
		 
		WebElement passwordfield=driver.findElement(By.name("password"));
		WebDriverWait wait2=new WebDriverWait (driver, Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.visibilityOf(passwordfield));
		passwordfield.sendKeys(password);
		
			WebElement submitbutton=driver.findElement(By.name("submit"));
			wait.until(ExpectedConditions.elementToBeClickable(submitbutton));
			submitbutton.click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://demo.guru99.com/test/newtours/");
		WebDriverWait wait=new WebDriverWait (driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("https://demo.guru99.com/test/newtours/"));//to check url

  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}
