package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		abc(driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		String vParent=it.next();
		String vChild=it.next();
		
		driver.switchTo().window(vChild);
		//abc(driver.getTitle());
		
		
		driver.findElement(By.linkText("Community")).click();
		abc(driver.getTitle());
		
		//to switch to parent window
		driver.switchTo().window(vParent);
		abc(driver.getTitle());
		
		driver.quit();
		
	}
	
	
public static void abc(String ab)

{
	System.out.println(ab);
}

}
