package StefDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjectModel.Dell_Mouse_POM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell_Search_Function {
WebDriver driver;	

   @Given("^User visits Dell home page URL$")
   public void user_visits_Dell_home_page_URL() throws Throwable {
	
	// Locate Chrome driver
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	
	// Instantiate the ChromeDriver(Import Chrome driver)
			driver = new ChromeDriver();  
			
	// Maximize window
			driver.manage().window().maximize();
					
	// open URL
			driver.get("http://dell.com");		
	
	}
    @When("^User clicks on search bar$")
    public void user_clicks_on_search_bar() throws Throwable {
    
    //When User clicks on search bar	
    //driver.findElement(By.xpath("//*[@id=\"mh-search-input\"]")).click();
    // Instantiate POM Class
        Dell_Mouse_POM dell = new Dell_Mouse_POM(driver);
        dell.search_field().click();
    } 

    @When("^User types Desktop$")
    public void user_types_Desktop() throws Throwable {
    Dell_Mouse_POM dell = new Dell_Mouse_POM(driver);
    dell.search_field().sendKeys("Desktop");
    }

    @When("^User clicks on search icon$")
    public void user_clicks_on_search_icon() throws Throwable {
    //When User clicks on search icon
    Dell_Mouse_POM dell = new Dell_Mouse_POM(driver);
    dell.Searchicon().click();
    }

    @Then("^user will see the search result page$")
    public void user_will_see_the_search_result_page() throws Throwable {
    //Then user will see the search result page
    	
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
