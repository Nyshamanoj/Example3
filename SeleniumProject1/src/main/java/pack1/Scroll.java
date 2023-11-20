package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		JavascriptExecutor js=(JavascriptExecutor)driver;//typecast driver to javascriptexecutor
		js.executeScript("window.scrollBy(0,500)");//vertical down 500 pixel
        js.executeScript("window.scrollBy(0,-100)");//vertical scroll up 100 pixel
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scroll to the bottom of the page
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        WebElement button=driver.findElement(By.id("button-two"));
		js.executeScript("arguments[0].scrollIntoView()",button);//scroll to the webelement
	}

}
