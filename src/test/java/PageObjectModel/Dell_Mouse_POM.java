package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dell_Mouse_POM {

    WebDriver driver;	
	//Constructor (Special Method)
	public  Dell_Mouse_POM (WebDriver driver){
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }
	
	//Dell home page Search field top page of the page
	@FindBy(xpath="//*[@id=\"mh-search-input\"]")
	WebElement Search_Field_homepage;
	public WebElement search_field() {
	return Search_Field_homepage;
	}
	//When User types Desktop
	@FindBy(xpath="//*[@id=\"mh-search-input\"]")
	WebElement types ;
	public WebElement desktop() {
	return types;
	
	} 
	
	// Search button 
	@FindBy(xpath="//*[@id=\"unified-masthead\"]/div[1]/div[1]/div[2]/button[2]")
	WebElement Searchbutton;
	public WebElement Searchicon (){
	return Searchbutton;
	}
	
	//Dell Mouse hover
	//Home page menu item "Products"
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]")
	WebElement homepage_menu_item_products;
	public WebElement menu_item_products() {
	return homepage_menu_item_products;	
	}
	
	//Home page sub menu Workstation
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[6]")
	WebElement homepage_submenu_workstation;	
	public WebElement submenu_item_products() {
	return homepage_submenu_workstation;
	
	}
	

	
		
	}
	
	
