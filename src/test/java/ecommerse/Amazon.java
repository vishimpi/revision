package ecommerse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazonTEst()
  {
	  Reporter.log("opening amazon", true);
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.amazon.in");
	  
	  driver.quit();
	  
  }
}
