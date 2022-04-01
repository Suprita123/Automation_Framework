package Pages;

//import com.aventstack.extentreports.util.Assert;
import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Properties;

public class BasePage {

    protected static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void readtext(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String x = "";
            while ((x = br.readLine()) != null) {
                System.out.println(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getvalue(String key) {
        String path = System.getProperty("user.dir") + File.separator + "Config.properties";
        String value = null;
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream(path));
            value = prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }


    public static void setValue(String key, String value, boolean append) {

        String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "config.properties";
        try {
            FileOutputStream fos = new FileOutputStream(new File(path), append);
            Properties prop = new Properties();
            prop.setProperty(key, value);
            prop.store(fos, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForElement(long milliseconds) {

        try {
            Thread.sleep(milliseconds);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mousehover(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }

    public static void click(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }

    public static void rightclick(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }

    public static void dragndrop(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }

    public static void doubleclick(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.moveToElement(element).build().perform();
    }

    public static void acceptalert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        System.out.println("Title: " + alert);
        alert.accept();
    }

    public static void dismissalert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        System.out.println("Title: " + alert);
        alert.accept();
    }

    public static void acceptalert(WebDriver driver, String text) {
        Alert alert = driver.switchTo().alert();
        System.out.println("Title: " + alert);
        alert.sendKeys(text);
        alert.accept();
    }

    public static void dismissalert(WebDriver driver, String text) {
        Alert alert = driver.switchTo().alert();
        System.out.println("Title: " + alert);
        alert.sendKeys(text);
        alert.accept();
    }

    public static void scroll(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", element);
        js.executeScript("arguments[0].setAttribute('style', ' border: 2px solid red;')", element);

    }

    public static String currentdatetime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("DD:MM:YYYY HH:mm:ss");
        String formateDateTime = now.format(df);
        return formateDateTime.replace("-", "_").replace(":", "_").replace(" ", ":");

    }

    public static void takescreenshot(WebDriver driver) {
        try {
            TakesScreenshot scrnshot = (TakesScreenshot) BasePage.driver;
            File srcfile = scrnshot.getScreenshotAs(OutputType.FILE);
            File destfile = new File("./screen" + currentdatetime() + ".png");
            FileUtils.copyFile(srcfile, destfile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void assertTitle(WebElement element, String exceptedText) {
        String actual = element.getText();
        Assert.assertEquals(actual, exceptedText, "Title not match");
    }

    public static void assertIcon(WebElement element) {
        Assert.assertTrue(element.isDisplayed(), "Icon is not displayed");
    }

    public static void assertCheckBoxTrue(WebElement element) {
        Assert.assertTrue(element.isSelected(), "Checkbox is not selected");
    }

    public static void assertCheckBoxFalse(WebElement element) {
        Assert.assertFalse(element.isSelected(), "Checkbox is selected");
    }

    public static void assertTitle(WebDriver driver, String exceptedText) {
        Assert.assertEquals(driver.getTitle(), exceptedText, "User is on wrong page");
    }

    //Java Faker
    public static String firstname() {
        Faker faker = new Faker(new Locale("en-IND"));
        String fn = faker.name().firstName();
        System.out.println(fn);
        return fn;

    }

    public static String laststname() {
        Faker faker = new Faker(new Locale("en-IND"));
        String ln = faker.name().lastName();
        System.out.println(ln);
        return ln;
    }

    public static String email() {
        Faker faker = new Faker(new Locale("en-IND"));
        String email = faker.name().firstName().replace(".", "")
                .replace(" ", "") + "@test.com";
        System.out.println(email);
        return email;
    }

    public static String phoneno(){
        Faker faker = new Faker(new Locale("en-IND"));
        String phoneno = faker.number().digits(10);
        System.out.println(phoneno);
        return phoneno;

    }
    public static String password(){
        return "password@123";
    }
}

















