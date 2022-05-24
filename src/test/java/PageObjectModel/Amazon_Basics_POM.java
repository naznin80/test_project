package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Basics_POM {
	
	 WebDriver driver;	
	//Constructor (Special Method)
	 public void Amazon_Basics_POM (WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);	 
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
