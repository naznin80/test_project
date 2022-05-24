package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class Bestbuy_POM {
 
 
 WebDriver driver;	
 public Bestbuy_POM(WebDriver driver) {
 this.driver=driver;
 PageFactory.initElements(driver, this);
 }

 //Bestbuy home page Search field top page of the page
 @FindBy(xpath="//*[@id=\"gh-search-input\"]")
 WebElement Search_Field_homepage;
 public WebElement search_field() {
 return Search_Field_homepage;
 }
 
 //When User types Laptop
  @FindBy(xpath="//*[@id=\"gh-search-input\"]")
  WebElement types ;
  public WebElement desktop() {
  return types;
 
  }
 
  //User clicks on the search button
    @FindBy(xpath="//*[@id=\"shop-header-95197515\"]/div/div[1]/header/div[1]/div/div[1]/div/form/button[2]")
	WebElement Searchbutton;
	public WebElement Searchicon (){
	return Searchbutton;
	}
 
 
 
 
 
 
 
 
 
	
}

