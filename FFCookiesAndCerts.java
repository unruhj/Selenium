
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class FFCookiesAndCerts {

	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
		
        FirefoxProfile prof=new FirefoxProfile();
        prof.setAcceptUntrustedCertificates(false);        
		WebDriver driver=new FirefoxDriver();
		driver.get("http://stockcharts.com/");
		Set<Cookie>abc=driver.manage().getCookies();
		System.out.println(abc.size());
		System.out.println(abc.size());
		driver.manage().deleteAllCookies();
		Set<Cookie>abcd=driver.manage().getCookies();
		System.out.println(" Cookies!");
		System.out.println(" Cookies now!");
		
		
		driver.findElement(By.xpath(".//*[@id='search123-formtext']")).sendKeys("GDX");
		driver.findElement(By.xpath(".//*[@id='search123-formbutton']")).click();
		Thread.sleep(5000);
		WebElement address=driver.findElement(By.xpath(".//*[@id='dataRange']"));
		Select a=new Select(address);
		a.selectByIndex(4);
		driver.findElement(By.xpath(".//*[@id='dataLog']")).click();
		driver.findElement(By.xpath(".//*[@id='section2Long']/div[8]/span[3]/label")).click();
		driver.findElement(By.xpath(".//*[@id='section2Long']/span[7]/input")).click();{
			
		
	         		
			driver.close();
			  try {	Thread.sleep(100);}
			  catch (InterruptedException e) {e.printStackTrace();}
			  Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
			  try {Thread.sleep(1000);}
			  catch (InterruptedException e) {e.printStackTrace();}
			  Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");
			  driver.quit();
		}}}


