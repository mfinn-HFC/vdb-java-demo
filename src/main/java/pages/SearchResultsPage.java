package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by leahgarber on 11/4/16.
 */
public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "/html/body/nav/div/div/span")
    private WebElement searchResultsHeaderText;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getSearchResultsHeaderText() {
        return searchResultsHeaderText;
    }
}
