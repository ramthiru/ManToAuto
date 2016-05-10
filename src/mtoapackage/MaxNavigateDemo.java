package mtoapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaxNavigateDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.ultimatix.net");
		
		driver.findElement(By.id("ForgotUsernamePwdLink")).click();
	
		 driver.navigate().forward();
		 System.out.println("Navigated to Forward");
		 
		 driver.navigate().back();
		 System.out.println("Navigated to back");
		 
		 driver.navigate().refresh();
		 System.out.println("The Page got refreshed..!");
		 
		 driver.close();
		 
}

}