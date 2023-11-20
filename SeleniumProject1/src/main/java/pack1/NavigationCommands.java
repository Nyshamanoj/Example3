package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		driver.navigate().to("https://demo.guru99.com/test/newtours/");//it store browser history
		driver.navigate().back();//back
		driver.navigate().forward();//forward
		driver.navigate().refresh();//refresh
		
		}

}
