package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement firstname=driver.findElement(By.name("firstName"));
		firstname.sendKeys("Nysha");
		WebElement lastname=driver.findElement(By.name("lastName"));
		lastname.sendKeys("Manoj");
		WebElement phone=driver.findElement(By.name("phone"));
		phone.sendKeys("9495616988");
		WebElement email=driver.findElement(By.name("userName"));
		email.sendKeys("nyshamanojap@gmail.com");
		WebElement address=driver.findElement(By.name("address1"));
		address.sendKeys("kunnakadan house");
		WebElement city=driver.findElement(By.name("city"));
		city.sendKeys("kalpetta");
		WebElement state=driver.findElement(By.name("state"));
		state.sendKeys("kerala");
		WebElement postalcode=driver.findElement(By.name("postalCode"));
		postalcode.sendKeys("673577");
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("tutorial");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("tutorial");
		WebElement confirmpassword=driver.findElement(By.name("confirmPassword"));
		confirmpassword.sendKeys("tutorial");
		WebElement submitbutton=driver.findElement(By.name("submit"));
		submitbutton.click();
		

	}

}
