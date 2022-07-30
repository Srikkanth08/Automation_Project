package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP-ADMIN/Desktop/multipleElements.html");
		
//		WebElement fblink = driver.findElement(By.linkText("FB"));
//		//fblink.click();
//		System.out.println(fblink.getText());
		
		List<WebElement> allLinks = driver.findElements(By.tagName("z"));
//		//1. Print the count of elements
		System.out.println(allLinks.size());
//		//2. Print the text of all elements
//		for(int i=0;i<=allLinks.size()-1;i++)
//		{
//			//get gettext print
//			WebElement oneLink = allLinks.get(i);
//			String text = oneLink.getText();
//			System.out.println(text);
//		}
//		//3. Click on the last link
//		allLinks.get(allLinks.size()-1).click();
//		
		
		
		
		
	}

}









