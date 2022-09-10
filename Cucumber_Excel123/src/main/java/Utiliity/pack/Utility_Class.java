package Utiliity.pack;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class 
{
	private WebDriver driver;

	public static void screen( WebDriver driver, int testId) throws IOException
	{
	
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		File dst = new File ("target/MyReports/screenshots"+ testId+"  "+ timeStamp +".jpg");
		FileHandler.copy(scr, dst);
	}


}
