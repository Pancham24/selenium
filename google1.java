package pancham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google1 {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\sd\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("cars");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		myprint(driver.getTitle());
	}

	private static void myprint(String ab) {
		System.out.println(ab);
		
	}

}
