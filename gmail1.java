package pancham;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class gmail1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\slk\\Desktop\\sd\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		myprint(driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		String vParent=it.next();
		String vChild=it.next();
		driver.switchTo().window(vChild);
		myprint(driver.getTitle());
		driver.findElement(By.linkText("Community")).click();
		myprint(driver.getTitle());
		driver.switchTo().window(vParent);
		myprint(driver.getTitle());
		driver.quit();
		
		
		
	}

	private static void myprint(String ab) {
		// TODO Auto-generated method stub
		System.out.println(ab);
		
	}

}
