package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
	public class TC_04 {
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(1000);
			driver.switchTo().frame("rightMenu");
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("txtEmpFirstName")).sendKeys("Maya");
			driver.findElement(By.name("txtEmpLastName")).sendKeys("jaju");
			WebElement fileinput=driver.findElement(By.name("photofile"));
			fileinput.sendKeys("E:\\PICTURES\\11.jpg");
			Thread.sleep(4000);
			driver.findElement(By.id("btnEdit")).click();
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			driver.quit();
//			driver.navigate().forward();

			}
		}

