package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		WebElement color=driver.findElement(By.id("single-input-field"));
		Select colourdrp=new Select(color);
		//three ways to select an option from the drop down menu
		colourdrp.selectByVisibleText("Yellow");
		//colourdrp.selectByValue("Green");
		//colourdrp.selectByIndex(1);
		List<WebElement> option=colourdrp.getOptions();//to get the options from the drop down
		for(int i=0;i<option.size();i++) {
			String value=option.get(i).getText();
			System.out.println(value);
			
		}
		WebElement selectedoption=colourdrp.getFirstSelectedOption();//to return the selected option
		String selectedvalue=selectedoption.getText();
		System.out.println("The selected value:"+selectedvalue);
		
		WebElement multicolor=driver.findElement(By.id("multi-select-field"));
		Select multiselect=new Select(multicolor);
		boolean f=multiselect.isMultiple();//to check whether there is multiple options
		System.out.println("Multicolor dropdown:"+f);
		
		multiselect.selectByIndex(0);
		multiselect.selectByIndex(1);
		
		System.out.println("Selected options are:");
		List<WebElement>optionslist=multiselect.getAllSelectedOptions();//which all options are selected
		for(int i=0;i<optionslist.size();i++) {
			String s=optionslist.get(i).getText();
			System.out.println(s);
		}
		multiselect.deselectByIndex(0);//remove/deselect the selected value
		//multiselect.deselectByValue("Yellow");
		//multiselect.deselectAll();
		multiselect.deselectByVisibleText("Red");
		
		
	}

}
