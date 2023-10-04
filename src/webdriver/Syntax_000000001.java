 package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Syntax_000000001 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Mouseover
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
//		*************************************************************************************
		//Enter into frame
		driver.switchTo().frame("rightMenu");
//		EXIT FROM FRAME
		driver.switchTo().defaultContent();
//		***********************************************************************************
//		TO GET HTML CODE OF WEBPAGE
		System.out.println(driver.getPageSource());
//		**************************************************************************************
		//ALERT
		Alert al = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		a.dismiss();
//		************************************************************************************
		//Click on Login btn -- Keyboard : 1.TAB 2. ENTER
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		System.out.println("TAB");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("ENTER");
//		************************************************************************************
//		TC_KB_WD 
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Ved song");
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_UP);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		************************************************************************************
//		DROPDOWN
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByVisibleText("Emp. ID");
//		***********************************************************************************
//		WAIT Commands-In automation testing, Selenium Webdriver wait commands direct test execution to pause 
//		for a certain length of time before moving onto the next step.
//		Implicit wait-wait for certain amount of time.
//		To add implicit waits in test scripts, import the following package.
		import java.util.concurrent.TimeUnit;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
//		EXPLICIT WAIT(expected condition)- By using the Explicit Wait command, the WebDriver 
//		is directed to wait until a certain condition is satisfied before proceeding to next step.
		 The following Expected Conditions can be used in Explicit Wait.

		 alertIsPresent()
		 elementToBeClickable()
		 elementToBeSelected()
		 frameToBeAvaliableAndSwitchToIt()
		 invisibilityOfTheElementLocated()
		 invisibilityOfElementWithText()
		 presenceOfAllElementsLocatedBy()
		 presenceOfElementLocated()
		 textToBePresentInElement()
		 textToBePresentInElementLocated()
		 textToBePresentInElementValue()
		 titleIs()
		 titleContains()
		 visibilityOf()
		 visibilityOfAllElements()
		 To use Explicit Wait in test scripts, import the following packages into the script.
		 import org.openqa.selenium.support.ui.ExpectedConditions
		 import org.openqa.selenium.support.ui.WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
//		Implicit wait sets a default timeout for the entire test runtime, while explicit wait sets 
//		timeouts for specific conditions.
		****************************************************************************************************
//		5 EXCEPTION IN SELENIUM
//		Exception” disrupts the normal flow of execution
//		ElementNotSelectableException: An element is disabled (can not be clicked/selected) in spite of being 
//		present in the DOM eg.button
//		ElementNotInteractableException: An element is not in a state, where it can be interacted with
//		(can not be clicked or able to send keys) in spite of it being present in the DOM eg.textbox
//		ElementNotVisibleException: In spite of the element being present in the DOM, it is not visible 
//		(can not be interactive). For example, elements defined in HTML with type =”hidden”.
//		NoSuchElementException: Webdriver is not able to determine the elements during runtime, 
//		i.e., the FindBy method cannot find a particular component
//		NoSuchFrameException: Webdriver attempts to switch to an invalid frame, which is unavailable
//		NoAlertPresentException: Webdriver is trying to switch to an invalid alert, which is unavailable
//		NoSuchWindowException: Webdriver is trying to switch to an invalid window, which is unavailable
//		StaleElementReferenceException: The referenced element is no longer present on the DOM page 
//		(a reference to a component is now Stale). For example, the item belongs to a different frame 
//		than the current one or the user has navigated away to another page
//		SessionNotFoundException: Webdriver is acting immediately after ‘quitting’ the browser
//		TimeoutException: The command did not complete in the specified time. For example, the element 
//		didn’t display at the specified time. This is especially encountered when working with waits
//		WebDriverException: Webdriver is acting immediately after ‘closing’ the browser
//		1.Webdriver Exception
//		2.No alert present Exception 
//		3.No such window Exception
//		4.No such Element Exception(it is thrown when an HTML element with given attribute cannot be found in a webpage)
//		5.Timeout Exception(it is thrown, If the commands do not complete even after the wait time is over.)
//		Stale Element Exception-it is thrown,when the element is no longer available in the DOM(Document object model).
//		Handling Exceptions In Selenium WebDriver
		try
		   {
		     // Some code
		   }
		catch(Exception e)
		  {
		     // Code for Handling the exception
		  }
		
		******************************************************************************
