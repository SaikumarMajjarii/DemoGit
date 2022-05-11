import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selemnium_DropDown_Handling {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		
		// Static Drop Down
		WebElement Static_DropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select DropDown = new Select(Static_DropDown);

		Thread.sleep(3000);
		
		
		DropDown.selectByIndex(3);
		DropDown.selectByVisibleText("AED");

		System.out.println(DropDown.getFirstSelectedOption().getText());

		DropDown.selectByValue("INR");
		
		driver.findElement(By.id("divpaxinfo")).getText();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);

		for (int i = 1; i <= 5; i++) {
			
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		Thread.sleep(1000);
		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	

	}

}
