import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newTab {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Switching window 
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		driver.switchTo().window(childWindowID);
		driver.get("https://www.rahulshettyacademy.com/");

		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();
		driver.switchTo().window(parentWindowID);
		WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys(courseName);
		
		//WebElement ScreenShot
		File file= name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("TextBox.png"));
		
		//Get Height and width of the WebElement
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}

}
