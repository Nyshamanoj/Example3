package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEg3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("Nysha");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("Manoj");
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("9947450582");
		WebElement email=driver.findElement(By.xpath("//input[@id='userName']"));
		email.sendKeys("nyshamanojap@gmail.com");
		WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
		address.sendKeys("Kunnakadan house");
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Kalpetta");
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("Kerala");
		WebElement postalcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		postalcode.sendKeys("673577");
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("nysha@123");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("12344567899");
		WebElement confirmpassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmpassword.sendKeys("12344567899");
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
		;
	}

}
