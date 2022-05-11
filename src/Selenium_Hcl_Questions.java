import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Hcl_Questions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// TO get All Links
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Code to Footer Links '
		WebElement FooterDriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(FooterDriver.findElements(By.tagName("a")).size());

		WebElement ColumnDriver = FooterDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		int LinksSize = ColumnDriver.findElements(By.tagName("a")).size();

		// CLick Each Tab
		for (int i = 1; i < LinksSize; i++) {

			// to send Keys
			String ClickLink = Keys.chord(Keys.CONTROL, Keys.ENTER);

			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(ClickLink);
			
			Thread.sleep(1000);
			
		}
		
			//to Move to Next Window Titles and get the Title
			Set<String> TitleWindows = driver.getWindowHandles();

			Iterator<String> Titles = TitleWindows.iterator();
			
			while(Titles.hasNext())
			{
				System.out.println(driver.switchTo().window(Titles.next()).getTitle());
				
			}
			
	
		}

	}


