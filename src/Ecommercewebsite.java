import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommercewebsite
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		String[] itemNeeded= {"Cucumber","Brocolli", "Beetroot", "Mushroom"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(15000);
		addItems(driver, itemNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//Explicit Wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	

	}
	public static void addItems(WebDriver driver, String[] itemNeeded)
	{
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<products.size(); i++)
		{
			String[] name= products.get(i).getText().split("-");
			String formattedNamed= name[0].trim();
			List itemNeededList= Arrays.asList(itemNeeded);
			
			if(itemNeededList.contains(formattedNamed))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemNeeded.length)
				{
					break;
				}
			}
		}
	}

}
