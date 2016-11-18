import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Learning\\ChromeDriver\\chromedriver.exe");

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in");
		//Actions abc=new Actions(driver);
		System.out.println("Actions");
		driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[2]/div"));
		System.out.println("100");
		
		//abc.moveToElement(element).build().perform();
		System.out.println("200");
		
		driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("Catnip");
		System.out.println("300");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		
		
		System.out.println("400");		
		//abc.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("small letters").build().perform();
		System.out.println("500");
		//abc.contextClick(xyz).build().perform();
		System.out.println("600");
	
		
	    		
		driver.close();
		  try {
		  		Thread.sleep(10000);
		  	} catch (InterruptedException e) {
		  		e.printStackTrace();
		  	}
		  //Runtime.getRuntime().exec("taskkill /F /IM firefox.exe");
		  //Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe");
		  //Thread.sleep(5000);
		  //Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
		  //Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");
		  driver.quit();
	    
        }
  	}
	


