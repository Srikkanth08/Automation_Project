package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMouseAndKeyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
	//	driver.findElement(By.xpath("//button[text()='✕']")).click();
		
	//	WebElement moreAddr = driver.findElement(By.xpath("//div[text()='More']"));
		
		
		
		
		
		
		
		
		
		
	}

}
