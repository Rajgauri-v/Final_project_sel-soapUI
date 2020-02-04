import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstProgram {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
	WebDriver myD=new ChromeDriver();
	myD.manage().window().maximize();
	myD.get("https://in.yahoo.com/");
	myD.close();
	}

}
