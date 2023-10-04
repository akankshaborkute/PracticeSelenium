package webdriver;
import org.openqa.selenium.WebDriver;//To access webdriver classes & methods
import org.openqa.selenium.chrome.ChromeDriver;//To access chrome browser
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;//To access object/element Identification methods

public class TC_03Dropdown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		System.out.println("Login completed");
		Thread.sleep(3000);
		//Enter into frame
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
		Thread.sleep(3000);
		driver.findElement(By.name("loc_name")).sendKeys("01");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(3000);
		//Exit from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();


}
}