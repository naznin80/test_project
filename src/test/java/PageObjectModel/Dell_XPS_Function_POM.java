package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dell_XPS_Function_POM {
	
	WebDriver driver;	
	
	public  Dell_XPS_Function_POM (WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }
		
	@FindBy(id="mh-search-input\"]")
	WebElement Search_XPS_Field_Page;
	public WebElement search_field() {
	return Search_XPS_Field_Page;	
	}
	// Select class
	
	@FindBy(xpath="/html/body/main/div/div[3]/div/div/div[2]/div[1]/nav/ol/li[4]/select")
	WebElement Select_Short_By_Price_Low_to_High;
	public WebElement Select_Price() {
	return Select_Short_By_Price_Low_to_High;	
	}
	
	
	

}
