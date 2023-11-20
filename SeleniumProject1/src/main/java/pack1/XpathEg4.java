package pack1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathEg4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		List<WebElement> trip=driver.findElements(By.xpath("//input[@name='tripType']"));
		trip.get(1).click();
		WebElement passenger=driver.findElement(By.xpath("//select[@name='passCount']"));
		Select passengerdrp=new Select(passenger);
		passengerdrp.selectByValue("2");
		WebElement depart=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select departdrp=new Select(depart);
		departdrp.selectByValue("Acapulco");
		WebElement onMonth=driver.findElement(By.xpath("//select[@name='fromMonth']"));
		Select onMonthdrp=new Select(onMonth);
		onMonthdrp.selectByVisibleText("January");
		WebElement onDate=driver.findElement(By.xpath("//select[@name='fromDay']"));
		Select onDatedrp=new Select(onDate);
		onDatedrp.selectByIndex(2);
		WebElement arrive=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select arrivedrp=new Select(arrive);
		arrivedrp.selectByValue("Frankfurt");
		WebElement returnmonth=driver.findElement(By.xpath("//select[@name='toMonth']"));
		Select rtrnmnthdrp=new Select(returnmonth);
		rtrnmnthdrp.selectByVisibleText("November");
		WebElement returndate=driver.findElement(By.xpath("//select[@name='toDay']"));
		Select returndatedrp=new Select(returndate);
		returndatedrp.selectByValue("8");
		List<WebElement>travelclass=driver.findElements(By.xpath("//input[@name='servClass']"));
		travelclass.get(2).click();
		WebElement airline=driver.findElement(By.xpath("//select[@name='airline']"));
		Select airlinedrp=new Select(airline);
		airlinedrp.selectByVisibleText("Blue Skies Airlines");
		WebElement continuebutton=driver.findElement(By.xpath("//input[@name='findFlights']"));
		continuebutton.click();


		
	}

}
