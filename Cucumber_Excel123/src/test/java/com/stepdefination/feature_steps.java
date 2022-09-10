 package com.stepdefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;



import Base.Pack.Browser;

import Pom.pack.Home_Class;
import Pom.pack.Home_Groups;
import Pom.pack.Home_Logout;
import Pom.pack.Home_Marketplace;
import Utiliity.pack.ConfigReader;
import Utiliity.pack.Utility_Class;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class feature_steps 
{
	WebDriver driver;
	Home_Class logs;
	Browser gio;
	ConfigReader reader;
	Properties prop;
	Home_Logout logn;
	int testId;
	Home_Marketplace market;
	Home_Groups group;
	
	
	@Before(order=1)
	public void LaunchBrowser() throws IOException
	{
		reader = new ConfigReader();
		prop = reader.init_prop();
	
	}

	@Before(order=2)
	public void LaunchBrowserChrome()
	{
		
		String browsername = prop.getProperty("browser");
		gio = new Browser();
		driver=gio.openchromebrowser(browsername);
		driver.get("https://www.facebook.com/login");
		
		
	}
	
	
	
	@Given("user is on FB page")
	public void user_is_on_fb_page()
  {
     testId=01;
		
		
		String hk=driver.getCurrentUrl();
		System.out.println(hk);
		Assert.assertEquals(hk, "https://www.facebook.com/login");
		
		String pk=driver.getTitle();
		System.out.println(pk);
		Assert.assertEquals(pk, "Log in to Facebook");
	}

	@When("user enters FB Username")
	public void user_enters_fb_username() 
	{
		testId=02;
		
		
		Home_Class logs= new Home_Class(driver);
		logs.sendusername();
	}

	@When("user enters FB Passord")
	public void user_enters_fb_passord() 
	{
		testId=03;
		
		Home_Class logs= new Home_Class(driver);
		logs.sendpassword();
	}

	@When("user click on FB login button")
	public void user_click_on_fb_login_button()
    {
		testId=04;
		Home_Class logs= new Home_Class(driver);
		logs.clickonlogin();
	}

	@Then("user should be navigate to FB HomePage")
	public void user_should_be_navigate_to_fb_home_page() 
	{
      testId=05;
		
		String gk=driver.getCurrentUrl();
		System.out.println(gk);
		Assert.assertEquals(gk, "https://www.facebook.com/");
		
		String lk=driver.getTitle();
		System.out.println(lk);
		Assert.assertEquals(lk, "Facebook");
		
	}

	@Given("User should be on Marketplace page")
	public void user_should_be_on_marketplace_page() 
	{
        testId=06;
		
		String gk1=driver.getCurrentUrl();
		System.out.println(gk1);
		Assert.assertEquals(gk1, "https://www.facebook.com/");
		
		String lk1=driver.getTitle();
		System.out.println(lk1);
		Assert.assertEquals(lk1, "Facebook");
	}

	@When("User click on Marketplace button")
	public void user_click_on_marketplace_button()
	{
		 testId=07;
		Home_Marketplace market=new Home_Marketplace(driver);
		market.clickmarket();
	}

	@Then("User should be on Search field")
	public void user_should_be_on_search_field() 
	{
		 testId=8;
		String gk2=driver.getCurrentUrl();
		System.out.println(gk2);
		Assert.assertEquals(gk2, "https://www.facebook.com/");
		
		
		String lk2=driver.getTitle();
		System.out.println(lk2);
		Assert.assertEquals(lk2, "Facebook");
	}

	@Given("User should be on Groups page")
	public void user_should_be_on_groups_page() 
	{
		 testId=9;
		String gk3=driver.getCurrentUrl();
		System.out.println(gk3);
		Assert.assertEquals(gk3, "https://www.facebook.com/groups/feed/");
		
		String lk3=driver.getTitle();
		System.out.println(lk3);
		Assert.assertEquals(gk3, "Facebook");
	}

	@When("User click on Groups button")
	public void user_click_on_groups_button()
	{
		 testId=10;
		Home_Groups group= new Home_Groups(driver);
		group.clickgroup();
		
	}

	@Then("User should be on Groups Comment page")
	public void user_should_be_on_groups_comment_page() 
	{
		 testId=11;
		String gk4=driver.getCurrentUrl();
		System.out.println(gk4);
		Assert.assertEquals(gk4, "https://www.facebook.com/groups/feed/");
		
		String lk4=driver.getTitle();
		System.out.println(lk4);
		Assert.assertEquals(lk4, "Facebook");
	}
	
	@After(order=2)
	public void CloseBrowser(Scenario sc)
	{
		
		Home_Logout logn= new Home_Logout(driver);
		
		logn.accountname();
		logn.clickonlogout();
		
	}
	
	@After(order=1)
	public void CloseBrowseFirfoxr(Scenario sc) throws IOException
	{
		if(sc.isFailed()) 
		{
		
			Utility_Class.screen(driver, testId);
		}
		driver.quit();


}
}