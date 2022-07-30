package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP-ADMIN/Desktop/page1.html");
		
		Thread.sleep(2000);
	//	driver.switchTo().frame(0);
	//	driver.switchTo().frame("frid");
	//	driver.switchTo().frame("frnm");
	//	driver.switchTo().frame("frcl");//NoSuchFrameException
		WebElement frAddr = driver.findElement(By.id("frid"));
		driver.switchTo().frame(frAddr);
		driver.findElement(By.id("pwd")).sendKeys("manager");
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("un")).sendKeys("admin");
		
	}

}
