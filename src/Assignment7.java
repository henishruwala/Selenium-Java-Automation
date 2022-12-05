import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement table= driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("th")).size());
		
		System.out.println(table.findElement(By.xpath("//tr[3]")).getText());

	}

}
