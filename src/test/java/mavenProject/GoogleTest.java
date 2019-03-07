package mavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleTest {
	WebDriver driver;
  @Test
  public void GoogleLaunchTest() {
	  String expected="Google";
	  String actual = driver.getTitle();
	  Assert.assertEquals(expected, actual);
	  	  
  }
  @BeforeTest
  public void LaunchChromeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaheshVenkataswamy\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void CloseBrowserTest() {
	  //driver.quit();
  }

}
