package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LogInPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
@Test		
public void validUserShouldBeAbleToCreateCustomer() {
	driver = BrowserFactory.init();
	LogInPage loginPage = PageFactory.initElements(driver, LogInPage.class);
	loginPage.enterUserName("demo@techfios.com");
	loginPage.enterPassword("abc123");
	loginPage.clickSigninButton();

	
	DashboardPage dashboardPage= PageFactory.initElements(driver, DashboardPage.class);
	dashboardPage.validateDashboardHeader();
	dashboardPage.clickOnCustomerButton();
	dashboardPage.clickOnaddCustomerButton();

	AddCustomerPage   addCustomerPage= PageFactory.initElements(driver, AddCustomerPage.class);
	addCustomerPage.insertUserName("Selenium");
	addCustomerPage.insertCompanyNmae("Techfios");
	addCustomerPage.insertEmailAddress("abc@techfios.com");
}
}
