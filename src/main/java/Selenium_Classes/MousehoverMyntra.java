package Selenium_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MousehoverMyntra extends BaseClassDev{

    @Test
    public void mousehover() throws InterruptedException {
        driver.get("https://www.myntra.com/");

        WebElement women =   driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
        WebElement jacket = driver.findElement(By.xpath("(//a[text()='Jackets & Coats'])[1]"));

        Generic.mouseHover(driver,women);
        Thread.sleep(3000);
        Generic.click(driver,jacket);

//
//     Actions act = new Actions(driver);
//     act.moveToElement(women).build().perform();
//     Thread.sleep(3000);
//     act.click(jacket).build().perform();

        // jacket.click();

    }
}
