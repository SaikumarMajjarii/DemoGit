import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Easy_My_Trip_Calendar_Handling {


			public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

				driver.get("https://www.easemytrip.com");

				
				Thread.sleep(5000);
				
//				WebDriverWait W =  new  WebDriverWait(driver,Duration.ofSeconds(15));
//				
//				W.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Departure']")));
				
				
//				driver.switchTo().alert().accept();
				

				driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
				
				
				System.out.println(driver.findElement(By.cssSelector("div.month")).getText());
				
		
				getMonth(driver,"2023");
				
			
				while (!driver.findElement(By.cssSelector("div.month")).getText().contains("FEB"))
					
				{
						driver.findElement(By.cssSelector("div[class='month-sec'] img[id='img2Nex']")).click();
						
						
				}
				
				List<WebElement> Dates = driver.findElements(By.cssSelector("div[class='box'] div[class='days'] li"));

				int Count = driver.findElements(By.cssSelector("div[class='box'] div[class='days'] li")).size();

				
				System.out.println(driver.findElements(By.cssSelector("div[class='box'] div[class='days'] li")).size());
				
				
				
				for (int i = 0; i < Count; i++)

				{

					String Text =  driver.findElements(By.cssSelector("div[class='box'] div[class='days'] li")).get(i).getText();

					if (Text.contains("20"))
						
							
					{
						
						driver.findElements(By.cssSelector("div[class='box'] div[class='days'] li")).get(i).click();
						
						 System.out.println("clicked");
						
						break;
					}
					
				}

	}
			
		public static String getMonth(WebDriver driver,String Month )
		
		{
			
			while (!driver.findElement(By.cssSelector("div.month")).getText().contains(Month))
			
			{
					driver.findElement(By.cssSelector("div[class='month-sec'] img[id='img2Nex']")).click();
					
					
			}
			return Month;
			
			
		}

}
