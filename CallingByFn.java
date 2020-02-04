import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CallingByFn 
{
	public static void web()
	{	
	myD.manage().window().maximize();
	myD.get("https://in.yahoo.com/");
	myD.close();
	}
	public static WebDriver myD;
	public static void main(String[] args) 
	{
		 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\geckodriver.exe");
		myD=new FirefoxDriver();
		web();
		//System.out.println("Title is: "+myD.getTitle());
		//System.out.println("URL is: "+myD.getCurrentUrl());
	}

}
