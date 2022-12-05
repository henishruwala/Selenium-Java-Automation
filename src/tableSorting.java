import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class tableSorting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// Click on the column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		// capture all WebElement in the list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		// capture text of the all WebElement into new(original list) list
		List<String> originalList = elementList.stream().map(s -> s.getText()).collect(Collectors.toList());
		// Sort the list in the step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		// Compare the original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		
		List<String> price;
		// Scan the name column with the getText -> Rice -> Print the price of the rice
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice"))
					.map(s -> getPriceVeggies(s)).collect(Collectors.toList());
			price.forEach(s -> System.out.println(s));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		} while (price.size() < 1);

	}

	private static String getPriceVeggies(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
