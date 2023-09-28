package JenkinsGit.DemoJenkinsGit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoJenkinsGit {
	
	WebDriver driver;
  @Test
  public void JenkinsDemo() {
	  
	  assertEquals("Parikshan", "Dhakal");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
