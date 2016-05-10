
package mtoapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RadioButtonDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_radio");
		driver.switchTo().frame("iframeResult");
		List<WebElement> radioButtons = driver.findElements(By.name("gender"));
		
		for(WebElement radioButton:radioButtons) {
			if(radioButton.getAttribute("value").equals("female")) {
				
				radioButton.click(); 
				//Ensure the radio buttons got clicked
				System.out.println("Is radio button clicked? " +radioButton.isSelected());
				
			}
		}
		
	
		
	}
}
