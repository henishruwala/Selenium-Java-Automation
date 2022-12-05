import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Activities
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.navigate().to("https://kite.zerodha.com/");
		driver.navigate().back();
		driver.navigate().forward();

	}

}
