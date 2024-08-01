package vidhyaPrakashAutomation.testComponants;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import vidhyaPrakashAutomation.PageObjects.LoginPage;

public class BaseTest {

	public WebDriver driver;
	public LoginPage loginPage;
	
	public WebDriver initializeDriver(String browserName) {
		
		String browser = browserName;
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
		
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		return driver;
	}
	
	
	
	@BeforeTest
	public LoginPage launchApplication() 
	{
		driver = initializeDriver("chrome");
		loginPage = new LoginPage(driver);
		loginPage.goToUrl();
		
		return loginPage;
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
