package login;

import base.BaseTest;
import com.applitools.eyes.Eyes;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.TermsAndConditionsPage;

/**
 * Created by matthewfinnegan on 10/29/15.
 */
public class LoginTest extends BaseTest {

    private Eyes eyes;

    @Before
    public void SetUp() throws Exception {
        eyes = eyesProvider.openEyes("VDB Web", "Login Test");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void LoginTest() {
        wait.until(ExpectedConditions.visibilityOf(loginPage.getSigninButton()));
        TermsAndConditionsPage termsAndConditionsPage = loginPage.login();
        eyes.checkWindow("Terms & Conditions Page");
        termsAndConditionsPage.getAcceptTermsButton().click();
        eyes.checkWindow("VDB Main Search Page");
    }

}
