package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_POM {

 WebDriver driver;
 
 // Constructor (Special Method)	
	public Facebook_POM (WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver, this);
	
	}
	
	//Facebook home page email field top of the page
	@FindBy(xpath="//input[@aria-label=\"Email or phone number\"]")
	WebElement email_field;
	public WebElement entryemail() {
	return email_field;
	
	}	
	
	//User enters password into the password field
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")
	WebElement password_field;
	public WebElement entrypassword() {
	return password_field;
	}
	//User clicks on Login Button
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
    WebElement login_button;
	public WebElement gologin() {
	return login_button;
	}
	
	
	
}
