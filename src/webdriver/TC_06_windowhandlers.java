package webdriver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_06_windowhandlers {
	public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//1st wind
	driver.get("file:C:\\SELENIUM\\multiplewindows.html");
	Thread.sleep(3000);
	//2nd wind
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(3000);
	//3rd wind
	driver.findElement(By.id("btn3")).click();
	Thread.sleep(3000);
	ArrayList<String> windinfo = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(windinfo.get(0));
	Thread.sleep(3000);
	//driver.close();
	driver.quit();
	}
	}
