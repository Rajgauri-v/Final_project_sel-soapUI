package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("login")).sendKeys("adddf");
		
		Thread.sleep(2000);
		driver.findElement(By.name("passwd")).sendKeys("46456");
		Thread.sleep(2000);
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
	}

}
