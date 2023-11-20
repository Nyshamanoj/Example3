package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSelenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");//launch url
		WebElement iframe=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);//second method
		WebElement dragElement=driver.findElement(By.id("draggable"));
		WebElement dropElement=driver.findElement(By.id("droppable"));
		//Actions:for keyboard and mouse interactions
		//Drag and drop handled
		Actions action=new Actions(driver);
		action.dragAndDrop(dragElement, dropElement).perform();
		//perform:to execute the action
		driver.switchTo().defaultContent();//switch to main content

	}

}
