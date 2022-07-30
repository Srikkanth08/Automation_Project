package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Set the system property
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//Open the Browser
		WebDriver driver=new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Enter the test URL
		driver.get("https://demo.actitime.com/login.do");
		//Verify whether login page is Displayed
		String expectedTitle = "actiTIME - Login";
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)){
			System.out.println("Login Page is Displayed, PASS");
		}
		else {
			System.out.println("Login Page is not Displayed, FAIL");
		}
		Thread.sleep(2000);
		//Step:2 Enter valid username
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("admin");
		Thread.sleep(2000);
		//Enter valid password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		//Click on the login Button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		//Verify whether Home page is Displayed
		String expectedHomeTitle = "actiTIME - Enter Time-Track";
		String actualHomeTitle = driver.getTitle();
		if(actualHomeTitle.equals(expectedHomeTitle)){
			System.out.println("Home Page is Displayed, PASS");
		}
		else {
			System.out.println("Home Page is not Displayed, FAIL");
		}
	}
	
}







