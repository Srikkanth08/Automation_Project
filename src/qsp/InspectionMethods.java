package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectionMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP-ADMIN/Desktop/link.html");
		
//		WebElement linkAddress = driver.findElement(By.tagName("a"));
//		linkAddress.click();
		
//		driver.findElement(By.id("i1")).click();
		
//		driver.findElement(By.name("n1")).click();
		
//		driver.findElement(By.className("c1")).click();
		
//		driver.findElement(By.linkText("GOOGLY")).click();
		
		driver.findElement(By.partialLinkText("GO")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
