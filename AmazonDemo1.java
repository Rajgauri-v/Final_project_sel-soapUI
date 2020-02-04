package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo1 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma shoes for women");
	driver.findElement(By.className("nav-input")).click();
	Thread.sleep(2000);
	
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[7]/div/span/div/div/span/a/div/img")).click();
	Thread.sleep(10000);
	
	System.out.println(driver.getTitle());
	driver.findElement(By.id("breadcrumb-back-link")).click();
	Thread.sleep(10000);
	
	

	
	}

}
