package mtoapackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static RemoteWebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WIN8);
		cap.setBrowserName("firefox");
		
		driver = new RemoteWebDriver(new URL("http://192.168.43.187:2323/wd/hub"),cap);

		driver.navigate().to("http://www.google.com");
		
		driver.findElementByName("q").sendKeys("Grid Implementation");
		
		driver.findElementByName("btnG").click();
		
		
		
		driver.close();
	} 
}
