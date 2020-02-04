import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondProgram {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\geckodriver.exe");
	WebDriver myD=new FirefoxDriver();
	myD.manage().window().maximize();
	myD.get("https://in.yahoo.com/");
	myD.close();
	}

}
