package pancham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class certi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\sd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwarecertifications.org/corporates/");
		driver.findElement(By.xpath("//nav[@id='site-nav']/ul/li[7]/a")).click();

	}

}
