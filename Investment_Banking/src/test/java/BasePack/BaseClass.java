package BasePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public WebDriver openchromebrowser()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\New Details\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		return driver;
	}
	
//	public WebDriver openfirefoxbrowser()
//	{
//		
//		System.setProperty("webdriver.gecko.driver","D:\\Nikita\\geckodriver.exe" );
//		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		return driver;
//	}

}
