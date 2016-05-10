package mtoapackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ChildWindowsDemo {

	static WebDriver driver = new FirefoxDriver();
	public static void main(String args[]) {
		
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open5");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.cssSelector("body>button")).click();
		swtichWindows();
		
	}
	
	public static void swtichWindows() {
			String mainWindow = getMainWindowHandle(driver);
			closeAllOtherWindows(mainWindow);
		}
			
		public static String getMainWindowHandle(WebDriver driver) {
			return driver.getWindowHandle();
		}
		public Set<String> getAllWindowsHandles() {
			return driver.getWindowHandles();
		}
		public static String getCurrentWindowTitle() {
			String windowTitle = driver.getTitle();
			return windowTitle;
		}
		
		public static boolean closeAllOtherWindows(String openWindowHandle) {
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String currentWindowHandle : allWindowHandles) {
				if (!currentWindowHandle.equals(openWindowHandle)) {
					driver.switchTo().window(currentWindowHandle);
					
					driver.findElement(By.cssSelector("#main>div:nth-child(1)>div.w3-col.l6.w3-center.section>a:nth-child(3)")).click();
					String title = getCurrentWindowTitle();
					Assert.assertEquals(title,"HTML Tutorial");
					System.out.println("Child Windows Title Verified ..!!" + title);
				}
			}
			
			driver.switchTo().defaultContent();
			driver.switchTo().window(openWindowHandle);
			String title = getCurrentWindowTitle();
			Assert.assertEquals(title,"Tryit Editor v2.6");
			System.out.println("Parent Windows Title Verified ..!!" + title);
			
			if (driver.getWindowHandles().size() == 1)
				return true;
			else
				return false;
		}
	
}
