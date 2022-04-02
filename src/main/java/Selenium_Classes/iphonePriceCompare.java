package Selenium_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class iphonePriceCompare<Amazonprice, Aprice, Fprice> extends BaseClassDev {

    @Test(priority = 1)

    public void byID() {
        driver.get("https://www.amazon.in");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone XR (128GB) - Coral", Keys.ENTER);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Generic.waitForElement(2000);
        //List<WebElement> li = driver.findElements(By.className("a-size-medium a-color-base a-text-normal"));
        List<WebElement> li = driver.findElements(By.cssSelector(".a-size-medium.a-color-base.a-text-normal"));
        //System.out.println("Total no. of products: "+li.size());

        String Amazonprice = null;
        int Aprice = 0;
        for (WebElement element : li) {
            String txt = element.getText();
            //System.out.println(txt);
            if
            (element.getText().equalsIgnoreCase("iphone XR (128GB) - Coral")) {
                Amazonprice = driver.findElement(By.className("a-price-whole")).getText();
                String replaceprice = Amazonprice.replace(",", "");
                Aprice = Integer.parseInt(Amazonprice);
                System.out.println("Amazon Price of Iphone XR (128GB) coral: " + Amazonprice);
                //System.out.println(("Price on Amazon:" +Aprice));
                break;
            } else {
                //System.out.println("Product doesn't match");
            }
        }

        driver.get("https://www.flipkart.com/");
        //WebElement closebutton =driver.findElement(By.xpath("//button[text()='✕']"));
        driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
        driver.findElement(By.name("q")).sendKeys("iphone XR (128GB)-Coral", Keys.ENTER);
        driver.findElement(By.className("_34RNph")).click();
        Generic.waitForElement(3000);

        List<WebElement> fli = driver.findElements(By.className("_4rR01T"));
        Generic.waitForElement(3000);

        String Flipkartprice = null;
        int Fprice = 0;
        for (WebElement element : fli) {
            String txt = element.getText();
            //System.out.println(txt);
            if (element.getText().equalsIgnoreCase("iphone XR (128GB)-Coral")) {
                ;
                Flipkartprice = driver.findElement(By.cssSelector("._30jeq3._1_WHN1")).getText().replace("₹", "").replace(",", "");
                // Flipkartprice = driver.findElement(By.xpath("//div[@class='_30jeq3']")).getText();
                Fprice = Integer.parseInt(Flipkartprice);
                System.out.println("Flipkart price of Iphone XR (128GB) Coral: " + Flipkartprice);
                // System.out.println("Flipkart price : " + Fprice);
                break;
            } else {
                // System.out.println("Product not match");
            }

        }
        if (Aprice > Fprice) {
            System.out.println("Price of phone in Flipkart is less ");
        } else {
            System.out.println("Price of phone in Amazon is less ");
        }
    }
}

