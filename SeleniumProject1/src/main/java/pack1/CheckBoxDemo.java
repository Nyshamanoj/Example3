package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		List<WebElement>checkbox=driver.findElements(By.className("check-box-list"));
		checkbox.get(0).click();
		checkbox.get(1).click();
		boolean f=checkbox.get(3).isSelected();
		System.out.println(f);
	}

}
