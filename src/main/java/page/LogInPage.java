package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {
//Element Library
	
	WebDriver driver;
	
public LogInPage(WebDriver driver) {
	this.driver=driver;
	
	
}	
	
	
	
	//WebElement UserName_Field_Element=driver.findElement(By.xpath("//*[@id='username']"));
	//By   UserName_Field=By.xpath("//*[@id='username']");
	@FindBy(how=How.XPATH,using="//*[@id='username']") WebElement UserName_Field;
	@FindBy(how=How.XPATH,using="//input[@id='password']")WebElement Password_Field;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")WebElement SignIn_Button;

	//Interactive Methods--1
	public void enterUserName(String UserName) {
		UserName_Field.sendKeys(UserName);
	}
	public void enterPassword(String Password) {
		
		Password_Field.sendKeys(Password);
		}
	public void clickSigninButton() {
		
		SignIn_Button.click();}

	
	/*//Interactive Methods--2
	public void loginIn(String username,String Password) {
		UserName_Field.sendKeys(username);
		Password_Field.sendKeys(Password);
		SignIn_Button.click();

	*/
	
	
	}
	
	
	
	

