package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import models.*;
/**
 * Created by leahgarber on 10/17/16.
 */
public class SignUpPage extends BasePage{

    @FindBy(id = "web_user_name")
    private WebElement nameField;

    @FindBy(id = "web_user_company_name")
    private WebElement companyField;

    @FindBy(id = "web_user_phone_number")
    private WebElement phoneNumberField;

    @FindBy(id = "web_user_street_address")
    private WebElement streetAddressField;

    @FindBy(id = "web_user_city")
    private WebElement cityField;

    @FindBy(id = "web_user_country")
    private WebElement countryField;

    @FindBy(id = "web_user_email")
    private WebElement emailField;

    @FindBy(id = "web_user_email_confirmation")
    private WebElement emailConfirmationField;

    @FindBy(id = "web_user_password")
    private WebElement passwordField;

    @FindBy(id = "web_user_password_confirmation")
    private WebElement passwordConfirmationField;

    @FindBy(name = "commit")
    private WebElement signUpButton;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /* Getters for all input fields */
    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getCompanyField() {
        return companyField;
    }

    public WebElement getPhoneNumberField() {
        return phoneNumberField;
    }

    public WebElement getStreetAddressField() {
        return streetAddressField;
    }

    public WebElement getCityField() {
        return cityField;
    }

    public WebElement getCountryField() {
        return countryField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getEmailConfirmationField() {
        return emailConfirmationField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getPasswordConfirmationField() {
        return passwordConfirmationField;
    }

    public WebElement getSignUpButton() {
        return signUpButton;
    }

    public void sign_up(User user) {
        nameField.sendKeys(user.name);
        companyField.sendKeys(user.company);
        phoneNumberField.sendKeys(user.phone_number);
        streetAddressField.sendKeys(user.street_address);
        cityField.sendKeys(user.city);
        countryField.sendKeys(user.country);

        emailField.sendKeys(user.email);
        emailConfirmationField.sendKeys(user.email_confirmation);

        passwordField.sendKeys(user.password);
        passwordField.sendKeys(user.password_confirmation);

        signUpButton.click();

        return;
    }

}
