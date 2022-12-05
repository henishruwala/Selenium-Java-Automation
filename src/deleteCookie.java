import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteCookie 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Link on the any link and redirected to login page - Session Timeout
		
		
	}

}
