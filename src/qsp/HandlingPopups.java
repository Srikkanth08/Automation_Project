package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPopups {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", 
//				"./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("file:///C:/Users/QSP-ADMIN/Desktop/confirm.html");
//		Thread.sleep(2000);
////driver.findElement(By.xpath("//button[text()='I LOVE YOU']")).click();
//		Thread.sleep(2000);
//		Alert al = driver.switchTo().alert();
//		System.out.println(al.getText());
//	//	al.accept(); //click on OK button
//		al.dismiss();//click on CANCEL button
		
		
		
		
		
		//HTML Popup
		
//		System.setProperty("webdriver.chrome.driver", 
//				"./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.cleartrip.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='flex flex-middle flex-between 
//		t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer 
//		pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@aria-label='Thu Apr 28 2022']
//		//div[text()='28']")).click();
		
		
		
		
		
		
		
		//Browser Notification Popup
//		System.setProperty("webdriver.chrome.driver", 
//				"./drivers/chromedriver.exe");
//		ChromeOptions co=new ChromeOptions();
//		co.addArguments("--disable-notifications");
//		
//		WebDriver driver=new ChromeDriver(co);
//		driver.manage().window().maximize();
//		driver.get("https://www.hdfc.com/");
		
		
		
		
		
		
		
		
		
		
		
		//Window based Popup -> Cannot be handled by selenium
		System.setProperty("webdriver.gecko.driver", 
				"./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='file-upload'])[1]")).sendKeys("C:\\Users\\QSP-ADMIN\\Desktop\\MyResume.docx");
		
		
		
	}

}
