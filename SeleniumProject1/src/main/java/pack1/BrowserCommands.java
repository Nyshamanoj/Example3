package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		//Browser commands/WebDriver commands-6 commands
		WebDriver driver=new ChromeDriver();//launch browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://selenium.obsqurazone.com/form-submit.php");//launch url
		String actualtitle=driver.getTitle();//to get title of the page
		System.out.println(actualtitle);
		String actualurl=driver.getCurrentUrl();//to get current url
		System.out.println(actualurl);
		String pagesource=driver.getPageSource();//to get the html code of the page
		System.out.println(pagesource);
		//driver.close();//close the current window
		driver.quit();//close all the windows
		//when only one tab is there both close and quit act same
		
		

	}

}
