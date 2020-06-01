//package ru.geekbrains.main.site.at;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class SearchTest extends Locators {
//    @Test
//    public void searchTest() {
//        /*Открываю стартовую страницу теста*/
//        open(BASE_URL + "/courses");
//        driver.manage().window().maximize();
//        /*Закрываю всплывающее окно скидки*/
//        closeSell();
//        /*Открываю поисковую строку*/
//        driver.findElement(searchButton).click();
//        /*Ввожу в строку поиска слово*/
//        driver.findElement(searchInput).sendKeys("java");
//
//        /*Проверяю, что появилась панель с результатами поиска*/
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(ExpectedConditions.presenceOfElementLocated(searchTab));
//
//        /*Выполняю проверку результатов найденых элементов по категориям*/
//        result = Integer.parseInt(getText(professionsHeaderButton));
////        assertTrue(result >= 2, "Результат поиска по категории 'Профессии' не соответствует");
//        assertThat(result, lessThanOrEqualTo(2));
//
//        result = Integer.parseInt(getText(courseHeaderButton));
////        assertTrue(result > 15, "Результат поиска по категории 'Курсы' не соответствует");
//        assertThat(result, greaterThan(15));
//
//        result = Integer.parseInt(getText(vebinarHeaderButton));
////        assertTrue(180 < result && result < 300, "Результат поиска по категории 'Вебинары' не соответствует");
//        assertThat(result, allOf(
//               greaterThan(180),
//               lessThan(300)
//        ));
//        result = Integer.parseInt(getText(blogHeaderButton));
////        assertTrue(result > 300, "Результат поиска по категории 'Блог' не соответствует");
//        assertThat(result, greaterThan(300));
//
//        result = Integer.parseInt(getText(forumHeaderButton));
////        assertTrue(result != 350, "Результат поиска по категории 'Форумы' не соответствует");
//        assertThat(result, not(equalTo(350)));
//
//        result = Integer.parseInt(getText(testHeaderButton));
////        assertTrue(result != 0, "Результат поиска по категории 'Тесты' не соответствует");
//        assertThat(result, not(equalTo(0)));
//    }
//}
