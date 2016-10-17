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
public class DriverUtil {

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
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setCapability("platform", "Windows 8");
        caps.setCapability("version", "34.0");
        driver = new RemoteWebDriver(new URL("http://hfc-vdb:1c9f6abc-9cfc-43ed-a654-50eea9fbd8ce@ondemand.saucelabs.com:80/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // We normally wouldn't do this, but since we know this code is currently only for VDB, we can always go straight
        // to the login page on stage for now
        return driver;
    }
}
