package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://jqueryui.com/droppable/");
		WebElement iframe=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);//second method
		driver.switchTo().defaultContent();


	}

}
