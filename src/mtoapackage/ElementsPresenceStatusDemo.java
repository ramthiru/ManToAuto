
package mtoapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsPresenceStatusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_input_checkbox");
		driver.switchTo().frame("iframeResult");
		//Verify the element's presence
		System.out.println("Is element is Available? " + driver.findElement(By.name("vehicle1")).isDisplayed());
		//Verify the element's Status
		System.out.println("Is element is Enabled? " + driver.findElement(By.name("vehicle1")).isEnabled());
		
		//Verify the element's Status
		System.out.println("Is element is clicked? " + driver.findElement(By.name("vehicle1")).isSelected());
		
		//Clicked on the Element
		driver.findElement(By.name("vehicle1")).click();
		System.out.println("Element got clicked..!!");
		
		//Verify the element's Status
		System.out.println("Is element clicked? " + driver.findElement(By.name("vehicle1")).isSelected());
		driver.findElement(By.name("vehicle1")).click();
		System.out.println("Element not selected..!!");
		
		driver.close();
	} 
}
