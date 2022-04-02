package Selenium_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragnDrop extends BaseClassDev{
    @Test
    public void DragnDrop (){
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement boxA = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement boxB = driver.findElement(By.xpath("//div[@id='column-b']"));
        //Generic.waitForElement(1000);
        Actions action = new Actions(driver) ;
        action.clickAndHold(boxA).moveToElement(boxB).release(boxB).perform();


        //Generic.dragdrop(driver,boxA,boxB);
        // Generic.rightclick(driver,boxA);


    }
}
