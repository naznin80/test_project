package TCTestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunner {
	
	// Import the "CucumberOptions"(Cucumber.api)
	@CucumberOptions (
	       
	       features = {"Features"},
	       glue = {"StepDef"}
	   
	       )
	          // import testng.AbstractTestNGCucumberTests
	 public class TestRunner2 extends AbstractTestNGCucumberTests{}
	  
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
