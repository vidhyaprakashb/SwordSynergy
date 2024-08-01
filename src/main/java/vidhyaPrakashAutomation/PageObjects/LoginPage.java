package vidhyaPrakashAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	String synergyUrl = "https://swordgin.com/";
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	WebElement emailAddress;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(css = "button[type='submit']")
	WebElement loginBtn;
	
	public void goToUrl() {
		driver.get(synergyUrl);
	}
	
	public void loginSynergy() 
	{
		emailAddress.sendKeys("vidhyaprakash.b@swordgroup.in");
		password.sendKeys("12011987@Bv");
		loginBtn.click();
		return new DashboardPage();
	}
	
	

	
	
	

}
