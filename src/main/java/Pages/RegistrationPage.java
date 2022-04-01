package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {super(driver);}

    @FindBy(id = "input-firstname")
    WebElement firstnameTextfield;

    @FindBy(id = "input-lastname")
    WebElement lastnameTextfield;

    @FindBy(id = "input-email")
    WebElement emailTextfield;

    @FindBy(id = "input-telephone")
    WebElement telephoneTextfield;

    @FindBy(id = "input-password")
    WebElement passwordTextfield;

    @FindBy(id = "input-confirm")
    WebElement confirmpasswordTextfield;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement checkboxagree;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continuebutton;

    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement accountcreation;

    @FindBy(xpath ="//*[contains(text(),'Warning: E-Mail Address is already registered!')]" )
    WebElement accountCreatedFailMsg;

    //Business Logics
    Map<String,String> reg;


    public void enterMandatoryFields(String name,String lastname,String email,String telephone,
                                     String password, String confirmpassword){
        firstnameTextfield.sendKeys(name);
        lastnameTextfield.sendKeys(lastname);
        emailTextfield.sendKeys(email);
        telephoneTextfield.sendKeys(telephone);
        passwordTextfield.sendKeys(password);
        confirmpasswordTextfield.sendKeys(password);
        checkboxagree.click();
        BasePage.takescreenshot(driver);
        continuebutton.click();

    }
    public void validatesuccesfulreg() {
        assertTitle(accountcreation, "Your Account Has Been Created!");
    }


        public void validateFailedReg(){
            BasePage.takescreenshot(driver);
            assertTitle(accountCreatedFailMsg, "Warning: E-Mail Address is already registered!");


        }
    }







