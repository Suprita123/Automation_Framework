package Selenium_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Set;

public class TripAdvisor extends BaseClassDev{
    @Test
    public void test(){
        driver.get("https://www.tripadvisor.in/");
        Generic.waitForElement(3000);
        driver.findElement(By.xpath("(//input[@name='q'])[2]")).sendKeys("Club Mahindra", Keys.ENTER);
        String parentWin = driver.getWindowHandle();
        String parentWinTitle = driver.getTitle();
        System.out.println("Parent window Tile: " + parentWinTitle);
        Generic.waitForElement(3000);
        driver.findElement(By.xpath("(//div[@class='result-title'])[1]")).click();
        Set<String> wins = driver.getWindowHandles();

        for (String w : wins){
            System.out.println( "Window ID" + w);
            driver.switchTo().window(w);
        }
        String childWin1 = driver.getTitle();
        System.out.println("Child Window 1 Title : "+ childWin1);
        driver.findElement(By.className("badtN")).click();
        Set<String> wins1 = driver.getWindowHandles();

        for (String w : wins1){
            System.out.println( "Window ID" + w);
            driver.switchTo().window(w);
        }
        String childwin2 = driver.getTitle();
        System.out.println("Child Window - 2 Title : "+ childwin2);
        driver.findElement(By.id("bubble_rating")).click(); //gives 3 star rating
        // below code give 5 star rating
        // new Actions(driver).moveToElement(new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("bubble_rating"))),50,0).click().build().perform();
        Generic.waitForElement(3000);
        driver.findElement(By.id("ReviewTitle")).sendKeys("This is a Test Review title");
        driver.findElement(By.id("ReviewText")).sendKeys("This is test review test ......... werwerwer ewjhrjewhrjwehrjwehrjewjhg  jwhejhwergjrhwegjewhrgwe whejrjewhrgewjhgrjwejhjhgjhgjhgfjdhgfjsdh sdjhfgsdjhfgjsdhgfjsdhf sdhfgjsdhgfjdshgfjhds shjdgfjhdgfjhgsdjhfgjsdhgfjsdfjsdhgfjhsdgfdsjhfgdjhfg");
        driver.findElement(By.xpath("//div[@class='c-cell jfy_cloud tag content category-soloTraveler']")).click();
        Select dateDrpdown = new Select(driver.findElement(By.id("trip_date_month_year")));
        dateDrpdown.selectByValue("1,2022");
        driver.findElement(By.id("noFraud")).click();

        Generic.waitForElement(3000);

        driver.close();
        Generic.waitForElement(2000);
        //driver.switchTo().window(childWin1).close();
        //Generic.waitForElement(2000);
        driver.switchTo().window(parentWin);

        System.out.println("Current Active Window title" + driver.getTitle());



    }
}
