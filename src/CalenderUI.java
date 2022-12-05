import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI 
{
	public static void main(String[] args)
	{
		String month= "October 2022";
		String day= "31";
		
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://www.path2usa.com/travel-companion/");
		js.executeScript("window.scrollBy(0,500)");
		//driver.findElement(By.xpath("//*[@id=\"form-field-travel_comp_date\"]")).click();
		
	}
}