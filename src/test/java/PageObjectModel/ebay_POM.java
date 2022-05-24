package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ebay_POM {


WebDriver driver;	
	
    //Constructor (Special Method)
	 public  ebay_POM (WebDriver driver){
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }	
	
	//Click on Sell link of home page
	@FindBy(xpath="//*[@id=\"gh-p-2\"]")
	WebElement Click_Sell_link ;
	public WebElement Selllink () {
	return Click_Sell_link ;
	
	}
	//Clicks on List an item 
	@FindBy(xpath="//*[@id=\"image_banner_1\"]/div/div/a")
	WebElement product ;
	public WebElement Listanitem () {
	return product;
	}
	
	
	// List item search box
	@FindBy(xpath="//*[@id=\"s0-0-0-22-11-keyword-box-input-textbox\"]") 
	WebElement search_button;
	public WebElement searchfield() {
	return search_button;
	}
	
	// Search button for listing item page
	
	
	
}
	
	
	
	
	
	
	
		
	
	
	
