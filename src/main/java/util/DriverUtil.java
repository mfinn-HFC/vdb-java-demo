package util;

import enums.URLS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * The methods described here will be used to set up either local or remote drivers
 */
public class DriverUtil {

    public WebDriver driver;

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

    public WebDriver remoteChromeDriver() throws MalformedURLException {
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "OS X 10.10");
        caps.setCapability("version", "44.0");
        driver = new RemoteWebDriver(new URL("http://mfinn-HFC:40f53ef4-bb29-4dfb-b08f-d405f0350d85@ondemand.saucelabs.com:80/wd/hub"), caps);
        return driver;
    }
}
