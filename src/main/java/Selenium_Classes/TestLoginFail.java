package Selenium_Classes;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestLoginFail extends BaseClassDev{
    @Test
    public void testlogin(){
        System.out.println("********Test Execution Started*******");
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.id("password")).sendKeys("passwordincorrect");

        Generic.waitForElement(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String errormsg = driver.findElement(By.id("flash")).getText();
        System.out.println("Message: "+errormsg);

        SoftAssert sf = new SoftAssert();
        sf.assertEquals(errormsg,"Your username is invalid!\n×","Actual and Expected do not match");

        System.out.println(("*********Execution Ended******"));
        sf.assertAll();



    }
}
