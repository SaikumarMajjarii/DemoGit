import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium_SSL_Certifications {

	public static void main(String[] args) throws IOException {
	

		//Desired Capabilities is a class which helps you customize your Chrome Browser  and pass the Object to the Chrome Options 
		DesiredCapabilities CD = new DesiredCapabilities();
		
		// Capabilities is used to create General Profile
		//one Way 
		//CD.acceptInsecureCerts();
		CD.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		
		CD.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		
		
		//CHrome Options is used to set options for local broswer 
		ChromeOptions CO = new ChromeOptions();
		
		CO.merge(CD);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(CO);
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.goibibo.com/");
		
		
		
		
		//how to delete all the cookies
		
		driver.manage().deleteAllCookies();
		
		//Take Screenshot
		
		//convert Webdriver Object to Screenshot Object

		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Src,new File("C:\\Users\\saiku\\Selenium_SS\\Google.png"));
		
		
				

	}

}
