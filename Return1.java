import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import org.openqa.selenium.chrome.ChromeDriver;

public class Return1 
{
	public WebDriver myD;
	public  String vURL;
	
	public int a=1,b=1;
	public Return1()
	{
		vURL="https://www.google.com/";
		
		
	}
	
	public String web() throws IOException 
	{
		
		myD.manage().window().maximize();
		myD.get(vURL);
		
	
		
		if(vURL.equals(myD.getCurrentUrl()))
		{
			File scrFile=(File) ((TakesScreenshot)myD).getScreenshotAs(OutputType.FILE);
			Files.copy(scrFile, new File("C:\\Users\\slk\\Desktop\\Selenium Jars\\TC002.jpg"));
			
			return "TC001 Passed";
		}
		else 
		{
			File scrFile=(File) ((TakesScreenshot)myD).getScreenshotAs(OutputType.FILE);
			Files.copy(scrFile, new File("C:\\Users\\slk\\Desktop\\Selenium Jars\\TC001.jpg"));
			return "TC001 Failed";
		}
	}
	
	public String AppClose()
	{
		String Flag="FAIL";
		myD.close();
		Flag="AppClose Passed";
		return Flag;
	}
	
	public String BrowserCall()
	{
		Scanner scx = new Scanner(System.in);
		int c=scx.nextInt();
		
		if(a==c)
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
			myD=new ChromeDriver();
			return "BrowserCall Test Case Pass";
			
		}
		else if(b==c)
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\geckodriver.exe");
			myD=new FirefoxDriver();
			return "BrowserCall Test Case Pass";
			
		}
		else
		{
			System.out.println("Invalid Browser");
			return "BrowserCall Test Case Fail";
		}
		
	}
}
