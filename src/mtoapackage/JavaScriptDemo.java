package mtoapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptDemo {
  public static void main(String[] args) {

	  WebDriver driver = new FirefoxDriver();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  
		driver.get("https://www.ultimatix.net/");
		
		driver.findElement(By.id("USER")).sendKeys("1124139");
		driver.findElement(By.id("PASSWORD")).sendKeys("Capple@1982");
		
		WebElement btn = driver.findElement(By.className("login_button"));
		js.executeScript("arguments[0].click();",btn);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#parent_26>a")));
		driver.findElement(By.cssSelector("#parent_26>a")).click();
		
		Object className = js.executeScript("return document.getElementById('outerDivision').getAttribute('class');");
		
		System.out.println("className ::" + className);
		
		String title = (String) js.executeScript("return document.title");
		System.out.println("Title" +title);
		
		js.executeScript("$('ul.menus.menu-secondary.sf-js-enabled.sub-menu li').hover()");
		
		
		driver.quit();

		
  }
}