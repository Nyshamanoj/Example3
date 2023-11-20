package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement dragElement=driver.findElement(By.id("draggable"));
		WebElement dropElement=driver.findElement(By.id("droppable"));
		//In order to drag and drop we need the class-Action
		//Hence creating the object of the class
		Actions actions=new Actions(driver);
		// Action class is used for keyboard and mouse interactions
		actions.dragAndDrop(dragElement, dropElement).perform();
		//perform() is a method which is used to execute the action)


	}

}
