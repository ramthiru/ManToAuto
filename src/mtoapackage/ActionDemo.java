package mtoapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDemo {
	
	public static void main(String args[])  {
	
		try {
	 WebDriver driver = new FirefoxDriver();
	 WebDriverWait wait = new WebDriverWait(driver,50);
	  
		driver.get("https://www.ultimatix.net/");
		
		driver.findElement(By.id("USER")).sendKeys("1124139");
		driver.findElement(By.id("PASSWORD")).sendKeys("Dapple@1982");	
		driver.findElement(By.id("login_button")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#parent_26>a")));
		
		WebElement Mtab  = driver.findElement(By.cssSelector("#parent_26>a"));
		Actions obj = new Actions(driver);
		//Clicked on the Employee Service
		obj.moveToElement(Mtab).perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='parentGroup_26']/div[1]/table/tbody/tr/td[1]/div/div[2]/div/a")));
		//Clicked on the Employee Concern
		WebElement Stab  = driver.findElement(By.xpath("//*[@id='parentGroup_26']/div[1]/table/tbody/tr/td[1]/div/div[2]/div/a"));
		Stab.click();
		driver.quit();
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}
	}
}
