import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium_CheckBoxs {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
		
		
		//Assertion from Testng
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).click();
		
		
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());
		
		//how to FInd the Count of Check Boxes
		//fst get the Coomon Locator
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
		//Assert.assertEquals("Actual-Selenium ouput ","Expected - our value to be compared");
		
		
}

}
