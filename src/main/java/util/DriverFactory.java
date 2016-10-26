package util;

import enums.URLS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.concurrent.TimeUnit;

/**
 * The methods described here will be used to set up either local or remote drivers
 */
public class DriverFactory {

    public RemoteWebDriver driver;

    public WebDriver localFireFoxDriver() {
        driver = new FirefoxDriver();
        // This timeout lets the driver have time to 'poll' the webpage's content to wait for something to appear,
        // otherwise it might look too soon and cause an false test failure
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // We normally wouldn't do this, but since we know this code is currently only for VDB, we can always go straight
        // to the login page on stage for now
        driver.get(URLS.BASE_STAGING.getString());
        return driver;
    }

    public RemoteWebDriver remoteFireFoxDriver() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "53.0");
        // This will need to be replaced by something that either dynamically sets the test name PRIOR or AFTER
        // test execution. After may be easier, in my experience - Matt F
        caps.setCapability("name", "Login Test Demo");
        driver = new RemoteWebDriver(new URL("http://hfc-vdb:1c9f6abc-9cfc-43ed-a654-50eea9fbd8ce@ondemand.saucelabs.com:80/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // We normally wouldn't do this, but since we know this code is currently only for VDB, we can always go straight
        // to the login page on stage for now
        return driver;
    }
}