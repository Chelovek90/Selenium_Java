package ru.geekbrains.main.site.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    private NavigationTab navigationTab;
    private SearchPageTab searchPageTab;

    public Page(WebDriver driver) {
        super(driver);
        navigationTab = new NavigationTab(driver);
        searchPageTab = new SearchPageTab(driver);
    }

    public Page checkHeader(String expected) {
        assertEquals(expected, pageHeader.getText());
        return this;
    }

    public Page searchValue (String value) {
        searchOpenButton.click();
        searchFieldInput.sendKeys(value);
        searchStart.click();
        return this;
    }

    public NavigationTab getNavigationTab() {
        return navigationTab;
    }
    public SearchPageTab getSearchPageTab() {
        return searchPageTab;
    }

}
