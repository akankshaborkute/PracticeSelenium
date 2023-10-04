package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class TC_10_DragDrop {
public static void main(String args[]) throws Exception{
	//Test Steps
	System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
driver.manage().window().maximize();
Thread.sleep(3000);
//Verify Title - stop execution if condition  fails.
//assertEquals(driver.getTitle(),"Droppable | jQuery UI");
System.out.println("Title matched");
driver.switchTo().frame(0);
Actions ac = new Actions(driver);
ac.dragAndDrop(driver.findElement(By.id("draggable")),
               driver.findElement(By.id("droppable"))).perform();
System.out.println("Drag&Drop");
Thread.sleep(5000);
driver.switchTo().defaultContent();
//driver.close();
}
}
