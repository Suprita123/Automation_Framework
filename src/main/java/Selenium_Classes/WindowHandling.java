package Selenium_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandling extends BaseClassDev{
    @Test
    public void mousehover() throws InterruptedException {
        driver.get("https://canarabank.com/");

        String parentWin = driver.getWindowHandle();
        System.out.println("Parent Page Title "+ driver.getTitle());

        WebElement login =   driver.findElement(By.xpath("//p[text()='LOGIN']"));


        Generic.mouseHover(driver,login);

        driver.findElement(By.xpath("//a[text()='Net Banking - Canara']")).click();

        Set<String> wins =  driver.getWindowHandles();

        for(String w : wins){
            System.out.println("Window ID "+w);
            driver.switchTo().window(w);

        }

        System.out.println("Child Page Title "+ driver.getTitle());

        Thread.sleep(3000);

        driver.close();

        driver.switchTo().window(parentWin);
        System.out.println("Parent Page Title "+ driver.getTitle());


    }
}
