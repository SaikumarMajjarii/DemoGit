import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		int Sum =0;
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		//to Scroll in Table
		JS.executeScript("window.scrollBy(0,350)", "");
		
		Thread.sleep(5000);
		
		//to Scroll in Table
		JS.executeScript("document.querySelector('.tableFixHead').scrollTop =5000");
		
		
		List<WebElement> Values=    driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		for(int i=0;i<Values.size();i++)
		{
			//Converting String to Integer
			
			Sum = Sum + Integer.parseInt(Values.get(i).getText());
			
		}

		int Total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(Sum,Total);
		
		
		
	}

}
