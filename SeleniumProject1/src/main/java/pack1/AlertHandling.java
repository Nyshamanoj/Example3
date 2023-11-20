package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		//for first alert--->simple alert
		WebElement alertbutton1=driver.findElement(By.className("btn-success"));
		alertbutton1.click();
		Alert alert1=driver.switchTo().alert();//to transfer control to alert
		String msg=alert1.getText();
		System.out.println(msg);
		alert1.accept();
		
		//for second alert--->confirmation alert
		WebElement alertbutton2=driver.findElement(By.className("btn-warning"));
		alertbutton2.click();
		Alert alert2=driver.switchTo().alert();
		String msg2=alert2.getText();
		System.out.println(msg2);
		alert2.dismiss();//cancel
		//alert2.accept();
		
		//for third alert--->prompt alert
		WebElement alertbutton3=driver.findElement(By.className("btn-danger"));
		alertbutton3.click();
		Alert alert3=driver.switchTo().alert();
		String msg3=alert3.getText();
		System.out.println(msg3);
		alert3.sendKeys("nysha123");
		alert3.accept();
		//alert3.dismiss();
		

	}

}
