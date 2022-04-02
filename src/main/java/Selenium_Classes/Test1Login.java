package Selenium_Classes;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1Login extends BaseClassDev{
    @Test
    public void testlogin(){
        System.out.println("********Test Execution Started*******");
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        //driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
        Generic.waitForElement(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        System.out.println(("*********Execution Ended******"));



    }
}
