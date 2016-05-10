package mtoapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select2");
		driver.switchTo().frame("iframeResult");
		WebElement dropdown = driver.findElement(By.name("cars"));
		
		//select the element By Select Class
		Select Obj = new Select(dropdown);
		
		// Need to pass the index which starts from 0 
		Obj.selectByIndex(3);
		
		Obj.selectByValue("fiat");
		
		Obj.selectByVisibleText("Fiat");
		
		//deSelectAll 
		Obj.deselectByIndex(3);
		Obj.deselectByValue("fiat");
		Obj.deselectByVisibleText("Fiat");
		//Obj.deselectAll();  This can be useful when multi select option is applicable.
		driver.close();
	} 
}
