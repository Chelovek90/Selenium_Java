package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchTest extends Locators{
    @Test
    void searchTest(){
        /*Открываю стартовую страницу теста*/
        open(BASE_URL + "/courses");
        driver.manage().window().maximize();
        /*Закрываю всплывающее окно скидки*/
        closeSell();
        /*Открываю поисковую строку*/
        driver.findElement(searchButton).click();
        /*Ввожу в строку поиска слово*/
        driver.findElement(searchInput).sendKeys("java");

        /*Проверяю, что появилась панель с результатами поиска*/
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(searchTab));

        /*Выполняю проверку результатов найденых элементов по категориям*/
        result = Integer.parseInt(getText(professionsHeaderButton));
        Assertions.assertTrue(result >= 2, "Результат поиска по категории 'Профессии' не соответствует");

        result = Integer.parseInt(getText(courseHeaderButton));
        Assertions.assertTrue(result > 15, "Результат поиска по категории 'Курсы' не соответствует");

        result = Integer.parseInt(getText(vebinarHeaderButton));
        Assertions.assertTrue(180 < result && result < 300, "Результат поиска по категории 'Вебинары' не соответствует");

        result = Integer.parseInt(getText(blogHeaderButton));
        Assertions.assertTrue(result > 300, "Результат поиска по категории 'Блог' не соответствует");

        result = Integer.parseInt(getText(forumHeaderButton));
        Assertions.assertTrue(result != 350, "Результат поиска по категории 'Форумы' не соответствует");

        result = Integer.parseInt(getText(testHeaderButton));
        Assertions.assertTrue(result != 0, "Результат поиска по категории 'Тесты' не соответствует");
    }
}
