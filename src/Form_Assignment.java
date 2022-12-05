import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form_Assignment
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Ruwala Henish");  
		driver.findElement(By.name("email")).sendKeys("ruwalahenish@gmail.com"); 
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");  
		driver.findElement(By.id("exampleCheck1")).click(); 
		WebElement staticdropdown= driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown= new Select(staticdropdown);
		dropdown.selectByVisibleText("Male");                      
		driver.findElement(By.id("inlineRadio1")).click();  
		driver.findElement(By.name("bday")).sendKeys("10/31/1999");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		

	}

}
