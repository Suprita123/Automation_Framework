package Selenium_Classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RightClick extends BaseClassDev{
    @Test
    public void contextmenu(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Generic.waitForElement(2000);

        Actions act = new Actions(driver);
        WebElement rk = driver.findElement(By.xpath("//div[@id='hot-spot']"));
        act.contextClick(rk).perform();


        Alert alert = driver.switchTo().alert();
        String alerttext = alert.getText();

        Assert.assertEquals(alerttext,"You selected a context menu");
        Generic.waitForElement(2000);

        alert.accept();
        Generic.waitForElement(2000);

    }
}
