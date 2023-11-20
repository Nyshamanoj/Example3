package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverSelenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/menu/#");
		Actions action=new Actions(driver);
		WebElement mainItem=driver.findElement(By.linkText("Main Item 2"));
		action.moveToElement(mainItem).perform();
		//moveToElement:mouse hover
		WebElement subItem=driver.findElement(By.partialLinkText("SUB SUB LIST »"));
		action.moveToElement(subItem).perform();
		WebElement subitemoption=driver.findElement(By.linkText("Sub Sub Item 1"));
		action.moveToElement(subitemoption).click().build().perform();
		//build:create a composite/combine action
	}

}
