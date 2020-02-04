package pancham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ama {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\sd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus6t");
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id=\"HLCXComparisonJumplink_feature_div\"]/div/span/a")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-ubb\"]")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
