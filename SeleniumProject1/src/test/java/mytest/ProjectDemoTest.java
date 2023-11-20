package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ProjectDemoTest {
	WebDriver driver;
  @Test
  public void f() {
	 WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
	 username.sendKeys("admin");
	 WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	 password.sendKeys("123456");
	 WebElement checkbox=driver.findElement(By.xpath("//input[@name='remember']"));
	 checkbox.click();
	 WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	 loginbutton.click();
	 WebElement endtour=driver.findElement(By.xpath("//button[text()='End tour']"));
	 endtour.click();
	WebElement contacts=driver.findElement(By.xpath("//a[@id='tour_step4_menu']"));
	contacts.click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://qalegend.com/billing/public/home");//launch url
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}
