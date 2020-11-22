package pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseMethods;

public class SalesPage extends BaseMethods {
	
	public SalesPage(RemoteWebDriver driver,Properties prop)
	{
		this.driver=driver;
		this.prop=prop;
	}

	//click account
	public AccountPage clickAccount() {
		
		WebElement element = driver.findElementByXPath(prop.getProperty("SalesPage.clickAccount.Xapth"));
		driver.executeScript("arguments[0].click();", element);
		return new AccountPage(driver);

	}


}
