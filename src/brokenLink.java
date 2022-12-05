import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLink
{
	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Broken URL 
		//Step 1: is to get all the URL of that page using selenium
		List<WebElement> links=  driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a= new SoftAssert();
		
		for(WebElement link : links)
		{
			String url=link.getAttribute("href");
			//Step 2: Java method will call URL's and get you the status code
			HttpURLConnection Conn= (HttpURLConnection) new URL(url).openConnection();
			Conn.setRequestMethod("HEAD");
			Conn.connect();
			// If Status Code > 400 then That URL is not working
			int responseCode= Conn.getResponseCode();
			System.out.println(responseCode);
			a.assertTrue(responseCode<400, "The link with text"+ link.getText()+ " is broken with code"+responseCode);
			
		}	
		a.assertAll();

	}

}
