package pancham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class project1 {
	
	public static String a1[]= {"100","200","300"};
	public static String a2[]= {"10","20","30"};
	public static String a3[]= {"50","75","100"};
	public static String a4[]= {"500","100","400"};
	public static String a5[]= {"50","20","10"};
	static String s,r;
	static WebDriver driver;
	
	

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\sd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youcandealwithit.com/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"siteNav\"]/li[1]/ul/li[5]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/ul/li[3]/a")).click();
		Thread.sleep(1000);
		for(int i=0;i<3;i++)
		{
			
		
		driver.findElement(By.id("food")).sendKeys(a1[i]);
		Thread.sleep(1000);
		driver.findElement(By.id("clothing")).sendKeys(a2[i]);
		Thread.sleep(1000);
		driver.findElement(By.id("shelter")).sendKeys(a3[i]);
		Thread.sleep(1000);
		driver.findElement(By.id("monthlyPay")).sendKeys(a4[i]);
		Thread.sleep(1000);
		driver.findElement(By.id("monthlyOther")).sendKeys(a5[i]);
		Thread.sleep(1000);
		
		String s=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		System.out.println("Monthly expenses is"+s);
		Thread.sleep(1000);
		String r=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		System.out.println("Monthly income is"+r);
		Thread.sleep(1000);
		
		float expense=Float.parseFloat(s);
		float income=Float.parseFloat(r);
		
		
		if(expense>income)
		{
			System.out.println("you very poor in saving"); 
		}
		else
		{
			System.out.println( "You are Warren buffet");
		}
		
		
		driver.findElement(By.id("food")).clear();
		driver.findElement(By.id("clothing")).clear();
		driver.findElement(By.id("shelter")).clear();
		driver.findElement(By.id("monthlyPay")).clear();
		driver.findElement(By.id("monthlyOther")).clear();
		
		
	}
		driver.close();
	

	
	
	
	
	}
	
	
	

}
