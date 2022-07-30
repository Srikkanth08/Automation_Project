package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("file:///C:/Users/QSP-ADMIN/Desktop/Dropdown.html");
		driver.get("file:///C:/Users/QSP-ADMIN/Desktop/MultiDropdown.html");
		Thread.sleep(2000);
		WebElement ddAddr = driver.findElement(By.name("paradise"));
		Select sel = new Select(ddAddr);
		//sel.selectByVisibleText("DOSA");
//		sel.selectByValue("c");
//		sel.selectByIndex(2);
//		sel.selectByIndex(7);
//		ddAddr.click();
//		sel.selectByVisibleText("POORI");
//		sel.deselectByVisibleText("POORI");//UnsupportedOperationException
//		if(sel.isMultiple())
//		{
//			System.out.println("It is a Multi-select Dropdown");
//		}
//		else
//		{
//			System.out.println("It is a Single-select Dropdown");
//		}
//		sel.selectByVisibleText("IDLI");
//		sel.selectByVisibleText("DOSA");
//		sel.selectByVisibleText("POORI");
//		Thread.sleep(2000);
//	//	sel.deselectByVisibleText("POORI");
//		sel.deselectAll();
		
//		List<WebElement> allOps = sel.getOptions();
//		System.out.println(allOps.size());
		
//		for(int i=1; i<=5;i++)
//		{
//			sel.selectByIndex(i);
//		}
		
//		List<WebElement> allSelOps = sel.getAllSelectedOptions();
//		for(int i=0; i<=allSelOps.size()-1;i++)
//			{
//				System.out.println(allSelOps.get(i).getText());
//			}
//		WebElement firstSelOp = sel.getFirstSelectedOption();
//		System.out.println(firstSelOp.getText());
		
//		WebElement wrapEle = sel.getWrappedElement();
//		System.out.println(wrapEle.getText());
		
//		for(int i=0; i<=allOps.size()-1;i++)
//		{
//			System.out.println(allOps.get(i).getText());
//		}
	}

}











