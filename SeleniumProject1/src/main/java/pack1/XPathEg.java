package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathEg {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		//WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First name' and @type='text']"));
		firstname.sendKeys("Nysha");
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last name']"));
		//WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last name' or @type='text']"));
		lastname.sendKeys("Manoj");
		WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		//WebElement username=driver.findElement(By.xpath("//input[contains(@placeholder,'sernam')]"));
		//WebElement username=driver.findElement(By.xpath("//input[starts-with(@placeholder,'Userna')]"));
		username.sendKeys("nysha@123");
		WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		city.sendKeys("kalpetta");
		WebElement state=driver.findElement(By.xpath("//input[@placeholder='State']"));
		state.sendKeys("kerala");
		WebElement zip=driver.findElement(By.xpath("//input[starts-with(@placeholder,'Zi')]"));
		zip.sendKeys("673577");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		checkbox.click();
		WebElement submitbutton=driver.findElement(By.xpath("//button[text()='Submit form']"));//inner text
		submitbutton.click();
		
				

	}

}
