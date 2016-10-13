package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is the terms and conditions page that is present to all users upon login, and should be seen
 * EVERY time a user logs in
 */
public class TermsAndConditionsPage extends BasePage {

    @FindBy(id = "web_user_email")
    WebElement emailField;

    @FindBy(id = "web_user_password")
    WebElement passwordField;

    @FindBy(name = "commit")
    WebElement signinButton;

    public TermsAndConditionsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
