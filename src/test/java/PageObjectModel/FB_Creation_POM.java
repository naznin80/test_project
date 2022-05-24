package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

   public class FB_Creation_POM {
	
  
WebDriver driver;	
	
    public FB_Creation_POM (WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }
	
	@FindBy(name="firstname")
	WebElement First_Name;
	public WebElement First_Name_Field() {
	return First_Name;
	}	
	
	@FindBy(name="lastname")
	WebElement Last_name;
	public WebElement last_name_field() {
	return Last_name;
	}
	//Select Class
	
	@FindBy(name="birthday_day")
	WebElement Birth_Day;
	public WebElement Birth_Day_Field() {
	return	Birth_Day;
	}
	@FindBy(name="birthday_month")
	WebElement Birthday_Month;
	public WebElement Birthday_Month_Field() {
	return Birthday_Month;
	}
	
	@FindBy(xpath="//*[@id=\"year\"]")
	WebElement Birth_Day_Year;
	public WebElement Birth_Day_Year_Field() {
	return Birth_Day_Year;
	}
	@FindBy(name="websubmit")
	WebElement sign_up;
	public WebElement Birthday_Signup_field() {
	return sign_up;	
	}
	
	}
	
	
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


