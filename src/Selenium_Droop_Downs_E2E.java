import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium_Droop_Downs_E2E {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		Thread.sleep(2000);
		
		//Parent to Child Xpath traverse
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
		
		//Calendar handling Current Date 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		Thread.sleep(1000);
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.print("is Disabled");
			Assert.assertTrue(true);
			
		}
		else
			
		{
			System.out.print("is Enabled");
			
			Assert.assertTrue(false);
			
				
		}

		driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(3000);
		
		for(int i = 1;i<=4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		driver.findElement(By.cssSelector("input#ctl00_mainContent_btn_FindFlights")).click();
		
	}

}
