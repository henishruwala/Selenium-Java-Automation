import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String a= driver.findElement(By.xpath("//label[@for='honda']")).getText();
		
		
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		Select s= new Select(dropdown);
		s.selectByVisibleText(a);
		
		driver.findElement(By.id("name")).sendKeys(a);
		driver.findElement(By.id("alertbtn")).click();
		
	}

}
