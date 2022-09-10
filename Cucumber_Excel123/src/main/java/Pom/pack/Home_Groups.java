package Pom.pack;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Groups
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	@FindBy (xpath = "//a[@aria-label='Groups']")
	private WebElement group;
	
	
	
	
	public  Home_Groups (WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}
	
	public void clickgroup()
	{
		wait.until(ExpectedConditions.visibilityOf(group));
		group.click();
	}
	

}
