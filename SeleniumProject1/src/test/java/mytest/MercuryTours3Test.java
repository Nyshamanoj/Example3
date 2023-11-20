package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class MercuryTours3Test {
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
	@Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browser) {
		 if(browser.equalsIgnoreCase("chrome")) {
			  driver=new ChromeDriver();//launch browser
			  }
			  else if(browser.equalsIgnoreCase("edge")) {
			  driver=new EdgeDriver();
		  }
			  else {
				  System.out.println("please enter correct browser");
			  }
			  driver.manage().window().maximize();//maximize the window
			  driver.navigate().to("https://demo.guru99.com/test/newtours/");
			  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
