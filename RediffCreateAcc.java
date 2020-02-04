package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffCreateAcc 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");	
		
		driver.findElement(By.xpath("//*[contains(@name,'name')]")).sendKeys("Rajgauri Vedpathak");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[contains(@name,'login')]")).sendKeys("rajgauri@rediffmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(@name,'passwd')]")).sendKeys("Raj@123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(@name,'confirm_passwd')]")).sendKeys("Raj@123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[contains(@name,'chk_altemail')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@src='https://register.rediff.com/utilities/newforgot/img/darrow_country.png']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='United Kingdom (+44)']")).click();
		
		driver.findElement(By.xpath("//*[contains(@name,'gender') and contains(@value,'f')]")).click();
		Thread.sleep(1000);
		
		Select s=new Select(driver.findElement(By.id("country")));
		Thread.sleep(2000);
		s.selectByVisibleText("United States");
		Thread.sleep(1000);
		s.selectByValue("99");
		Thread.sleep(1000);
		s.selectByIndex(5);
		Thread.sleep(1000);
		
		
		
		
	}

}
