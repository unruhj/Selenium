import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAllLinks {

    public static void main(String[] args) throws IOException {
    	System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
        String baseUrl = "http://newtours.demoaut.com/";
        WebDriver driver = new FirefoxDriver();
        String underConsTitle = "Under Construction: Mercury Tours";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(baseUrl);
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int i = 0;

        //extract the link texts of each link element
        for (WebElement e : linkElements) {
            linkTexts[i] = e.getText();
            i++;
        }

        //test each link
        for (String t : linkTexts) {
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(underConsTitle)) {
                System.out.println("\"" + t + "\""
                        + " is under construction.");
            } else {
                System.out.println("\"" + t + "\""
                        + " is working.");
            }
            driver.navigate().back();
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