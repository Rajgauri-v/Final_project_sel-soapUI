package pp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project 
{	
	
	public static String food[]= {"100","200","300"};
	public static String cloth[]= {"10","20","30"};
	public static String shelter[]= {"50","75","100"};
	public static String mPay[]= {"500","100","400"};
	public static String mOthers[]= {"50","20","10"};
	
	
static String a,b;

static WebDriver driver;

public static String check()
{
	float c=Float.parseFloat(a);
	float d=Float.parseFloat(b);
	
	if(c<d)
	{
		return "You are Warren Buffet";
	}
	else 
	{
		return "You are very poor in savings";
	}
	

}

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.youcandealwithit.com/");
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/a"))).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/ul/li[5]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Calculators")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Budget Calculator")).click();
		Thread.sleep(1000);
		
		
		for(int i=0;i<3;i++)
		{
		driver.findElement(By.id("food")).sendKeys(food[i]);
		Thread.sleep(1000);
		
		driver.findElement(By.id("clothing")).sendKeys(cloth[i]);
		Thread.sleep(1000);
		
		driver.findElement(By.id("shelter")).sendKeys(shelter[i]);
		Thread.sleep(1000);
		
		driver.findElement(By.id("monthlyPay")).sendKeys(mPay[i]);
		Thread.sleep(1000);
		
		driver.findElement(By.id("monthlyOther")).sendKeys(mOthers[i]);
		Thread.sleep(1000);
		
		a=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		System.out.println("Monthly Expense iS: "+a);
		Thread.sleep(1000);
		
		b=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		System.out.println("Monthly Income is: "+b);
		Thread.sleep(1000);
		
		
		System.out.println(check());
		driver.findElement(By.id("food")).clear();
		driver.findElement(By.id("clothing")).clear();
		driver.findElement(By.id("shelter")).clear();
		driver.findElement(By.id("monthlyPay")).clear();
		driver.findElement(By.id("monthlyOther")).clear();
		
		
		}
		
		driver.close();
	}
	
}
