package StefDef;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PageObjectModel.Dell_Mouse_POM;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell_Mouse_Hover {
	
WebDriver driver;
	
	@When("^user goes to dell home page$")
	public void user_goes_to_dell_home_page() throws Throwable {
		
		// Locate Chrome driver using key and value
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				
				// Instantiate the ChromeDriver(Import Chrome driver)
				driver = new ChromeDriver(); 
				
				// Maximize window
				driver.manage().window().maximize();
				
				// open URL
				driver.get("https://Dell.com");	
	}

	@When("^user moves mouse over products menu item$")
	public void user_moves_mouse_over_products_menu_item() throws Throwable {
	Dell_Mouse_POM dell = new Dell_Mouse_POM(driver);
	Actions act_obj = new Actions(driver);
	act_obj.moveToElement(dell.menu_item_products()).perform();
	
	 /*@When("^user go to Solutions dropdown menu and able to see View All Solutions$")
	 public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_Solutions() throws Throwable {
	  Actions act =new Actions (driver);
	  DellActionPOM  obj =new DellActionPOM (driver);
	  //act.moveToElement(obj.Solutions()).build().perform();
	  act.moveToElement(obj.Solutions()).build().perform();
	  obj.AllSolutions().click();
	  WebDriverWait wait=new WebDriverWait(dr
	*/

    //dell.menu_item_products().click();	
	}

	@When("^user clicks on Workstations$")
	public void user_clicks_on_Workstations() throws Throwable {
	Dell_Mouse_POM dell = new Dell_Mouse_POM(driver);  
	dell.submenu_item_products().click();
	}

	@Then("^user will be redirected to the Precision Workstations page\\.$")
	public void user_will_be_redirected_to_the_Precision_Workstations_page() throws Throwable {
	 
	}
	
	
	}
