import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Actions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.com/?currency=INR&language=en_US");
		
		
		
		//Mouse Hover to specfic Element
		
		Actions A =new Actions(driver);
		
		WebElement Move = driver.findElement(By.cssSelector("a#nav-link-accountList"));
		
		//Hovering
		A.moveToElement(Move).build().perform();
		
		//Composite Action senkeys and select the Text 
		A.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
		
		//RightCLick
		A.moveToElement(Move).contextClick().build().perform();

	}

}
