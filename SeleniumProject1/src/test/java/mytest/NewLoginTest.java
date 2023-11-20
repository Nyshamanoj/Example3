package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewLoginTest {
	WebDriver driver;

  @Test
  public void f() {
	 WebElement email= driver.findElement(By.name("email"));
	 email.sendKeys("admin@admin.com");	
	WebElement password= driver.findElement(By.name("password"));
	password.sendKeys("12345678");
	WebElement signin=driver.findElement(By.className("btn-primary"));
	signin.click();
	 		
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://qalegend.com/crm/index.php/signin");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
