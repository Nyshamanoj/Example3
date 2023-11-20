package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEg2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement username=driver.findElement(By.xpath("//input[@name='userName']"));
		username.sendKeys("tutorial");
		WebElement password=driver.findElement(By.xpath("//input[contains(@name,'passwo')]"));
		password.sendKeys("tutorial");
		WebElement submitbutton=driver.findElement(By.xpath("//input[@name='submit']"));
		submitbutton.click();

	}

}
