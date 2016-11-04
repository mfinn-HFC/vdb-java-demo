package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * Created by leahgarber on 11/4/16.
 */
public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "/html/body/nav/div/div/span", className = "navbar-page-title")
    private WebElement searchResultsHeaderText;

    public WebElement getSearchResultsHeaderText() {
        return searchResultsHeaderText;
    }
}
