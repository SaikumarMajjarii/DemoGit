import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Auto_Suggestion_Drop_Downs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		
		Thread.sleep(2000);
		
		List<WebElement> Dropdown_Options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		
		for(WebElement Option:Dropdown_Options)
		{
			if(Option.getText().equalsIgnoreCase("India"))
			{
				Option.click();
			
				break;
			}
		}
	}

}

