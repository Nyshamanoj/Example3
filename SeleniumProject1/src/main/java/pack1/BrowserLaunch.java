package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		/*ChromeDriver is a class
		 * WebDriver is interface
		 */
		WebDriver driver=new ChromeDriver();//launch browser
		driver.get("https://selenium.obsqurazone.com/form-submit.php");//launch url
		//get method parameter is string and return is void
		driver.manage().window().maximize();//maximize the window
		
		

	}

}
