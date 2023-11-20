package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement uploadElement=driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\Users\\ACER\\Desktop\\Obsqura\\1.jpg");//shift+right click--->copy as path
		WebElement checkbox=driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submitbutton=driver.findElement(By.id("submitbutton"));
		submitbutton.click();
		

	}

}
