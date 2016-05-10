

package mtoapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("USER")).sendKeys("1124139");
		driver.findElement(By.id("PASSWORD")).sendKeys("Bapple@1982");
		
		driver.findElement(By.className("login_button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#parent_26>a")));
		driver.findElement(By.cssSelector("#parent_26>a")).click();
		
		driver.close();
		
	}

}
