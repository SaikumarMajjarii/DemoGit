import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Calendar_Ui {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.goibibo.com/");

		
		Thread.sleep(3000);
		
//		WebDriverWait W =  new  WebDriverWait(driver,Duration.ofSeconds(15));
//		
//		W.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Departure']")));

		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		while (!driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Caption']")).getText().contains("May"))
		{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				
		}

		List<WebElement> Dates = driver.findElements(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']"));

		int Count = driver.findElements(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']")).size();

		for (int i = 0; i < Count; i++)

		{

			String Text =  driver.findElements(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']")).get(i).getText();

			if (Text.contains("31"))
					
			{
				
				 driver.findElements(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']")).get(i).click();
				
				 System.out.println("clicked");
				
				break;
			}

		}

	}
}
