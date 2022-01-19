package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomerPage extends Basepage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Contact')]")
	WebElement Add_Contact_Locator;
	@FindBy(how = How.XPATH, using = "//input[@id='account'  ]")
	WebElement FULL_NAME_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement Company_Nmae_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement Email_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement Phone_NO_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement Address_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement City_Locator;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement State_Field_Locator;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement Zip_Field;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"select2-country-container\"]")
	WebElement Country_Locator;
	
	
	
	
	public void insertUserName(String Username) {
		
		
		int genNum=randomGenarator(999);	
		FULL_NAME_LOCATOR.sendKeys(Username+genNum);	//shorashori nam deya jabe na
	}

	public void insertCompanyNmae(String companyName) {
		selectdropDown(Company_Nmae_Locator,companyName);
	
	
	
	}

public void insertEmailAddress(String email) {
	
	int genNum=randomGenarator(999);	

	Email_Locator.sendKeys(email+genNum);
	
	
}	

		
	

	

		
	

	
	}


