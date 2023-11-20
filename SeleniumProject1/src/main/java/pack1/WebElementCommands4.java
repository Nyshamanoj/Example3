package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://selenium.obsqurazone.com/form-submit.php");//launch url
		WebElement firstname=driver.findElement(By.id("validationCustom01"));
		firstname.sendKeys("Nysha");
		WebElement lastname=driver.findElement(By.id("validationCustom02"));
		lastname.sendKeys("Manoj");
		WebElement checkbox=driver.findElement(By.id("invalidCheck"));
		checkbox.click();
		boolean firstnameDisplayed=firstname.isDisplayed();//visible or not
		System.out.println("First name is displayed:"+firstnameDisplayed);
		boolean firstnameEnabled=firstname.isEnabled();//enabled or not
		System.out.println("First name is enabled:"+firstnameEnabled);
		String tagname=firstname.getTagName();//get the tag name
		System.out.println("Tag name:"+tagname);
		String attribute=firstname.getAttribute("placeholder");//get the attribute value
		System.out.println("Attribute value:"+attribute);
		Dimension d=firstname.getSize();//get the size
		System.out.println("Height:"+d.height+"Width:"+d.width);
		Point p=firstname.getLocation();
		System.out.println("X axis:"+p.x+"Y axis:"+p.y);
		String css=firstname.getCssValue("font-weight");//get the css property
		System.out.println("Font size:"+css);
		WebElement submitbutton=driver.findElement(By.className("btn-primary"));
		submitbutton.submit();//element is in form and type=submit we can use submit method
		//benefit:it will wait until new page is loaded
		String innertext=submitbutton.getText();
		System.out.println("Inner text:"+innertext);
		

	}

}
