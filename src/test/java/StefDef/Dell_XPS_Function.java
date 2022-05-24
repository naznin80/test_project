package StefDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.Dell_XPS_Function_POM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell_XPS_Function {
	WebDriver driver;

	@Given("^user goes to Dell XPS page$")
	public void user_goes_to_Dell_XPS_page() throws Throwable {
		// Locate Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		
		// Instantiate the ChromeDriver(Import Chrome driver)
				driver = new ChromeDriver();  
				
		// Maximize window
				driver.manage().window().maximize();
						
						
		// open URL
				driver.get("https://www.dell.com/en-us/search/xps");			
		}

	@When("^user selects Sort By \\[Price Low to High\\]$")
	public void user_selects_Sort_By_Price_Low_to_High() throws Throwable {
	Dell_XPS_Function_POM Select_Price = new Dell_XPS_Function_POM(driver);
	Select dropdown = new Select(Select_Price.Select_Price());
	
	//drop down
	dropdown.selectByVisibleText("Price Low to High");
	//dropdown.selectByIndex(1);
	}

	@Then("^user will see listing sorted low to high price$")
	public void user_will_see_listing_sorted_low_to_high_price() throws Throwable {
}	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


