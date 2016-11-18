//package seleniumPrograms;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
public class ToolsQA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "d:\\selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com");

		Thread.sleep(5000);
		driver.quit();
	}
}