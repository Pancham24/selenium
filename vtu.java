package pancham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\sd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vtu.ac.in/");
		driver.findElement(By.xpath("input[@placeholder='What are you looking for ?']")).sendKeys("CBCS");
	}

}
