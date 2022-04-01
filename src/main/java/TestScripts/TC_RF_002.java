package TestScripts;

import Pages.BasePage;
import Pages.HomePage;
import Pages.RegistrationPage;
import org.testng.annotations.Test;

/**
 * Author: Suprita
 *TC_RF_001: Validate Registering an Account by providing only the Mandatory fields
 */

public class TC_RF_002 extends BaseTest {
    @Test
    public void TC_RF_001(){
        String fn = BasePage.firstname(), ln=BasePage.laststname(),em=BasePage.email(),phn=BasePage.phoneno(),
                pw=BasePage.password(),cp=BasePage.password();

        HomePage hp = new HomePage(driver);
        hp.navigatetoregisterpage();
        RegistrationPage rp = new RegistrationPage(driver);{
            rp.enterMandatoryFields(fn,ln,em, phn,pw,cp);
            rp.validatesuccesfulreg();

        }


    }
}
