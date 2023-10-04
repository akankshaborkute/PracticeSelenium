package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_11_Checkbox {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    driver.navigate().to("http://183.82.103.245/nareshit/login.php");
    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
    driver.findElement(By.name("Submit")).click();
    System.out.println("Login completed");
    Thread.sleep(4000);
    driver.switchTo().frame("rightMenu");
    //click on checkbox
	for(int i=1; i<=20; i=i+2) {
	driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+i+"]/td[1]/input")).click();
	System.out.println("clicked on checkbox of " + i);
//	Thread.sleep(1000);
	}
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	driver.close();    
	}
	}