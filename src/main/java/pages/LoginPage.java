package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    private final String email = "mfinn@happyfuncorp.com";
    private final String password = "happiness4U";

    @FindBy(id = "web_user_email")
    private WebElement emailField;

    @FindBy(id = "web_user_password")
    private WebElement passwordField;

    @FindBy(name = "commit") // Test
    private WebElement signinButton;

    //there is a problem here
    @FindBy(css = "a[href='/web/users/signUp']" )
    private WebElement signupButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSigninButton() {
        return signinButton;
    }

    public WebElement getSignupButton() {return signupButton; }

    // This method is to log in with the default credentials provided
    public TermsAndConditionsPage login() {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signinButton.click();
        // By return this page, we don't have to add extra lines to 'create' an instance of this page class
        return new TermsAndConditionsPage(driver);
    }

}
