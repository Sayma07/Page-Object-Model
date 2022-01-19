package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LogInPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;// from line 14 to 11 then passing it to login page from line 11 to 19

	@Test
	public void validUsersShouldbeAbleTologin() {
		driver = BrowserFactory.init(); // This is coming from BrowserFactory
		// BrowserFactory.tearDown();
		// LoginPage loginPage= new LoginPage(); conventional way

		LogInPage loginPage = PageFactory.initElements(driver, LogInPage.class);
		loginPage.enterUserName("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSigninButton();

		
		DashboardPage dashboardPage= PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardHeader();
		
		
		// BrowserFactory.tearDown();	
		
	}
}
