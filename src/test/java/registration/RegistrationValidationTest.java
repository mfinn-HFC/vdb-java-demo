package registration;

import base.ApplitoolsBaseTest;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.SignUpPage;

/**
 * Created by leahgarber on 10/18/16.
 */
public class RegistrationValidationTest extends ApplitoolsBaseTest {

    @Test
    public void RegistrationValidationTest() {
        wait.until(ExpectedConditions.visibilityOf(loginPage.getSignupButton()));
        loginPage.getSignupButton().click();

        //now should be on signup page
        SignUpPage signupPage = new SignUpPage(driver);
        wait.until(ExpectedConditions.visibilityOf(signupPage.getSignUpButton()));
        eyes.checkWindow("VDB Registration Page");

        //click sign up button without any fields filled in
        signupPage.getSignUpButton().click();
        eyes.checkWindow("VDB Registration Page with Validations");
    }

}
