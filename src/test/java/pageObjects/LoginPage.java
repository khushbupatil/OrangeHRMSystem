package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	public void setUsername(String user_name) {
		Username.sendKeys(user_name);
	}
	
	public void setPassword(String pass_word) {
		Password.sendKeys(pass_word);
	}
	
	public void login() {
		loginbtn.click();
		
		/*
		 loginbtn.submit();
		 
		Actions act = new Actions(driver);
	    act.moveToElement(loginbtn).click().perform();
		 
	   */
	    
		 
	}

}
