package ru.geekbrains.main.site.at.pages;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CoursesPage extends BasePage{

    @FindBy(css = ".nav > .nav-tabs-item > #prof-link")
    private WebElement professionButton;

    @FindBy(css = ".nav > .nav-tabs-item > #free-link")
    private WebElement freeIntensiveButton;

    @FindBy(css = ".nav > .nav-tabs-item > #cour-link")
    private WebElement coursesButton;

    @FindBy(css = "#filter-0.js-checkbox")
    private WebElement checkBoxFree;

    @FindBy(css = "#filter-9.js-checkbox")
    private WebElement checkBoxQA;

    @FindBy(css = "#cour-new.tab-pane")
    private WebElement resultCollection;

    public CoursesPage(WebDriver driver) {
        super(driver);
    }

    public Page clickButton(String buttonTitle) {
        switch (buttonTitle) {
            case "Профессии": {
                professionButton.click();
                break;
            }
            case "Бесплатные интенсивы": {
                freeIntensiveButton.click();
                break;
            }
            case "Курсы": {
                coursesButton.click();
                break;
            }
            case "Бесплатные": {
                checkBoxFree.click();
                break;
            }
            case "Тестирование": {
                checkBoxQA.click();
                break;
            }
            default:{
                throw new NotFoundException("Element " + buttonTitle + "not found");
            }
        }
        return new Page(driver);
    }

    public Page assertIn(String value) {
        String text = resultCollection.getText();
        assertThat(text, containsString(value));
        return new Page(driver);
    }

}
