package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TableTest {
	WebDriver driver;
  @Test
  public void f() {
	  //print the header of the table
	  List<WebElement>tableheader=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
	  for(int i=0;i<tableheader.size();i++) {
		  String value=tableheader.get(i).getText();
		// getText method helps retrieve the text which is basically the innertext of a webElement and it returns String as a result
		  System.out.println(value);
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
  }
  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
