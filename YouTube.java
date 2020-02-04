package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.id("search")).sendKeys("Jab Harry Met Sejal Songs");
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(text(),'SAFAR - Jab Harry Met Sejal')]")).click();
		Thread.sleep(1000);
	}

}
