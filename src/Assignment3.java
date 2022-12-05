import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		WebElement options= driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(options);
		dropdown.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.xpath("//input[@value='user']")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-footer .btn-info")));
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for (int i = 0; i < products.size(); i++)

		{

			products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();
		
	}

}
