import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String name="John Wick";
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //for timeout
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("inputUsername")).sendKeys("Henish"); //id locator
		Thread.sleep(5000);
		driver.findElement(By.name("inputPassword")).sendKeys("123456");//name locator
		Thread.sleep(5000);
		driver.findElement(By.className("signInBtn")).click(); // Class name locator
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //for CSS selector locator
		driver.findElement(By.linkText("Forgot your password?")).click(); // link text locator
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Alex Parker"); // xpath locator
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("alexparker@mailinator.com"); // customized css locator
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); //Customized xpath locator
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("johncarter@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890"); // Parent to child tag xpath locators
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); // Parent to child tag css selector locators
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class$='signInBtn']")).click();
		System.out.println(driver.findElement(By.tagName("p")).getText());
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		driver.close();

		
	}

}
