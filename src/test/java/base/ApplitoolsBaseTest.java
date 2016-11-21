package base;

import com.applitools.eyes.Eyes;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import enums.URLS;
import model.TestEnvironment;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;
import sun.security.krb5.internal.crypto.Des;
import util.EyesProvider;
import util.factory.CapabilitiesFactory;
import util.factory.DriverFactory;
import util.factory.EnvironmentFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.util.List;

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

    private CapabilitiesFactory capabilitiesFactory = new CapabilitiesFactory();
    private EnvironmentFactory environmentFactory = new EnvironmentFactory();

    // Should return the capabilities that can be used in @before to create driver
    @DataProvider(name = "capabilities")
    public Object[][] setEnvironments() throws FileNotFoundException, IllegalAccessException, NoSuchFieldException, MalformedURLException {
        JsonParser parser = new JsonParser();
        JsonElement jsonElement = parser.parse(new FileReader("/Users/matt-hfc/IdeaProjects/vdb-java-demo/src/test/java/base/webEnvironments.json"));
        List<TestEnvironment> testEnvironmentList = environmentFactory.getTestEnvironmentsFromJSON(jsonElement.getAsJsonObject());
        Object[][] array = DriverFactory.getDrivers(capabilitiesFactory.getCapabilities(testEnvironmentList));
        return array;
    }

    public void setUp(RemoteWebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        eyesProvider = new EyesProvider(driver);
        jse = ( (JavascriptExecutor) driver);
        loginPage = new LoginPage(driver);
        searchPage = new SearchPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        eyes = eyesProvider.openEyes("VDB Web", "Login Test");
        driver.get(URLS.BASE_STAGING.getString());
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
        eyes.close();
    }
}