//		POM-it is a Design pattern.not a framework
		Page Object Model, also known as POM, is a design pattern in Selenium that creates an object repository 
		for storing all web elements. It helps reduce code duplication and improves test case maintenance.
		In Page Object Model, consider each web page of an application as a class file.
		Each class file will contain only corresponding web page elements. Using these elements, testers 
		can perform operations on the website under test.
		
		
		In Selenium, Asserts are validations or checkpoints for an application. 
		Assertions state confidently that application behavior is working as expected.
		Asserts in Selenium validate the automated test cases that help testers understand 
		if tests have passed or failed.
//		Selenium Assertions can be of three types: “assert”, “verify”, and ” waitFor”.When an “assert” fails,the test is aborted. 
//	  	When a “verify” fails, the test will continue execution, logging the failure.
//		*****************************************************************************************************************
		//To upload a file
		WebElement fileinput=driver.findElement(By.name("photofile"));
		fileinput.sendKeys("E:\\PICTURES\\11.jpg");
		//fileInput.sendKeys("G:\\06.TestingTools\\1.0.ProjectName\\Templates\\Defect Template.xlsx");
//	****************************************************************************************************************
//		TakesScreenshot
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("F:\\Test1.png"));
//		*******************************************************************	
		//using javascriptExecuter to click on login btn
		WebElement loginbtn = driver.findElement(By.name("Submit"));
		JavascriptExecutor e1 = (JavascriptExecutor)driver;
		e1.executeScript("arguments[0].click();", loginbtn);
		Thread.sleep(4000);
		// using javascriptExecuter to click on logout btn
		WebElement logout = driver.findElement(By.linkText("Logout"));
		e1.executeScript("arguments[0].click();", logout);
//*********************************************************************************************************************
		//Data -- WebTable
		driver.get("C:\\SELENIUM\\WebTable.html");
		int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();									
		int col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td")).size();
		int row_col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
		System.out.println("RowCount " + row);
		System.out.println("ColCount " + col);
		System.out.println("Row_ColCount " + row_col);
//		Data -- Cell
		String celldata = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		for(int i=1; i<=row; i++ ) {
		String data = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
		System.out.println(data);
//	*******************************************************************************************************************
//		Excel file-data driven from exel file
		FileInputStream file = new FileInputStream("E:\\HRMS Project\\Object_Element.xls");
		Workbook  wb = Workbook.getWorkbook(file);
		Sheet     s = wb.getSheet(0);
		int rowcount = s.getRows();
		System.out.println(rowcount);
		for(int j=1; j<rowcount;j++) {
		String empid = s.getCell(0,i).getContents();
		String name = s.getCell(1,i).getContents();
		String email = s.getCell(2,i).getContents();
		String no = s.getCell(3,i).getContents();
		System.out.println(empid +"||"+ name +"||"+ email +"||"+ no );
//		*************************************************************************************************************
//		Drag&Drop
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")),
		               driver.findElement(By.id("droppable"))).perform();
		System.out.println("Drag&Drop");
//		***************************************************************************************************************
//		click on checkbox
		for(int y=1; y<=20; y=y+2) {
		driver.findElement(By.xpath("//*[@id='standardView']/table/tbody/tr["+y+"]/td[1]/input")).click();
		System.out.println("clicked on checkbox of " + y);}
//		***************************************************************************************************************
//		Assertion-
//		@Test()
//		public void gettiltetest(){
//		String actualtitle =driver.getTitle();
//		Assert.assertEquals(actualtitle,"expected value","Title not matched");
		}
		}}
		}



