package pack1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//launch browser
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
		
		driver.manage().window().maximize();//maximize the window
		
		driver.get("https://selenium.obsqurazone.com/window-popup.php");//launch url
		WebElement element=driver.findElement(By.partialLinkText("  Like us On Facebook "));
		element.click();
		String parent=driver.getWindowHandle();
		Set<String> child=driver.getWindowHandles();
		Iterator<String> i=child.iterator();
		while(i.hasNext()) {
			String currentpoint=i.next();//return the value and move the pointer
			if(!currentpoint.equals(parent)) {
				driver.switchTo().window(currentpoint);
			
				WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
				email.sendKeys("hello");

			}
		}
		
		driver.switchTo().window(parent);
		driver.quit();
	}

}
