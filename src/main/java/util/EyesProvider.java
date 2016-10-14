package util;

import com.applitools.eyes.Eyes;
import org.openqa.selenium.WebDriver;

import java.net.URI;

/**
 * This will provide an active instance of Applitools Eyes for use within tests
 */
public class EyesProvider {

    private WebDriver driver;
    private Eyes eyes;
    // We will need to move this API key. This is bad practice, since we don't want anyone having access to our API Key.
    private String apiKey = "pO97uSsUD6bcG8eFGthg2clPetD6xVsrhxTfrlseCgU110";

    public EyesProvider(WebDriver driver) {
        this.driver = driver;
    }

    private Eyes getEyes() {
        eyes = new Eyes();
        return eyes;
    }

    public Eyes openEyes(String appName, String testName) {
        eyes = getEyes();
        eyes.setApiKey(apiKey);
        eyes.open(driver, appName, testName);
        return eyes;
    }
}
