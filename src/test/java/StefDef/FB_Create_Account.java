package StefDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjectModel.FB_Creation_POM;
import PageObjectModel.Facebook_POM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

 public class FB_Create_Account {
	
 WebDriver driver;

 @Given("^user goes to FB create account page$")
 public void user_goes_to_FB_create_account_page() throws Throwable {
 	
 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
 driver = new ChromeDriver();  
 
 driver.manage().window().maximize();	

 driver.get("http://facebook.com/reg");	
 
 }
 
@When("^user enters First name$")
public void user_enters_First_name() throws Throwable {
	// Explicit wait is a local wait, and it only applies to one element
	// We need to specify one single element for each "explicit wait."
	// We need to use built in Class "WebDriverWait"
	// Explicit wait adds additional time after implicit wait.
	
FB_Creation_POM Facebook = new FB_Creation_POM (driver);
Facebook.First_Name_Field().sendKeys("Dolly");
 }

 @When("^user enters Last name$")
 public void user_enters_Last_name() throws Throwable {
 FB_Creation_POM Facebook = new FB_Creation_POM (driver);  
 Facebook.last_name_field().sendKeys("Akter");
 }
 //drop down
 //dropdown1.selectByIndex(1,2,3);
 //dropdown2.selectByVisibleText("July");
 //Select dropdown2 = new Select(Facebook.Birth_Day_Field());
 //dropdown2.selectByValue("5");
 // Types of Select options:
 
 //1. Select by index = 0, 1, 2, 3
 //2. Select by Visible text = Jan, Feb, Mar
 //3. Value = <option value="8">Aug</option>
 //In this example, you can use value 8 for Aug.
    
 /* If the drop-down list is fixed like Months, days, we can use Index or Value, but
 If the data of the drop-down data changes like year, we must use "Visible text"
 		
 Select is a built class in selenium.we have to import 
 Select.And dropdown is name/variable.

 We have to creat object of Select class and indide the()parenthesis
 we have to write method_name.WebElement from (pageobjectmodel)
 
 <a = Link
<ul = Unfied List 
<li = List
<Select = Drop down
<Input = Text box/ Text input	
 */

//Select dropdown1 = new Select(Facebook.Birth_Month_Field());
 // Select is a Hidden class in selenium
 
 @When("^user selects month$")
 public void user_selects_month() throws Throwable {
 FB_Creation_POM Facebook = new FB_Creation_POM (driver);
 Select dropdown1 = new Select(Facebook.Birthday_Month_Field());
 dropdown1.selectByValue("6");
 }
//Select dropdown5 = new Select(Facebook.Birth_Day_Field());
@When("^user selects birthday$")
public void user_selects_birthday() throws Throwable {
FB_Creation_POM Facebook = new FB_Creation_POM (driver);	 
Select dropdown5 = new Select(Facebook.Birth_Day_Field());
dropdown5.selectByValue("15");
}
//Select dropdown3 = new Select(Facebook.BirthDay_Year_Field());
 @When("^user selects year$")
 
 public void user_selects_year() throws Throwable {
 FB_Creation_POM  Facebook = new FB_Creation_POM (driver); 
 Select dropdown3 = new Select(Facebook.Birth_Day_Year_Field());
 dropdown3.selectByValue("2000");
 }
 @When("^clicks on Sign Up$")
 public void clicks_on_Sign_Up() throws Throwable {
 FB_Creation_POM Facebook = new FB_Creation_POM (driver);
 Facebook.Birthday_Month_Field().click();
 }
 @Then("^user account will be created$")
 public void user_account_will_be_created() throws Throwable {
    
 }
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


