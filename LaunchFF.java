package TestNGPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LaunchFF {
	
	//String driverPath = "d:\\selenium\\drivers";
	public WebDriver driver;
	
	@Test(priority = 0)
	public void launchBrowser() {
		System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.gecko.driver", "d:\\selenium\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test(priority = 1)
	public void openApplication() {
		driver.navigate().to("http://www.stockcharts.com");
	}
	
	@AfterTest
	public void terminateBrowser() throws IOException{
	driver.quit();
    
		}}
	
