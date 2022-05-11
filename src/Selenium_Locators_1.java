import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
 
public class Selenium_Locators_1 {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		String Name = "Saikumar";
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String Pass= GetPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(Pass);
		driver.findElement(By.cssSelector("button[class*='submit signInBtn']")).click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+Name+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		driver.close();
		
		
	}
	
	
	
	public static String GetPassword(WebDriver driver) throws InterruptedException
	
	{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String Password_Text = driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] Password =Password_Text.split("'");
		
		String Main_Password = Password[1].split("'")[0];
		
		return Main_Password;
		
		
	}

}
