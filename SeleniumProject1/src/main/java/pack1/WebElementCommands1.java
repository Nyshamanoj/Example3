package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands1 {

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
		WebElement submitbutton=driver.findElement(By.className("btn-primary"));
		submitbutton.click();


	}

}
