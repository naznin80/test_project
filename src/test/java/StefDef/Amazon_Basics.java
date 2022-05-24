package StefDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon_Basics {
	WebDriver driver;
	
	@Given("^user visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
		
		// Locate Chrome driver using key and value
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		// Instantiate the ChromeDriver(Import Chrome driver)
		driver = new ChromeDriver(); 
		
		// Maximize window
		driver.manage().window().maximize();
		
		// open URL
		driver.get("https://amazon.com");
		
	}
	
	
	//Syntax for custome xpath:
	//TagName[@Attribute="value"]
	
	@When("^user clicks on Best seller$")
	public void user_clicks_on_Best_seller() throws Throwable {
		
		
	// Click on amazon Basics
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
	
	// Click on Amazon Bestseller
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
	
	// Click on Search bar
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
	
	// Type "Laptop"
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Laptop");
	
	// Click on search icon
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	} 
	

	@Then("^user should be able to redirect to the Best Seller Page$")
	public void user_should_be_able_to_redirect_to_the_Best_Seller_Page() throws Throwable {
	    
	}
    /*
	tag_name starts with <
	for example:  
	<a
	<input
	<select
	
	Attribute comes right after the tag_name:
	Example:
	<a href  >> href is the attribute
	

	Example of custome xpath:

	//a[@href="/stores/ref_=nav_cs_amazonbasics"]
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
