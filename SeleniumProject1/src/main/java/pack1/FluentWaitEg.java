package pack1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitEg {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://selenium.obsqurazone.com/form-submit.php");//launch url
		WebElement firstname=driver.findElement(By.id("validationCustom01"));
		firstname.sendKeys("Nysha");
		WebElement lastname=driver.findElement(By.id("validationCustom02"));
		lastname.sendKeys("Manoj");
		Wait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.visibilityOf(lastname));
				
		WebElement checkbox=driver.findElement(By.id("invalidCheck"));
		checkbox.click();
		WebElement submitbutton=driver.findElement(By.className("btn-primary"));
		submitbutton.click();

	}

}
