package pancham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\sd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.in/");
		driver.findElement(By.id("search")).sendKeys("Jab Harry Met sejal");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'SAFAR - Jab Harry Met Sejal')]")).click();

	}

}
