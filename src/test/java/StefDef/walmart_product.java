 package StefDef;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.Walmart_Product_POM1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



 public class walmart_product {
	WebDriver driver;
	
	@Given("^user visits walmart homepage http://walmart\\.com$")
	public void user_visits_walmart_homepage_http_walmart_com() throws Throwable {
		
		// Locate Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	
		// Instantiate the ChromeDriver(Import Chrome driver)
		driver = new ChromeDriver();  
		
		// Maximize window
		driver.manage().window().maximize();
				
				
		// open URL
		driver.get("http://walmart.com");		
		
	}

	@When("^user types walmart product into the search field and click on search icon$")
	public void user_types_walmart_product_into_the_search_field_and_click_on_search_icon() throws Throwable { 
	Walmart_Product_POM1 walmart = new Walmart_Product_POM1(driver);
	walmart.product_searchfield().sendKeys("milk");	
	}

	@Then("^user will be redirected to the search result page with product$")
	public void user_will_be_redirected_to_the_search_result_page_with_product() throws Throwable {
	    
	}
	
	
	}
