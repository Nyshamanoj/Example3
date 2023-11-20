package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");//control is transfered to frame//second method
		
		//WebElement iframefirst=driver.findElement(By.id("frame1"));//locate the frame
		//driver.switchTo().frame(iframefirst);//third method
		
		//driver.switchTo().frame(2);//first method
		
		WebElement frame=driver.findElement(By.id("sampleHeading"));
		String msg=frame.getText();
		System.out.println(msg);
		driver.switchTo().defaultContent();//transfer control to main html document
		

	}

}
