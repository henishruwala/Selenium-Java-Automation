import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleium_Introduction 
{

	public static void main(String[] args) 
	{
		//Invoking Browser
		//Chrome - ChromeDriver ->methods
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Henish Roowala\\Downloads\\chromedriver.exe"); 
		//webdriver.chrome.driver -> value path
		//ChromeDriver.exe -> Chrome Browser
		WebDriver driver= new ChromeDriver();  //WebDriver Methods + Class Methods
		
	//MicroSoftEdge 
		// System.setProperty("webdriver.edge.driver", "H:\\msedgedriver.exe");
		// WebDriver driver= new EdgeDriver();
		
		driver.get("https://signfast.com"); //to open any Website
		System.out.println(driver.getTitle()); //display the url title
		System.out.println(driver.getCurrentUrl()); //display current page url
		System.out.println(driver.getPageSource()); //to get source of last page
		driver.close(); // to close any website
	}

} 

