package mytest;

import org.testng.annotations.Test;
//import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MercuryToursTest {
	WebDriver driver;
	@Parameters({"username","password"})
	
 @Test
  public void f(String username,String password) {
	    WebElement usernamefield=driver.findElement(By.name("userName"));
		usernamefield.sendKeys(username);
		WebElement passwordfield=driver.findElement(By.name("password"));
		passwordfield.sendKeys(password);
		WebElement submitbutton=driver.findElement(By.name("submit"));
		submitbutton.click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://demo.guru99.com/test/newtours/");//launch url
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
