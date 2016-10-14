package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import util.DriverUtil;
import util.EyesProvider;

import java.net.MalformedURLException;

/**
 * Created by matt-hfc on 10/13/16.
 * This is a basic outline that contains variables that all tests will need. So each test should inherit from this class
 */
public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected WebDriverWait wait;
    protected EyesProvider eyesProvider;


    public BaseTest() {
        // In the constructor, we activate the driver so we have a browser, then we can create our LoginPage, which needs
        // an active driver to be created
        try {
            driver = new DriverUtil().remoteFireFoxDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        wait = new WebDriverWait(driver, 30);
        eyesProvider = new EyesProvider(driver);
        loginPage = new LoginPage(driver);
    }
}
