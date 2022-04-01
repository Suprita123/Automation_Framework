package Selenium_Classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClassDev {

        protected WebDriver driver;
        // initialising outside the class so that we can import the program anywhere, adding protected so any
        // package can access this

        String browser = "Chrome";

        @BeforeClass

        public void setup() {
            if (browser.equalsIgnoreCase("Chrome")) {

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                System.out.println(" Executing on Chrome browser");

            } else if (browser.equalsIgnoreCase("Firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                System.out.println("Execution is on Firefox");
            }
            driver.manage().window().maximize();
        }


        @AfterClass

        public void teardown() throws InterruptedException {
            Thread.sleep(5000);
            driver.quit();
        }
    }


