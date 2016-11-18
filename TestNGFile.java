package TestNGPackage;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.junit.Assert;

public class TestNGFile {
	public String baseUrl = "http://www.stockcharts.com/";
	public WebDriver driver; // = new FirefoxDriver();
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launching firefox browser"); 
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();}
	
    @Test
    public void verifyHomepageTitle() throws IOException {
	driver.get(baseUrl);
	String expectedTitle = "StockCharts.com | Free Award-Winning Financial Charting Tools";
	String actualTitle = driver.getTitle();
	System.out.println(baseUrl);
	Assert.assertEquals(actualTitle, expectedTitle);
	System.out.println(actualTitle);
	System.out.println(expectedTitle);}
	  
	  @AfterTest
	  public void terminateBrowser() throws IOException{
	  driver.quit();
      
	 
	  
	  
	  
	  
  }
}
