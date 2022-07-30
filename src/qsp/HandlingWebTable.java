package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP-ADMIN/Desktop/table.html");
		
		List<WebElement> alltds = driver.findElements(By.tagName("td"));
		System.out.println("Full page tds: "+alltds.size());
		
		
		WebElement row2 = driver.findElement(By.xpath("//tr[2]"));
		List<WebElement> row2tds = row2.findElements(By.tagName("td"));
		System.out.println("second row tds: "+row2tds.size());
		
		
		
		
		
		
	}

}
