package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// . means path until current project
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Open the browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		driver.get("https://www.fb.com/");
//		String actualTitle = driver.getTitle();
//		String expectedTitle = "Google";
		
//		if(actualTitle.equals(expectedTitle))
//		{
//			System.out.println("Google page is Displayed, PASS");
//		}
//		else
//		{
//			System.out.println("Google Page is not Displayed, FAIL");
//		}
		
//		System.out.println(driver.getCurrentUrl());
		
		//maximise the browser window
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		Thread.sleep(2000);
////		//Change the size 
//		Dimension dim = new Dimension(600, 300);
//		driver.manage().window().setSize(dim);
//		Thread.sleep(2000);
//		Point p=new Point(700, 500);
//		driver.manage().window().setPosition(p);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		
		
		
	}
}
