package mytest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TableDataTest {
	WebDriver driver;
  @Test
  public void f() {
	 // print table data
	  List<WebElement>tableheader=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td"));
	  ArrayList<String> header=new ArrayList<String>();
	  
	  for(int i=0;i<tableheader.size();i++) {
		  String value=tableheader.get(i).getText();
		  header.add(value);
		  
	  }
	  System.out.println(header);
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
