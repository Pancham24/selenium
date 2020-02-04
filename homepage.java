package pancham;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;
import com.steadystate.css.util.Output;

public class homepage {
	public static String vUrl;
	public static WebDriver myD;
	public static int a;
public homepage()
{
	vUrl="https://in.yahoooo.com/?p=us";
	a=2;
}

static String web() throws IOException
		{
			myD.manage().window().maximize();
			myD.get("https://in.yahoo.com/?p=us");
			
		String a=myD.getCurrentUrl();
		
		
		if(vUrl.equals(myD.getCurrentUrl()))
		{
			return "pass";
		}
		else
		{
			File scrFile=(File)((TakesScreenshot)myD).getScreenshotAs(OutputType.FILE);
				Files.copy(scrFile,new File("C:\\Users\\slk\\Desktop\\sd\\TC001.jpg"));
			return "fail";
			
		}
		}
		public static String AppClose()
		{
			String vFlag="Fail";
			myD.close();
			vFlag="Appclose Test Case Pass";
			return vFlag;
		}
		public static String Browsercall()
		{
			if(a==1)
			{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\slk\\Desktop\\sd\\chromedriver.exe");
			myD=new ChromeDriver();
			return "Browsercall pass";
			}
			if(a==2)
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\slk\\Desktop\\sd\\geckodriver.exe");
				myD=new FirefoxDriver();
				return "Browsercall pass";
			}
			else
			{
			System.out.println("Invalid Browser");
			return"Browsercall test case fail";
			}
			
		}
		
	
		
}

