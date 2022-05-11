
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Driver\\chromedriver.exe");
			
			
			//WebDriver driver = new FirefoxDriver();
			//WebDriver driver = new EdgeDriver();
		
			
			WebDriver driver = new ChromeDriver();
			//Implicit Wait 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			
			//By ID 
			driver.findElement(By.id("inputUsername")).sendKeys("Saikumar");
			
			//By Name'
			driver.findElement(By.name("inputPassword")).sendKeys("Saikumar123");
			
			//By ClassName in console for CLass $('p.error')
			driver.findElement(By.className("signInBtn")).click();
			
			
			//Css Selector 
			
			String Error = driver.findElement(By.cssSelector("p.error")).getText();
			
			//System.out.println(Error);// you will get Error if you  NoSuchElementException so mention Implicit or Static Wait to remove that error 
			
			//Link Text Locator '
			driver.findElement(By.linkText("Forgot your password?")).click();// only when when element has tagname 'A'Anchor Tag
			
			
			Thread.sleep(1000);
			//By Xpath in Console $x('//input[@placeholder="Name"]') for Xpath
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Saikumar");
			
			//Customized CSS selector
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Saikumar@kumar.com");
			
			driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	
			//Multiple Elements are Matching in CSS Selector 
			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Saikumar@gmail.com");
			
			//Multiple Elements are Matching in Xpath then we right 
			// (//TagName[@Attriubute ='Value'][index]
			
			//Parent  to Child Traverse	     // for Css put Space //form input[3]
			driver.findElement(By.xpath("//form/input[3]")).sendKeys("9382800000");
			
			//Css Locator using Tagname.Classname
			driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
			
			//Css locator using generic Syntax
			
			System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
			
			
			driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
			
			Thread.sleep(1000);
			
			//Sign in Process
			driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Saikumar");
			
			//Regular Expression Using xpath'
			
			driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("rahulshettyacademy");
			
			//Regular Expressionn Using Expath input[Attr*='value']
			
			driver.findElement(By.cssSelector("button[class*='submit signInBtn']")).click();
			
			
			//div[@class='forgot-pwd-btn-conainer']/button[1] CUstomized,Index,Parent to Child COmbination Locator
			
	}

}
