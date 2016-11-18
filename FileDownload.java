import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FileDownload {

public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
String baseUrl = "http://messenger.yahoo.com/";
WebDriver driver = new FirefoxDriver();
driver.get(baseUrl);
WebElement downloadButton = driver.findElement(By.id("download-btn"));
String sourceLocation = downloadButton.getAttribute("href");
String wget_command = "cmd /c wget -P D:\\Downloads --no-check-certificate " + sourceLocation;

try {
Process exec = Runtime.getRuntime().exec(wget_command);
System.out.println("1");
int exitVal = exec.waitFor();
System.out.println("2");
System.out.println("Exit value: " + exitVal);
} catch (InterruptedException | IOException ex) {
System.out.println(ex.toString());
System.out.println("3");
Thread.sleep(30000);
}
driver.close();
try {	Thread.sleep(3000);}
catch (InterruptedException e) {e.printStackTrace();}
Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
try {Thread.sleep(1000);}
catch (InterruptedException e) {e.printStackTrace();}
Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");
driver.quit();
System.exit(0);
}
}