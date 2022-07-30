package sere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass {

	//@FindBy(locatorName="locatorValue") accessSpecifier returnType elementName;
	@FindBy(id="username") private WebElement untb;
	
	public LoginPOMClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUntb()
	{
		return untb;
	}
	
	
	
	
	
	
	
}
