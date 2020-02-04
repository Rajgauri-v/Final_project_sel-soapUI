import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class UserInput {

	public static void main(String[] args) 
	{
		
	
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter Browser Name");
	System.out.println("1.Chrome \n2.Firefox");
	int a=sc.nextInt();
	if(a==1)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://in.yahoo.com/");
		myD.close();
	}
	else if(a==2)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\slk\\Desktop\\Selenium Jars\\geckodriver.exe");
		WebDriver myD=new FirefoxDriver();
		myD.manage().window().maximize();
		myD.get("https://in.yahoo.com/");
		System.out.println("Title is: "+myD.getTitle());
		System.out.println("URL is: "+myD.getCurrentUrl());
		myD.close();
	}
	else
	{
		System.out.println("Invalid");
	}
	}

}
