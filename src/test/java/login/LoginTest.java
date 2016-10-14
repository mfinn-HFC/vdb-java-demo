package login;

import base.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.TermsAndConditionsPage;

/**
 * Created by matthewfinnegan on 10/29/15.
 */
public class LoginTest extends BaseTest {

    @Before
    public void SetUp() throws Exception {
        // We do 'set up' things here, but we don't have much to set up since we have outside classes doing that for us
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void LoginTest() {
        wait.until(ExpectedConditions.visibilityOf(loginPage.getSigninButton()));
        TermsAndConditionsPage termsAndConditionsPage = loginPage.login();


    }

}
