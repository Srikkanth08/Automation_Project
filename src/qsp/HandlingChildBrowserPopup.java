package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("laptops", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		//driver.close();
		//driver.quit();
		Thread.sleep(2000);
		Set<String> allwhs = driver.getWindowHandles();
		for(String wh:allwhs) {
		String title = driver.switchTo().window(wh).getTitle();
		if(title.contains("HP"))
		{
			String price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText();
			System.out.println(price);
			break;
		}
		}
		
		
	}

}
