package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_keyboard {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys("Ved");
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_UP);
	Thread.sleep(4000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	driver.close();

	}
	}
