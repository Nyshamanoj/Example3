package pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://demo.guru99.com/popup.php");
		WebElement element=driver.findElement(By.partialLinkText("Click Here"));
		element.click();
		String parent=driver.getWindowHandle();
		Set<String>child=driver.getWindowHandles();
		Iterator<String> i=child.iterator();
		while(i.hasNext()) {
			String currentpoint=i.next();//return the value and move the pointer
			if(!currentpoint.equals(parent)) {
				driver.switchTo().window(currentpoint);
				Thread.sleep(5000);
				//WebElement email=driver.findElement(By.name("emailid"));
				WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
				email.sendKeys("hello");
				WebElement submitbutton=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submitbutton.click();

			}
		}
		driver.switchTo().window(parent);
		//driver.quit();

	}

}
