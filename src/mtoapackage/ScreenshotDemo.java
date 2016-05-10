package mtoapackage;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotDemo {
	static String cDate;

	
	static WebDriver driver = new FirefoxDriver();
	public static void main(String args[]) {
		
		driver.get("http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open5");
		driver.switchTo().frame("iframeResult");
		getscreenshot();
	}
	
	
	public static void getscreenshot()  {
		
		
		try {

		String scrnPath = "D:/MtoASample/ManToAuto/Screenshot/";
		
		cDate = GetTimeStampValue();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(scrnPath +cDate+".png"));
        driver.quit();
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
      }

	public static  String GetTimeStampValue()throws IOException{

        Calendar cal = Calendar.getInstance();       
         Date time=cal.getTime();
         String timestamp=time.toString();
            
            String systime=timestamp.replace(":", "-");
            
        return systime;

	}
	


}
