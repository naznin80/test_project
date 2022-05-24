package StefDef;

   import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.Dell_Mouse_POM;
import PageObjectModel.Facebook_POM;
import cucumber.api.java.en.Given;
   import cucumber.api.java.en.Then;
   import cucumber.api.java.en.When;

    public class facebook_login {
	WebDriver driver;	
	
	@Given("^User goes to Facebook home page$")
	public void user_goes_to_Facebook_home_page() throws Throwable {
	// Locate Chrome driver
	   System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
	// Instantiate the ChromeDriver(Import Chrome driver)
	   driver = new ChromeDriver();  
			
	// Maximize window
	   driver.manage().window().maximize();	
	   
	// open URL
	   driver.get("http://facebook.com");	
		
	}

	@When("^User enters email address in email field$")
	public void user_enters_email_address_in_email_field() throws Throwable {
		Facebook_POM facebook = new Facebook_POM(driver);	
		facebook.entryemail().sendKeys("dolli.aktr@gmail.com");
	}

	@When("^User enters password into the password field$")
	public void user_enters_password_into_the_password_field() throws Throwable {
		Facebook_POM facebook = new Facebook_POM(driver);
		facebook.entrypassword().sendKeys("catDog7");
	}

	@When("^User clicks on Login Button$")
	public void user_clicks_on_Login_Button() throws Throwable {
	Facebook_POM facebook = new Facebook_POM(driver);	 
	facebook.gologin().click();	
		
	}

	@Then("^User will be redirected to the profile page\\.$")
	public void user_will_be_redirected_to_the_profile_page() throws Throwable {
	   
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
