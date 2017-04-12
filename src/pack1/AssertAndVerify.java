package pack1;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AssertAndVerify {
	
	// assert class can be found in testng and there is no verify in testng
	@Test
public void testMethod() {
		// Create a new instance of the Firefox driver
	WebDriver driver = new FirefoxDriver();
	
	// And now use this to visit mentioned page
	driver.get("https://en.wikipedia.org/wiki/Rothschild_family");
	
	// Find the text input element by its name
	String heading= driver.findElement(By.id("firstHeading")).getText();
	
	// assert will stop the execution if it fails.
	Assert.assertEquals(heading, "Rothschild family");
	
	//to close Firefox driver instance
	driver.close();
	}
	
	
}
