package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by leahgarber on 10/31/16.
 */
public class SearchPage extends BasePage {
    @FindBy(id = "sliiider-toggle")
    private WebElement hamburgerMenuButton;

    @FindBy(id = "search_price_total_from")
    private WebElement budgetMinField;

    @FindBy(id = "search_price_total_to")
    private WebElement budgetMaxField;

    @FindBy(id = "search_size_from")
    private WebElement caratMinField;

    @FindBy(id = "search_size_to")
    private WebElement caratMaxField;

    @FindBy(id = "cert_number")
    private WebElement certNumberField;

    @FindBy(id = "new_search_button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"search_form\"]/div/div[1]/div[12]/div/div[2]/div/ul/li[2]/a/span[2]")
    private WebElement supplierButton;

    @FindBy(id = "supplier_auto_complete")
    private WebElement supplierField;

    public WebElement getHamburgerMenuButton() {
        return hamburgerMenuButton;
    }

    public WebElement getBudgetMinField() {
        return budgetMinField;
    }

    public WebElement getBudgetMaxField() {
        return budgetMaxField;
    }

    public WebElement getCaratMinField() {
        return caratMinField;
    }

    public WebElement getCaratMaxField() {
        return caratMaxField;
    }

    public WebElement getCertNumberField() {
        return certNumberField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSupplierButton() {
        return supplierButton;
    }

    public WebElement getSupplierField() {
        return supplierField;
    }


    public void supplierSearch() {
        supplierButton.click();
        supplierField.sendKeys("Leah Company 2");
        selectOptionWithText("Leah Company 2");
        searchButton.click();
    }

    public void selectOptionWithText(String textToSelect) {
        try {
            WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
            wait.until(ExpectedConditions.visibilityOf(autoOptions));

            List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
            for(WebElement option : optionsToSelect){
                if(option.getText().equals(textToSelect)) {
                    System.out.println("Trying to select: "+textToSelect);
                    option.click();
                    break;
                }
            }

        } catch (NoSuchElementException e) {
            System.out.println(e.getStackTrace());
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
