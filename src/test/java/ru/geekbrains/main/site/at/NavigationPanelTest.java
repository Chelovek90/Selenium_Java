package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NavigationPanelTest extends Locators{

    @Test
    void careerPageTest() {
        /*Открываю стартовую страницу теста*/
        open(BASE_URL + "/career");
        driver.manage().window().maximize();
        /*Перехожу на страницу "Карьера"*/
        driver.findElement(careerNavItemButton).click();
        header = getText(headerText);
        /*Проверяю, что перешел на нужную мне страницу*/
        Assertions.assertEquals("Карьера", header);
        /*Проверяю наличие headera и footera*/
        IsElementPresent(headerSelector);
        IsElementPresent(footerSelector);
    }

    @Test
    void testPageTest() {
        /*Открываю стартовую страницу теста*/
        open(BASE_URL + "/career");
        driver.manage().window().maximize();
        /*Перехожу на страницу "Тесты"*/
        driver.findElement(testNavItemButton).click();
        header = getText(headerText);
        /*Проверяю, что перешел на нужную мне страницу*/
        Assertions.assertEquals("Тесты", header);
        /*Проверяю наличие headera и footera*/
        IsElementPresent(headerSelector);
        IsElementPresent(footerSelector);
    }

    @Test
    void coursePageTest() {
        /*Открываю стартовую страницу теста*/
        open(BASE_URL + "/career");
        driver.manage().window().maximize();
        /*Перехожу на страницу "Курсы"*/
        driver.findElement(coursesNavItemButton).click();
        header = getText(headerText);
        /*Закрываю всплывающее окно скидки*/
        closeSell();
        /*Проверяю, что перешел на нужную мне страницу*/
        Assertions.assertEquals("Курсы", header);
        /*Проверяю наличие headera и footera*/
        IsElementPresent(headerSelector);
        IsElementPresent(footerSelector);
    }

    @Test
    void vebinarPageTest() {
        /*Открываю стартовую страницу теста*/
        open(BASE_URL + "/career");
        driver.manage().window().maximize();
        /*Перехожу на страницу "Вебинары"*/
        driver.findElement(vebinarNavItemButton).click();
        header = getText(headerText);
        /*Проверяю, что перешел на нужную мне страницу*/
        Assertions.assertEquals("Вебинары", header);
        /*Проверяю наличие headera и footera*/
        IsElementPresent(headerSelector);
        IsElementPresent(footerSelector);
    }

    @Test
    void forumPageTest() {
        /*Открываю стартовую страницу теста*/
        open(BASE_URL + "/career");
        driver.manage().window().maximize();
        /*Перехожу на страницу "Форум"*/
        driver.findElement(forumNavItemButton).click();
        header = getText(headerText);
        /*Проверяю, что перешел на нужную мне страницу*/
        Assertions.assertEquals("Форум", header);
        /*Проверяю наличие headera и footera*/
        IsElementPresent(headerSelector);
        IsElementPresent(footerSelector);
    }

    @Test
    void blogPageTest() {
        /*Открываю стартовую страницу теста*/
        open(BASE_URL + "/career");
        driver.manage().window().maximize();
        /*Перехожу на страницу "Блог"*/
        driver.findElement(blogNavItemButton).click();
        header = getText(headerText);
        /*Проверяю, что перешел на нужную мне страницу*/
        Assertions.assertEquals("Блог", header);
        /*Проверяю наличие headera и footera*/
        IsElementPresent(headerSelector);
        IsElementPresent(footerSelector);
    }
}
