import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HDFC {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\ChromeDriver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--test-type");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		Thread.sleep(11000);
		a.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/ul/li[4]/div[1]/span"))).build().perform();
		Thread.sleep(3000);
		a.moveToElement(driver.findElement(By.cssSelector("a[href*=goldloan]"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href*=goldloan]")).click(); 
		Thread.sleep(2000);
		
		
		
			driver.close();
			  try {
			  		Thread.sleep(5000);
			  	} catch (InterruptedException e) {
			  		e.printStackTrace();
			  	}
				  driver.quit();
		    
	        }
	}