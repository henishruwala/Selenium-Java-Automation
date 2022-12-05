import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_Dropdown
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(8000);
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(8000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class$='ui-menu-item'] a"));
		Thread.sleep(8000);
		
		for(WebElement option :options) 
		{
			if(option.getText().equalsIgnoreCase("india")) 
			{
				option.click();
				break;
			}
		}

	}

}
