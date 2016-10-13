package util;

import com.applitools.eyes.Eyes;
import enums.URLS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * This will provide an active instance of Applitools Eyes for use within tests
 */
public class EyesProvider {

    private WebDriver driver;
    private Eyes eyes;

    public EyesProvider(WebDriver driver) {
        this.driver = driver;
    }

    private Eyes getEyes() {
        return eyes = new Eyes();
    }

    public Eyes openEyes(String appName, String testName) {
        eyes = getEyes();
        eyes.open(driver, appName, testName);
        return eyes;
    }
}
