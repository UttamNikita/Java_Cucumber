package Pom_Pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Home1
{
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	
	@FindBy (xpath="//span[text()='Login/Register']")
	private WebElement Login;
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement Email;
	
	@FindBy (xpath="//span[text()='Continue']")
	private WebElement submit;
	
	@FindBy (xpath="//input[@id='login_password1']")
	private WebElement password;
	
	@FindBy (xpath="//span[text()='Submit']")
	private WebElement Enter;
	
	@FindBy (xpath="(//input[@type='number'])[1]")
	private WebElement pin1;
	
	@FindBy (xpath="(//input[@type='number'])[2]")
	private WebElement pin2;
	
	@FindBy (xpath="(//input[@type='number'])[3]")
	private WebElement pin3;
	
	@FindBy (xpath="(//input[@type='number'])[4]")
	private WebElement pin4;
	
	
	public Home1 (WebDriver driver)
	{
		this.driver = driver;
	
	wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		PageFactory.initElements(driver,this);
	}
	
	public void LoginPage()
	{
		wait.until(ExpectedConditions.visibilityOf(Login));
		Login.click();
	}
	
	public void EmailPage()
	{
		wait.until(ExpectedConditions.visibilityOf(Email));
		Email.sendKeys("purushottam.ekkaldevi123@gmail.com");
	}
	
	public void Button()
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		submit.click();
	}
	
	public void PasswordPage()
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("Uttam@123");
	}
	
	public void EnterButton()
	{
		wait.until(ExpectedConditions.visibilityOf(Enter));
		Enter.click();
	}
	
	public void pin12()
	{
		wait.until(ExpectedConditions.visibilityOf(pin1));
		pin1.sendKeys("9");
	}
	
	public void pin13()
	{
		wait.until(ExpectedConditions.visibilityOf(pin2));
		pin2.sendKeys("4");
	}
	
	public void pin14()
	{
		wait.until(ExpectedConditions.visibilityOf(pin3));
		pin3.sendKeys("2");
	}
	
	public void pin15()
	{
		wait.until(ExpectedConditions.visibilityOf(pin4));
		pin4.sendKeys("2");
	}


}
