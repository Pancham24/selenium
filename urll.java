package pancham;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class urll {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\slk\\Desktop\\sd\\geckodriver.exe");
		
		
		
		WebDriver myD=new FirefoxDriver();
		
		myD.manage().window().maximize();
		myD.get("https://in.yahoo.com/?p=us");
		
	String a=myD.getCurrentUrl();
	String b="https://in.yahoo.com/?p=us";
	myD.close();
	if(a.equals(b))
{
	System.out.println("Test case passed");
}
else
{
	System.out.println("Test case failed");
}




}
}
