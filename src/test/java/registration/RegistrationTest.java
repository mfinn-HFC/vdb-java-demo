package registration;

import base.ApplitoolsBaseTest;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.SignUpPage;
import util.LoginUtil;
import models.*;

/**
 * Created by leahgarber on 10/20/16.
 */
public class RegistrationTest extends ApplitoolsBaseTest {

    @Test
    public void RegistrationTest() {

        wait.until(ExpectedConditions.visibilityOf(loginPage.getSignupButton()));
        loginPage.getSignupButton().click();

        //now should be on signup page
        SignUpPage signupPage = new SignUpPage(driver);
        wait.until(ExpectedConditions.visibilityOf(signupPage.getSignUpButton()));
        eyes.checkWindow("VDB Registration Page");

        //sign up with all required fields filled in
        LoginUtil loginutil = new LoginUtil();
        String email = loginutil.generateEmail();
        User new_user = new User("John Snow", "HFC", "80 John St", "9993334242","New York", "USA", email, "Happiness4u");
        signupPage.sign_up(new_user);

        eyes.checkWindow("Thank You page");
    }
}
