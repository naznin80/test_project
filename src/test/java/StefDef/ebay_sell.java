package StefDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.Bestbuy_POM;
import PageObjectModel.Dell_Mouse_POM;
import PageObjectModel.ebay_POM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

    public class ebay_sell {
	WebDriver driver;
	
	@Given("^User goes to ebay home page$")
	public void user_goes_to_ebay_home_page() throws Throwable {
		// Locate Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		// Instantiate the ChromeDriver(Import Chrome driver)
			driver = new ChromeDriver();  
				
		// Maximize window
			driver.manage().window().maximize();
						
		// open URL
			driver.get("http://ebay.com");		 
	}

	@When("^user clicks on Sell link$")
	public void user_clicks_Sell_link() throws Throwable {
	ebay_POM  EBAY= new ebay_POM(driver);
	EBAY.Selllink().click();
	
	}
	@When("^user clicks on List an item$")
	public void user_clicks_on_List_an_item() throws Throwable {
	ebay_POM  EBAY= new ebay_POM(driver);
	EBAY.Listanitem().click();	
	}

	@When("^user ckicks on search field$")
	public void user_ckicks_on_search_field() throws Throwable {
	ebay_POM  EBAY= new ebay_POM(driver);
	EBAY.searchfield().click();
	}
	
	@When("^user types keyword$")
	public void user_types_keyword() throws Throwable {
	ebay_POM Ebay = new ebay_POM(driver);
    Ebay.searchfield().sendKeys("ToyotoCar");	
	}

	@When("^user clicks on the search button$")
	public void user_clicks_on_the_search_button() throws Throwable {
	ebay_POM EBAY = new ebay_POM(driver);
	EBAY.searchfield().click();
	}
		
	@Then("^user will be redirected to Find a match page$")
	public void user_will_be_redirected_to_Find_a_match_page() throws Throwable {
	    
	}
	}
