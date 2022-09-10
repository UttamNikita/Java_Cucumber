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

public class Test_Functionality 
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	
	@FindBy (xpath="(//a[@id='moverCardPop'])[2]")
	private WebElement stock1;
	
	@FindBy (xpath="(//input[@class='qtyinputbox'])[1]")
	private WebElement Buy1;
	
	@FindBy (xpath="(//input[@class='qtyinputbox'])[2]")
	private WebElement limit;
	
	@FindBy (xpath="//span[text()='ADD MONEY']")
	private WebElement addmoney;
	
	public Test_Functionality (WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
				
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void soket()
	{
		wait.until(ExpectedConditions.visibilityOf(stock1));
		stock1.click();
		
	}
	
	public void by()
	{
		wait.until(ExpectedConditions.visibilityOf(Buy1));
		Buy1.sendKeys("1");
		
	}
	
	public void lim()
	{
		wait.until(ExpectedConditions.visibilityOf(limit));
		Actions a= new Actions(driver);
		a.moveToElement(limit).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
	}
	
	public void money()
	{
		wait.until(ExpectedConditions.visibilityOf(addmoney));
		addmoney.click();
		
	}

}
