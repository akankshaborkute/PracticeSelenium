package testnewgen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Asrtn {
	WebDriver driver;
@BeforeMethod
public void browser() {
	System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://183.82.103.245/nareshit/login.php");
}
@Test()
public void m1() {
	System.out.println("55555555555555555555555555");
	String ac = driver.getTitle();
	System.out.println(ac);
//	Assert.assertEquals(ac, "OrangeHRM - New Level of HR Management","Title not matched");
	
}
@Test(priority=1)
public void m2() {
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("222222222222222222");
}
@AfterMethod
public void login() {
	driver.close();
}
}