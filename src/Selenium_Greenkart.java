import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Greenkart {


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Explicit Wait 
		
		
		WebDriverWait W =  new  WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		Thread.sleep(3000);

		String[] Items = { "Cucumber", "Brocolli", "Cauliflower" };
		
		Additems(driver,Items);
		
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		W.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
		
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		
		W.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
		

	}


	public static void Additems(WebDriver driver, String[] Items) {

		int j = 0;
		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i <Products.size(); i++)

		{

			String[] productName = Products.get(i).getText().split("-");
			String formattedString = productName[0].trim();

			List NeededProduct = Arrays.asList(Items);

			if (NeededProduct.contains(formattedString))

			{

				// Click on add to Cart Use findElements and index to CLick

				// AS text with Change so we should not depend on Text
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == Items.length)
				{
					break;
				}

			}
		}

	}

}
