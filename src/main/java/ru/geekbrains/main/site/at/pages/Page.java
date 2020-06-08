package ru.geekbrains.main.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class Page extends BasePage {

    @FindBy(className = "gb-header__title")
    private WebElement pageHeader;

    @FindBy(css = "#top-menu .show-search-form")
    private WebElement searchButton;

    @FindBy(css = "#top-menu .search-panel__search-field")
    private WebElement searchInput;

    @FindBy(css = "#top-menu .show-search-form")
    private WebElement searchOpenButton;

    @FindBy(css = "#top-menu .search-panel__search-field")
    private WebElement searchFieldInput;

    @FindBy(className = "search-panel__submit")
    private WebElement searchStart;

    @FindBy(css = "ul.search-page-tabs")
    private WebElement searchTabHeader;

    private NavigationTab navigationTab;
    private SearchPageTab searchPageTab;
    private LoginPage loginPage;
    private CoursesPage coursesPage;

    public Page(WebDriver driver) {
        super(driver);
        navigationTab = new NavigationTab(driver);
        searchPageTab = new SearchPageTab(driver);
        loginPage = new LoginPage(driver);
        coursesPage = new CoursesPage(driver);
    }

    @Step("Check {expected} is header on page")
    public Page checkHeader(String expected) {
        assertEquals(expected, pageHeader.getText());
        return this;
    }

    public Page searchValue (String value) {
        searchOpenButton.click();
        searchFieldInput.sendKeys(value);
        searchStart.click();
        WebElement pageLoad = (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("ul.search-page-tabs"))));

        return this;
    }



    public NavigationTab getNavigationTab() {
        return navigationTab;
    }
    public SearchPageTab getSearchPageTab() {
        return searchPageTab;
    }
    public LoginPage getLoginPage() {
        return loginPage;
    }
    public CoursesPage getCoursesPage() {
        return coursesPage;
    }


}
