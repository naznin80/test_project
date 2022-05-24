   package PageObjectModel;

   import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

   public class Walmart_Product_POM1 {
	
   WebDriver driver;	
	
    public Walmart_Product_POM1(WebDriver driver) {
    this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[1]/div/span/header/div/form/div/input")
	WebElement product_search_Field;
	public WebElement product_searchfield() {
	return product_search_Field;
	}
}
