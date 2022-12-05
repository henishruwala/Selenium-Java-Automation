import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// 1. Give the count of the links of the pages
		   // In HTML which contains "a"(anchor) tag that means it is link.
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. Give the count of link in the footer sections.
		WebElement footerDriver= driver.findElement(By.id("gf-BIG")); //limiting Webdriver Scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3. Give the count of the links of first column in the footer sections.
		WebElement columnDriver=footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//4. click on the link of the column and check all pages are open or not.
		for(int i=1; i<columnDriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickOnLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
		}
			//5. Go to child Window and grab the web page title in the output.
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it =abc.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}		
		
	}

}
