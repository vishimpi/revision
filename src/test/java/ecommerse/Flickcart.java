package ecommerse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flickcart {
  @Test
  public void flipcartTest() 
  
  {
	  Reporter.log("Opening flipcart", true);
 WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  driver.quit();
  }
}
