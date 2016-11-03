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
 * Created by leahgarber on 11/3/16.
 */
public class DefaultSearchTest extends ApplitoolsBaseTest {

    @Test
    public void DefaultSearchTest() {
         /* confirm you are on search page */
        wait.until(ExpectedConditions.visibilityOf(searchPage.getSearchButton()));
        eyes.checkWindow("Search Page");

        /* run default search method from the Search Page. Check results on results page */
        searchPage.defaultSearch();
        /* wait.until(ExpectedConditions.visibilityOf( )); */
        eyes.checkWindow("Default search results");
    }

}
