package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement ddAddr = driver.findElement(By.name("q"));
		ddAddr.sendKeys("qspiders hyderabad");
		
		Thread.sleep(4000);
		
		List<WebElement> allOptions = driver.findElements
				(By.xpath("//div[@class='wM6W7d']//span"));
		System.out.println(allOptions.size());
		
//		for(int i=0;i<=allOptions.size()-1;i++)
//		{
//			System.out.println(allOptions.get(i).getText());
//		}
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.ENTER);
		
	
		for(int i=0;i<=allOptions.size()-1;i++)
		{
			String text = allOptions.get(i).getText();
			if(text.equals("qspiders hyderabad kphb photos"))
			{
				allOptions.get(i).click();
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
