package pancham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\sd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("//*[contains(@name,'name')]")).sendKeys("pancham");
		driver.findElement(By.xpath("//*[contains(@name,'login')]")).sendKeys("pancham@gmail.com");
		driver.findElement(By.xpath("//*[contains(@name,'passwd')]")).sendKeys("1234");
		driver.findElement(By.xpath("//*[contains(@name,'confirm_passwd')]")).sendKeys("1234");
		driver.findElement(By.xpath("//*[contains(@name,'chk_altemail')]")).click();
		driver.findElement(By.xpath("//*[@src='https://register.rediff.com/utilities/newforgot/img/darrow_country.png']")).click();
		
		
		driver.findElement(By.xpath("//*[text()='USA / Canada (+1)']")).click();
		Thread.sleep(1000);
		Select s= new Select(driver.findElement(By.id("country")));
		Thread.sleep(1000);
		s.selectByValue("8");
		Thread.sleep(1000);
		s.selectByVisibleText("India");
		Thread.sleep(3000);
		
		
		
	}

}
