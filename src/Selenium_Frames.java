import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://jqueryui.com/droppable/");
		
		//Switching to frame by using WebElement
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		//By using Index get the no of Frames by using Tagname locator iframe and get the size
		
		
		//driver.findElements(By.tagName("iframe")).size();
		
		driver.switchTo().frame(0);

//		driver.findElement(By.id("div#draggable")).click();

		Actions A = new Actions(driver);
		
		WebElement Source = driver.findElement(By.id("draggable"));
		
		WebElement Target = driver.findElement(By.id("droppable"));
		
		A.dragAndDrop(Source,Target).build().perform();
	
		driver.switchTo().defaultContent();
		
		
		
	}

}
