package mtoapackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.cssSelector("body>button")).click();
		
		Alert a1 = driver.switchTo().alert();
		
		a1.sendKeys("Automation Testers");
		a1.accept();
		
		
		
	
		
	}
}
