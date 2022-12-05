import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Updated_Dropdown 
{
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(40000);
		
		// Radio Button selection
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//Checkbox Selection
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		
		//count the number of checkboxs
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//Passanger selection
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000);
		/*int i=1;
			while(i<5)
		{
				driver.findElement(By.id("hrefIncAdt")).click();
				i++;
			
		}*/
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		// Autosuggestion dropdown
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
		
		//Static Drop Down
				WebElement Staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select dropdown= new Select(Staticdropdown);
				dropdown.selectByIndex(3);
				System.out.println(dropdown.getFirstSelectedOption().getText());
				dropdown.selectByVisibleText("AED");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				dropdown.selectByValue("INR");
				System.out.println(dropdown.getFirstSelectedOption().getText());
		
		// Dynamic Dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@value='STV']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
		
		//Calendar UI
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		
		//validating Enabled and Disable Element
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.print("Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.print("Disabled");
			Assert.assertTrue(false);
			
		}
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		
	}

}
