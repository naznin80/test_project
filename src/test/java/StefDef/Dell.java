package StefDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell {
 // Assigning driver variable to WebDriver Interface 
 // Needs to import for WebDriver
	
    WebDriver driver;
	
	@Given("^user visits dell Homepage$")
	public void user_visits_dell_Homepage() throws Throwable {
	 
		
		// Locate the Chrome driver
		  
         System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
  
		  // Instantiate the ChromeDriver (Import Chrome driver)
		  
		  //driver = new ChromeDriver();
          driver = new ChromeDriver();
          
         // Maximize window
		  
		  //driver.manage().window().maximize();
          driver.manage().window().maximize();

		 // Open URL

		//driver.get("http://dell.com");
        driver.get("http://dell.com");


	}

	@When("^user types keywords into the search field and click on the search icon$")
	public void user_types_keywords_into_the_search_field_and_click_on_the_search_icon() throws Throwable {
	 
	// Click into the search field	
		
	// Type keyword "Laptop"
		
	// Click on the search icon	
	}

	@Then("^user will be redirected to the search result page with products$")
	public void user_will_be_redirected_to_the_search_result_page_with_products() throws Throwable {
	    
	}	
	
	
	
	
	
	
	
}
