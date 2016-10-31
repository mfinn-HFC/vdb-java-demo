package search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import models.*;
import base.ApplitoolsBaseTest;
import pages.SearchPage;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.SignUpPage;
import util.LoginUtil;
/**
 * Created by leahgarber on 10/31/16.
 */
public class supplierSearchTest extends ApplitoolsBaseTest {

    @Test
    public void supplierSearchTest() {
        /* sign in, get to the search page */

        /* confirm you are on search page */
        SearchPage searchPage = new SearchPage(driver);
        wait.until(ExpectedConditions.visibilityOf(searchPage.getSearchButton()));
        eyes.checkWindow("Search Page");

        /* run supplierSearch method from the Search Page */

    }
}
