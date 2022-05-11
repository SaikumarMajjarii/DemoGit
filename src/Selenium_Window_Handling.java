import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Window_Handling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		
		
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
		//Window Handling 
		Set<String> Windows = driver.getWindowHandles();
		
		Iterator<String> Handles = Windows.iterator();
		
		String Parent = Handles.next();
		String Child = Handles.next();
		
		driver.switchTo().window(Child);
		
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		driver.switchTo().window(Parent);
		

	}

}
