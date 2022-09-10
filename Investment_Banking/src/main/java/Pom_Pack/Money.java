package Pom_Pack;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Money 
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy (xpath="//input[@type='number']")
	private WebElement amount;
	
	@FindBy (xpath="//span[text()='ADD MONEY']")
	private WebElement value;
	
	@FindBy (xpath="//div[text()='Net Banking']")
	private WebElement bank;
	
	@FindBy (xpath="//span[text()='PAY VIA NETBANKING']")
	private WebElement Net;
	
	
	public Money (WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
				
		PageFactory.initElements(driver,this);
	}
	
	public void getmoney()
	{
		wait.until(ExpectedConditions.visibilityOf(amount));
		Actions a= new Actions(driver);
		a.moveToElement(amount).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		amount.sendKeys("1000");
		
	}
	
	public void addvalue()
	{
		wait.until(ExpectedConditions.visibilityOf(value));
		value.click();
		
	}
	
	public void addbank()
	{
		wait.until(ExpectedConditions.visibilityOf(bank));
		bank.click();
		
	}
	
	public void Banking()
	{
		wait.until(ExpectedConditions.visibilityOf(Net));
		Net.click();
		
	}

}
