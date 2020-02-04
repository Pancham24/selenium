package pancham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	static WebDriver driver;
	static String r;
	static String t="cars";
	public static void cc()
	{
		  r=driver.findElement(By.name("q")).getAttribute("value");
		if(r.equals(t))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
	
	
	
	
	}
	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\sd\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("cars");
		Thread.sleep(4000);
driver.findElement(By.name("btnK")).click();
String s=driver.findElement(By.id("resultStats")).getText();

Thread.sleep(4000);
/*String r=driver.findElement(By.name("q")).getAttribute("value");
if(r.equals(t))
{
	System.out.println("Test case pass");
}
else
{
	System.out.println("Test case fail");
}*/
cc();
//System.out.println(s);

driver.close();



	}

}
