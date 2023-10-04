package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TC_12_ScreenShot {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	        driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	        driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	        driver.findElement(By.name("Submit")).click();
	          Thread.sleep(3000);    
	File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f1, new File("F:\\TestResults11.png"));
	    driver.quit();
	    }}