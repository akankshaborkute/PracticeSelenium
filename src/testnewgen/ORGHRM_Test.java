package testnewgen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class ORGHRM_Test {
	WebDriver driver;
	@BeforeClass
	public void browser() {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	}
	@Test(priority=1)
	public void url() {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	}
	@Test(priority=2)
	public void username() {
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	}
	@Test(priority=3)
	public void password() {
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");	
	}
	@AfterClass
	public void logout() {
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	}
	}
