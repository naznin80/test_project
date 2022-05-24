package StefDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectModel.Bestbuy_POM;
import PageObjectModel.Dell_Mouse_POM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Bestbuy_Search {

WebDriver driver;
private String search;	
@Given("^User Visits Bestbuy homepage\"([^\"]*)\"$")
public void user_Visits_Bestbuy_homepage(String arg1) throws Throwable {
	
	    // Locate Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		// Instantiate the ChromeDriver(Import Chrome driver)
		driver = new ChromeDriver();  
				
		// Maximize window
		driver.manage().window().maximize();
						
		// open URL
		driver.get(arg1);		 
	  }

      @When("^User Clicks on search field$")
      public void user_Clicks_on_search_field() throws Throwable {
    	  
     //When User clicks on search bar
     Bestbuy_POM bestbuy = new Bestbuy_POM(driver);
    //Instantiate Class
     WebDriverWait wait = new WebDriverWait(driver,5);
     
     //wait.until(ExpectedConditions.elementToBeClickable(bestbuy.search_field())).click();
     
     wait.until(ExpectedConditions.elementToBeClickable(bestbuy.search_field()));
     bestbuy.search_field().click();
     } 
      
     // Explicit wait not on best buy
      // Explicit wait is a local wait, and it only applies to one element
      // We need to specify one single element for each "explicit wait."
      // We need to use built in Class "WebDriverWait"
      // Explicit wait adds additional time after implicit wait.
      
     @When("^User typs product name \"([^\"]*)\"$")
     public void user_typs_product_name(String arg1) throws Throwable {
    	 
    //User typs product name "<Laptop>"
     Bestbuy_POM bestbuy = new Bestbuy_POM(driver);
     
   //Instantiate Class
     WebDriverWait wait = new WebDriverWait(driver,5);
     
     wait.until(ExpectedConditions.elementToBeClickable(bestbuy.search_field())).sendKeys("Laptop");
     
	 bestbuy.search_field().sendKeys("argl");
	 
	 
    }
     @When("^User clicks on the search button$")
    public void user_clicks_on_the_search_button() throws Throwable {
    	 
   //User clicks on the search button
  	Bestbuy_POM bestbuy = new Bestbuy_POM(driver);
	bestbuy.Searchicon().click();
    }
    		
    		
    }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

