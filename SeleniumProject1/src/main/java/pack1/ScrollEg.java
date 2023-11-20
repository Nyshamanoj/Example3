package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollEg {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		JavascriptExecutor js=(JavascriptExecutor)driver;//typecast driver to javascriptexecutor
		WebElement button=driver.findElement(By.id("button-two"));
		js.executeScript("arguments[0].scrollIntoView()",button);//scroll to the webelement
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//take screenshot
		File destFile=new File("C:\\Users\\ACER\\Desktop\\Obsqura\\myfirst.png");//specify the destination
		FileUtils.copyFile(srcFile, destFile);//copy scrfile to destination


	}

}
