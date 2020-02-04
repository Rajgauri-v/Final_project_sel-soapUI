package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleStats 
{
	static String b,a;
	static WebDriver driver;
	
	public static String check()
	{
		if(b.equals(a))
		{
			return "Test Case Passed";
		}
		else 
		{
			return "Test Case Failed";
		}
		
	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Modern Art Gallery in Bangalore");
		Thread.sleep(2000);
		a=driver.findElement(By.name("q")).getAttribute("value");
		
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		
		b=driver.findElement(By.name("q")).getAttribute("value");
		//String a=driver.findElement(By.id("resultStats")).getText();
		
		
		System.out.println(check());
		
		driver.close();
		
		
	}

}
