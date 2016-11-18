

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryTours {

    public static void main(String[] args) throws IOException {
    	System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Drivers\\geckodriver.exe");
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://newtours.demoaut.com";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Firefox
        driver.close();
		  try {	Thread.sleep(3000);}
		  catch (InterruptedException e) {e.printStackTrace();}
		  Runtime.getRuntime().exec("taskkill /F /IM plugin-container.exe");
		  try {Thread.sleep(1000);}
		  catch (InterruptedException e) {e.printStackTrace();}
		  Runtime.getRuntime().exec("taskkill /F /IM WerFault.exe");
		  driver.quit();
       
        // exit the program explicitly
        System.exit(0);
    }

}