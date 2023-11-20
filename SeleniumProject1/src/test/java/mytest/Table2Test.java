package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Table2Test {
	WebDriver driver;

  @Test
  public void f() {
	  WebElement tableheader=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[2]"));
	  WebElement tableheader2=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]//td[2]"));

	  String value=tableheader.getText();
	  String value2=tableheader2.getText();	 
	  System.out.println(value);
	  System.out.println(value2);

  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");

  }

  @AfterTest
  public void afterTest() {
  }

}
