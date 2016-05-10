package mtoapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/TAGS/tryit.asp?filename=tryhtml_form_checkbox");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox'][value='Bike']"));
		
				if(!checkBox.isSelected()){
				
				checkBox.click();
				
				//Ensure the radio buttons got clicked
				System.out.println("Is CheckBox Selected? " +checkBox.isSelected());
			}
		
	
		
	}
}
