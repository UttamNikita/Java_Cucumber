package Pom_Pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutClass 
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy (xpath="(//img[@class=\"circle\"])[1]")
	private WebElement circle;
	
	@FindBy (xpath="//div[text()='Log Out']")
	private WebElement out;
	
	public LogoutClass (WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
				
		PageFactory.initElements(driver,this);
	}
	
	public void Logoutpage()
	{
		wait.until(ExpectedConditions.visibilityOf(circle));
		circle.click();
	}
	
	public void Logout()
	{
		wait.until(ExpectedConditions.visibilityOf(out));
		out.click();
	}

}
