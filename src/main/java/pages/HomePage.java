package pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseMethods;
import utility.Screenshot;


public class HomePage extends BaseMethods {
	
	public HomePage(RemoteWebDriver driver,Properties prop)
	{
		this.driver=driver;
		this.prop=prop;
	}

	// click sales
	// Click toggle
	public HomePage clickToggle() {
		
		//driver.findElementByClassName("slds-icon-waffle").click();

		driver.findElementByClassName(prop.getProperty("HomePage.Toggle.ClassName")).click();
		return this;

	}

	// click view all
	public HomePage clickViewAll() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='slds-button']")));
		//driver.findElementByXPath("//button[@class='slds-button']").click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("HomePage.clickViewAll.Xpath"))));
		driver.findElementByXPath(prop.getProperty("HomePage.clickViewAll.Xpath")).click();
		
		Screenshot.captureScreenshot(driver, "View all");
		return this;

	}

	// action click
	public SalesPage clickSales() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.getProperty("HomePage.clickSales.Xpath"))));
		driver.findElementByXPath(prop.getProperty("HomePage.clickSales.Xpath")).click();
		return new SalesPage(driver, prop);

	}
}
