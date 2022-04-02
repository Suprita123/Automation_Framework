package Selenium_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxes extends BaseClassDev {

    @Test
    public void checkboxselect1(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Generic.waitForElement(2000);
        WebElement checkbox1 = driver.findElement(By.xpath("(//form/input[@type='checkbox'])[1]"));

        if(checkbox1.isSelected()){
            System.out.println(("Checkbox 1 is already selected"));
            checkbox1.click();
            System.out.println(("Checkbox 1 is uncheckeded"));
        }else{
            checkbox1.click();
            System.out.println(("Checkbox 1 is checkeded"));
        }
        Generic.waitForElement(1000);
        Assert.assertTrue(checkbox1.isSelected());
    }

    @Test
    public void checkboxselect2(){
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Generic.waitForElement(1000);
        WebElement checkbox2 = driver.findElement(By.xpath("(//form/input[@type='checkbox'])[2]"));

        if(checkbox2.isSelected()){
            System.out.println(("Checkbox 2 is already selected"));
            checkbox2.click();
            System.out.println(("Checkbox 2  unchecked"));
        }
        else{
            System.out.println(("Checkbox 2 is checked"));
        }
        Generic.waitForElement(1000);
        //Assert.assertTrue(checkbox2.isSelected());

    }


}
