package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TourTest {
	WebDriver driver;
  @Test
  public void f() {
	 WebElement firstname= driver.findElement(By.name("firstName"));
	 firstname.sendKeys("Nysha");
	WebElement lastname= driver.findElement(By.name("lastName"));
	lastname.sendKeys("Manoj");
	WebElement phone=driver.findElement(By.name("phone"));
	phone.sendKeys("9495616988");
	WebElement email=driver.findElement(By.name("userName"));
	email.sendKeys("nyshamanojap@gmail.com");
	WebElement address=driver.findElement(By.name("address1"));
	address.sendKeys("kunnakadan house");
	WebElement city=driver.findElement(By.name("city"));
	city.sendKeys("Kalpetta");
	WebElement state=driver.findElement(By.name("state"));
	state.sendKeys("kerala");
	WebElement postalcode=driver.findElement(By.name("postalCode"));
	postalcode.sendKeys("673577");
	WebElement username=driver.findElement(By.name("email"));
	username.sendKeys("tutorial");
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("tutorial");
	WebElement confirmpwd=driver.findElement(By.name("confirmPassword"));
	confirmpwd.sendKeys("tutorial");
	WebElement submitbutton=driver.findElement(By.name("submit"));
	submitbutton.click();
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
