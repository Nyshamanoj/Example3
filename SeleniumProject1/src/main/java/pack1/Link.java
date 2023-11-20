package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		/*linkText:use the entire text
		 * partialLinkText:partial value
		 */
		//WebElement formlink=driver.findElement(By.linkText("Form Submit"));
		WebElement formlink=driver.findElement(By.partialLinkText("Form Sub"));
		formlink.click();
	}

}
