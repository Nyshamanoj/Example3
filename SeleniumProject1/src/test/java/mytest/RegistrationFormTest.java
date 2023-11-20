package mytest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class RegistrationFormTest {
	WebDriver driver;
  @Test
  public void f() {
	  SoftAssert softassert=new SoftAssert();
	  WebElement firstname=driver.findElement(By.id("validationCustom01"));
		firstname.sendKeys("Nysha");
		boolean c=firstname.isDisplayed();
		softassert.assertTrue(c);
		
		WebElement lastname=driver.findElement(By.id("validationCustom02"));
		lastname.sendKeys("Manoj");
		boolean d=lastname.isEnabled();
		softassert.assertTrue(d);
		
		WebElement username=driver.findElement(By.id("validationCustomUsername"));
		username.sendKeys("tutorial");
		boolean e=username.isEnabled();
		softassert.assertTrue(e);
		
		WebElement city=driver.findElement(By.id("validationCustom03"));
		city.sendKeys("kalpetta");
		boolean f=city.isEnabled();
		softassert.assertTrue(f);
		
		WebElement state=driver.findElement(By.id("validationCustom04"));
		state.sendKeys("kerala");
		boolean g=state.isEnabled();
		softassert.assertTrue(g);
		
		WebElement zip=driver.findElement(By.id("validationCustom05"));
		zip.sendKeys("673577");
		boolean h=zip.isEnabled();
		softassert.assertTrue(h);
		
		WebElement checkbox=driver.findElement(By.id("invalidCheck"));
		checkbox.click();
		WebElement submitbutton=driver.findElement(By.className("btn-primary"));
		submitbutton.click();
		WebElement msg=driver.findElement(By.id("message-one"));
		String actualMsg=msg.getText();
		String expectedMsg="Form has been submitted successfully!";
		softassert.assertEquals(actualMsg, expectedMsg);
		softassert.assertAll();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://selenium.obsqurazone.com/form-submit.php");//launch url
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
