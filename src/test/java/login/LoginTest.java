package login;

import base.ApplitoolsBaseTest;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import util.factory.DriverFactory;

/**
 * Created by matthewfinnegan on 10/29/15.
 */
public class LoginTest extends ApplitoolsBaseTest {

    @Test(dataProvider = "capabilities")
    public void LoginTest(RemoteWebDriver driver) {
        setUp(driver);
        wait.until(ExpectedConditions.visibilityOf(loginPage.getSigninButton()));
        eyes.checkWindow("VDB Login Page");
        loginPage.login();
        eyes.checkWindow("VDB Main Search Page");
    }

}
