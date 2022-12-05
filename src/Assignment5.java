import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top'")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle'")));
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.switchTo().defaultContent();
	}

}
