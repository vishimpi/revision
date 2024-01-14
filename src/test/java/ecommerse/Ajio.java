package ecommerse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajioTest() 
  {
	  Reporter.log("Opening Ajio", true);
	  WebDriver driver = new ChromeDriver();
	 	  
	 	  driver.get("https://www.ajio.com/");
	 	  
	 	  driver.quit();
  }
}
