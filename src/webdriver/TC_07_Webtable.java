package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_07_Webtable {
	public static void main (String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\SELENIUM\\WebTable.html");
	int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();									
	int col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td")).size();
	int row_col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();

	System.out.println("RowCount " + row);
	System.out.println("ColCount " + col);
	System.out.println("Row_ColCount " + row_col);
//	Data -- Cell
	String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
	System.out.println(celldata);
	//Data -- Table
	// DT Var VV
	for(int i=1; i<=row; i++ ) {
	String data = driver.findElement(By.
	        xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
//	System.out.println(i);  
	System.out.println(data);

	 
		}
	
	
	driver.close();
	}
}
