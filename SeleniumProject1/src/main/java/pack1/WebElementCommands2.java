package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("tutorial");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("tutorial");
		WebElement submitbutton=driver.findElement(By.name("submit"));
		submitbutton.click();
		

	}

}
