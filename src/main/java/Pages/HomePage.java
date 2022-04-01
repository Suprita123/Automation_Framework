package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {super(driver);}

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myaccountmenu;

    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerbutton;

    @FindBy(xpath = "//a[text()='Login']")
    WebElement loginbutton;

    public void navigatetoregisterpage(){
        BasePage.assertTitle(driver,"Your Store");
        myaccountmenu.click();
        registerbutton.click();
        BasePage.assertTitle(driver,"Register Account");
    }

    public void navigatetologinpage(){
        BasePage.assertTitle(driver,"Your Store");
        myaccountmenu.click();
        loginbutton.click();
        BasePage.assertTitle(driver,"Account Login");

    }
}
