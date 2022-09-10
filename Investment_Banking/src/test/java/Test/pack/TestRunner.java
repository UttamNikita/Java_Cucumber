package Test.pack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import BasePack.BaseClass;
import Pom_Pack.Home1;
import Pom_Pack.LogoutClass;
import Pom_Pack.Money;
import Pom_Pack.Test_Functionality;
import UtilityPack.Utility1;

public class TestRunner extends BaseClass
{
	private WebDriver driver;
	Home1 Bank;
	LogoutClass log;
	Test_Functionality fun;
	Money price;
	
	int testId;
	 
	@BeforeTest
	@Parameters("browser1")
	public void launchbrowser(String browser)
	{
		
		
		
		if(browser.equals("chrome"))
		{
			driver =  openchromebrowser();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//	if(browser.equals("firefox"))
//	{
//		driver = openfirefoxbrowser();
//	}
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeClass
	public void openurl()
	{
		driver.get("https://groww.in");
		 Bank=new Home1(driver);
		 log=new LogoutClass(driver);
		 fun=new Test_Functionality(driver);
		 price=new Money(driver);
	}
	@BeforeMethod
	public void loginpage() throws IOException
	{
		
		Bank.LoginPage();
		Bank.EmailPage();
		Bank.Button();
		Bank.PasswordPage();
		Bank.EnterButton();
		Bank.pin12();
		Bank.pin13();
		Bank.pin14();
		Bank.pin15();
		 
		
	}
	
	@Test(priority =1)
	public void testbike() throws IOException, InterruptedException
	{
		 testId = 102;
		System.out.println("Test1");
		
		Thread.sleep(30);
		
		fun.soket();
		fun.by();
		//fun.lim();
		fun.money();
		
		 
		String dk = driver.getCurrentUrl();
		System.out.println(dk);
		
		
		String kk =driver.getTitle();
		System.out.println(kk);
		
	}
	@Test(priority =2)
	public void testPP() throws IOException, InterruptedException
	{
		 //testId = 103;
		 System.out.println("Test2");
		 
		 fun.soket();
			fun.by();
			//fun.lim();
			fun.money();
		 price.getmoney();
			price.addvalue();
			price.addbank();
			//price.Banking();
		
		
			String nk = driver.getCurrentUrl();
			System.out.println(nk);
			
			
			String kr =driver.getTitle();
			System.out.println(kr);
			
	}
	
	@AfterMethod
	public void logout(ITestResult re) throws IOException, InterruptedException 
	{
		if(ITestResult.FAILURE == re.getStatus()) 
		{
		Utility1.screen(driver,testId );
	}
		
		System.out.println("close browser");
		log.Logoutpage();
		log.Logout();

		
		
		 
	}
	
	@AfterClass
	public void closeall()
	{
		Bank=null;
	}
	
	@AfterTest
	public void closebrowesr()
	{
		
	driver.quit();
	driver=null;
		System.gc(); // grabage collector
	}
	
	

}
