import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Broken_Links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		SoftAssert Sa =new SoftAssert();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		
		
		List<WebElement> Links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		
		for (WebElement Link: Links)
			
		{
		
			String Url =Link.getAttribute("href");
			
			
			HttpURLConnection Conn = (HttpURLConnection) new URL(Url).openConnection();
			
			Conn.setRequestMethod("HEAD");
			
			Conn.connect();
			
			int Code = Conn.getResponseCode();
	
			Sa.assertTrue(Code >400,"The broken Link is" +Link.getText() +"is broken with Code"+ Code );
				
		
			
		}
		
		Sa.assertAll();
		
		//Java methods will call the java Methods to get the Status Codes 

		
		
		

	}

}
