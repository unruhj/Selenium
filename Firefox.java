
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;






public class Firefox {

	public static void main(String[] args) throws InterruptedException, IOException {
		
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://stockcharts.com/");
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath(".//*[@id='search123-formtext']")).sendKeys("GDX");
		driver.findElement(By.xpath(".//*[@id='search123-formbutton']")).click();
		Thread.sleep(8000);
		WebElement address=driver.findElement(By.xpath(".//*[@id='dataRange']"));
		Select a=new Select(address);
		a.selectByIndex(4);
		driver.findElement(By.xpath(".//*[@id='dataLog']")).click();
		driver.findElement(By.xpath(".//*[@id='section2Long']/div[8]/span[3]/label")).click();
		driver.findElement(By.xpath(".//*[@id='section2Long']/span[7]/input")).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("c:\\users\\john\\desktop\file.png"));
		Thread.sleep(5000);{
		
	         		
			driver.close();
			  try {	Thread.sleep(3000);}
			  catch (InterruptedException e) {e.printStackTrace();}
			  Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
			  try {Thread.sleep(1000);}
			  catch (InterruptedException e) {e.printStackTrace();}
			  Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");
			  driver.quit();
		}}}


