package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC_05_JSE {
	  public static void main(String args[]) throws Exception{
		  System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	Thread.sleep(1000);
	//using javascriptExecuter to click on login btn
	WebElement loginbtn = driver.findElement(By.name("Submit"));
	JavascriptExecutor e1 = (JavascriptExecutor)driver;
	e1.executeScript("arguments[0].click();", loginbtn);
	Thread.sleep(4000);
	// using javascriptExecuter to click on logout btn
	WebElement logout = driver.findElement(By.linkText("Logout"));
	e1.executeScript("arguments[0].click();", logout);
	driver.close();
}
}