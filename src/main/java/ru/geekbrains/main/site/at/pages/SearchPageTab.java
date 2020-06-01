package ru.geekbrains.main.site.at.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



public class SearchPageTab extends BasePage{

    @FindBy(css = "ul.search-page-tabs")
    private WebElement searchTab;

    @FindBy(css = ".container > .search-page-tabs > .nav-tabs-item:nth-child(2) span")
    private WebElement resultProfessionsTab;

    @FindBy(css = ".container > .search-page-tabs > .nav-tabs-item:nth-child(3) span")
    private WebElement resultCourseTab;

    @FindBy(css = ".container > .search-page-tabs > .nav-tabs-item:nth-child(4) span")
    private WebElement resultVebinarTab;

    @FindBy(css = ".container > .search-page-tabs > .nav-tabs-item:nth-child(5) span")
    private WebElement resultBlogTab;

    @FindBy(css = ".container > .search-page-tabs > .nav-tabs-item:nth-child(6) span")
    private WebElement resultForumTab;

    @FindBy(css = ".container > .search-page-tabs > .nav-tabs-item:nth-child(7) span")
    private WebElement resultTestTab;

    @FindBy(css = "ul.search-page-tabs")
    private WebElement searchTabHeader;

    public SearchPageTab(WebDriver driver) {
        super(driver);
    }


    public Page shouldBeCorrectResult (String selector) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated((By) searchTabHeader));


        switch (selector) {
            case "Профессии": {
                int result = Integer.parseInt(resultProfessionsTab.getText());
                assertThat(result, lessThanOrEqualTo(2));
                break;
            }
            case "Курсы": {
                int result = Integer.parseInt(resultCourseTab.getText());
                assertThat(result, greaterThan(15));
                break;
            }
            case "Вебинары": {
                int result = Integer.parseInt(resultVebinarTab.getText());
                assertThat(result, allOf(
                        greaterThan(180),
                        lessThan(300)
                ));
                break;
            }
            case "Блоги": {
                int result = Integer.parseInt(resultBlogTab.getText());
                assertThat(result, greaterThan(300));
                break;
            }
            case "Форумы": {
                int result = Integer.parseInt(resultBlogTab.getText());
                assertThat(result, not(equalTo(350)));
                break;
            }
            case "Тесты": {
                int result = Integer.parseInt(resultBlogTab.getText());
                assertThat(result, not(equalTo(0)));
                break;
            }
            default: {
                throw new NotFoundException("Element " + selector + "not found");
            }
        }
        return new Page(driver);
    }
}