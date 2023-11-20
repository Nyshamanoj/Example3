package pack1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		List<WebElement>gender=driver.findElements(By.name("student-gender"));
		gender.get(0).click();
		List<WebElement>age=driver.findElements(By.name("student-age"));
		age.get(1).click();
		boolean f=gender.get(0).isSelected();//whether selected is correct or not
		System.out.println(f);
		
		
		

	}

}
