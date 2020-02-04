import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckingURL {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
	WebDriver myD=new ChromeDriver();
	myD.manage().window().maximize();
	myD.get("https://in.yahoo.com/");

	
	String a=myD.getCurrentUrl();
	String b="https://in.yahoo.com/";
	myD.close();
	if(a.equals(b))
	{
		System.out.println("Test case Passed");
	}
	else 
	{
		System.out.println("Test case Failed");
	}
	}

}
