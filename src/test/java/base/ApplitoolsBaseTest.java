package base;

import com.applitools.eyes.Eyes;
import enums.URLS;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import util.DriverFactory;
import util.EyesProvider;

import java.net.MalformedURLException;

/**
 * Created by matt-hfc on 10/13/16.
 * This is a base class for all tests that are expected to use Applitools Eyes
 */
public class ApplitoolsBaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected SearchPage searchPage;
    protected SearchResultsPage searchResultsPage;
    protected WebDriverWait wait;
    protected JavascriptExecutor jse;
    protected EyesProvider eyesProvider;
    protected Eyes eyes;

    public ApplitoolsBaseTest() {
        // In the constructor, we activate the driver so we have a browser, then we can create our LoginPage, which needs
        // an active driver to be created
        try {
            driver = new DriverFactory().remoteFireFoxDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        wait = new WebDriverWait(driver, 30);
        eyesProvider = new EyesProvider(driver);
        jse = ( (JavascriptExecutor) driver);
        loginPage = new LoginPage(driver);
        searchPage = new SearchPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @Before
    public void SetUp() throws Exception {
        eyes = eyesProvider.openEyes("VDB Web", "Login Test");
        driver.get(URLS.BASE_STAGING.getString());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        eyes.close();
    }
}
