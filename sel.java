package pancham;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sel {
	public static void fun()
	{
		WebDriver d1=new FirefoxDriver();
		{
		d1.manage().window().maximize();
		d1.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//System.out.println("title is:"+d1.getTitle());
		//System.out.println("URL is:"+d1.getCurrentUrl());
		d1.close();
		}
		
	}
public static WebDriver d1;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser Name");
		System.out.println("1.Firefox\n2.Chrome");
		int a=sc.nextInt();
		if(a==1)
		{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\slk\\Desktop\\sd\\geckodriver.exe");
		d1=new FirefoxDriver();
		fun();
		}
		else if(a==2)
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\sd\\chromedriver.exe");
			d1=new ChromeDriver();
			fun();
		}
		else
		{
			System.out.println("Invalid");
		}
		}
		
		

	}


