package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDuplicates {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP-ADMIN/Desktop/MultiDropdown.html");
		
		WebElement ddAddr = driver.findElement(By.name("paradise"));
		Select sel=new Select(ddAddr);
		
		List<WebElement> allOps = sel.getOptions();
		
//		for(WebElement oneOption:allOps)
//		{
//			String text = oneOption.getText();
//			System.out.println(text);
//		}
		
		
//		Set<String> s = new HashSet<String>();
//		for(WebElement oneOption:allOps)
//		{
//			String text = oneOption.getText();
//			s.add(text);
//		}
//		
//		for(String oneText:s)
//		{
//			System.out.println(oneText);
//		}
		
		
//		Set<String> s = new LinkedHashSet<String>();
//		for(WebElement oneOption:allOps)
//		{
//			String text = oneOption.getText();
//			s.add(text);
//		}
//		
//		for(String oneText:s)
//		{
//			System.out.println(oneText);
//		}
		
		
		Set<String> s = new TreeSet<String>();
		for(WebElement oneOption:allOps)
		{
			String text = oneOption.getText();
			s.add(text);
		}
		
		for(String oneText:s)
		{
			System.out.println(oneText);
		}
		
		
	}

}
