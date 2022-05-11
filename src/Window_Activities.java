import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Activities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.navigate().to("https://google.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();


	}

	
	public void GetData()
	{
		
		System.out.println("Retried Data Successfully");
	}
	
	
	public void GetProduct()
	{
		
		System.out.println("Retried Product Successfully");
	}

	public void GetDetails()
	{
		
		System.out.println("Retried Product Successfully");
	}
	
	public void GetProductPrice()
	{
		
		System.out.println("ProductPrice Retrived Successfully");
	}
	
	public void GetProductName()
		{
		System.out.println("ProductName Retrived Successfully");
	}
	
	
}
