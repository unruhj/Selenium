import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class FFScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		//driver.get("http://www.usabit.com/");
		driver.get("http://stockcharts.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath(".//*[@id='search123-formtext']")).sendKeys("GDX");
		driver.findElement(By.xpath(".//*[@id='search123-formbutton']")).click();
		Thread.sleep(5000);
		WebElement address=driver.findElement(By.id("dataRange"));
		Select a=new Select(address);
		a.selectByIndex(4);
		driver.findElement(By.xpath(".//*[@id='dataLog']")).click();
		driver.findElement(By.xpath(".//*[@id='priceLabels']")).click();
		//Thread.sleep(2000);
		WebElement address1=driver.findElement(By.id("showVolume"));
		Select b=new Select(address1);
		b.selectByIndex(1);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='symbol']")).sendKeys("AG");
		driver.findElement(By.id("submitButton")).click();
				
		Thread.sleep(15000);
		
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("c:\\users\\john\\desktop\\file.png"));
		  System.out.print("Screenshot is captured and stored in your D: Drive");
		
			
		    /*File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    File dest= new File("c:\\users\\john\\desktop\\file.png");
		    FileUtils.copyFile(scr, dest);
		    Thread.sleep(3000); */
		
			
			
			
			
		/*File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\users\\john\\desktop\\file1.png"));*/
		Thread.sleep(5000);
	         		
			driver.close();
			  try {	Thread.sleep(3000);}
			  catch (InterruptedException e) {e.printStackTrace();}
			  Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
			  try {Thread.sleep(1000);}
			  catch (InterruptedException e) {e.printStackTrace();}
			  Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");
			  driver.quit();
		}

	private static String timestamp() {
		// TODO Auto-generated method stub
		return null;
	}}


