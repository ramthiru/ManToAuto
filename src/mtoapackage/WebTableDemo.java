package mtoapackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_table");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement mytable = driver.findElement(By.cssSelector("body>table")); 
		
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr")); 
		 int rows_count = rows_table.size(); 
		
		 for (int row=0; row<rows_count; row++){ 
		
		List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
		 
		int columns_count = Columns_row.size();
		System.out.println("Number of cells In Row "+row+" are "+columns_count); 
		 for (int column=0; column<columns_count; column++){
		
		 String celtext = Columns_row.get(column).getText();
		 System.out.println("Cell Value Of row number "+row+" and column number "+column+" Is "+celtext); 
		 } 
		System.out.println("-----------------------"); 
		
		 }		
	}
}
