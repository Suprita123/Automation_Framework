package Selenium_Classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWait extends BaseClassDev{
    @Test
    public void explicitwait() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();

        alert.accept();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        Generic.dismissAlert(driver);

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        String msg = "Hello All";

        Generic.acceptAlert(driver,msg);


        String result = driver.findElement(By.id("result")).getText();

        System.out.println(result);

        Assert.assertEquals(result,"You entered: "+msg," Message is not match");



    }
}
