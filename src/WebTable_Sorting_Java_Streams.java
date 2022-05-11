import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebTable_Sorting_Java_Streams {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		//WebDriverWait W =  new  WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	
		driver.findElement(By.cssSelector("th[role='columnheader']:nth-child(1)")).click();
		
//		List<WebElement> FruitsList1 = driver.findElements(By.xpath("//tr/td[1]"));
		
		//findElements(By.cssSelector("tr td:nth-child(1)"));
	
//		List<String> OrginalList =  FruitsList.stream().map(S->S.getText()).collect(Collectors.toList());
		
//		List<String> Sorted_List = OrginalList.stream().sorted().collect(Collectors.toList());
//		
//		Assert.assertTrue(OrginalList.equals(Sorted_List));
		
	}
	
}
