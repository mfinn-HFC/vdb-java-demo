package login;

import base.ApplitoolsBaseTest;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by matthewfinnegan on 10/29/15.
 */
public class LoginTest extends ApplitoolsBaseTest {

    @Test
    public void LoginTest() {
        wait.until(ExpectedConditions.visibilityOf(loginPage.getSigninButton()));
        eyes.checkWindow("VDB Login Page");
        loginPage.login();
        eyes.checkWindow("VDB Main Search Page");
    }

}
