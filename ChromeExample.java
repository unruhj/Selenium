import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://stockcharts.com");
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath(".//*[@id='search123-formtext']")).sendKeys("GDX");
		driver.findElement(By.xpath(".//*[@id='search123-formbutton']")).click();
		Thread.sleep(1000);
		WebElement address=driver.findElement(By.xpath(".//*[@id='dataRange']"));
		Select a=new Select(address);
		a.selectByIndex(4);
		driver.findElement(By.xpath(".//*[@id='dataLog']")).click();
		driver.findElement(By.xpath(".//*[@id='section2Long']/div[8]/span[3]/label")).click();
		WebElement address1=driver.findElement(By.xpath(".//*[@id='chartSize']"));
		Select b=new Select(address1);
		b.selectByIndex(8);
		driver.findElement(By.xpath(".//*[@id='section2Long']/span[7]/input")).click();
		
				
		
		Thread.sleep(5000);
		
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("c:\\users\\john\\desktop\file.png"));
		{
			
		
		driver.close();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    driver.quit();
		
		}}}
			
	
