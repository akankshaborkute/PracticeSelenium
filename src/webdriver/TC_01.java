package webdriver;

import org.openqa.selenium.WebDriver;//To access webdriver classes & methods
import org.openqa.selenium.chrome.ChromeDriver;//To access chrome browser
import org.openqa.selenium.interactions.Actions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;//To access object/element Identification methods
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TC_01 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
//		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(1000);
		a.accept();
//		a.dismiss();
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
//		Actions ac=new Actions(driver);
//		ac.moveToElement(driver.findElement(By.className("drop"))).perform();
//		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[2]/a/span"))).perform();
//		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[2]/ul/li[4]/a/span"))).perform();
//		driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[2]/ul/li[4]/a/span")).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("piyaaa");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("jaju");
		driver.findElement(By.id("btnEdit")).click();
//		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		File f2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f2, new File("F;\\Rjhgjgje.png"));  
//		driver.quit();
//		driver.navigate().forward();
		
		}
	}