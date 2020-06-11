package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.Base.BaseTest;
import ru.geekbrains.main.site.at.pages.LoginPage;

public class CoursesPageTest extends BaseTest {
    @BeforeEach
    public void openPage() {
        driver.get(BASE_URL + "/login");
    }

    @Test
    public void shouldSeeQAcourses() {
        new LoginPage(driver)
                .authorization("hao17583@bcaoo.com", "hao17583")
                .checkHeader("Главная")
                .getNavigationTab()
                .clickButton("Курсы")
                .checkHeader("Курсы")
                .getCoursesPage()
                .clickButton("Курсы")
                .getCoursesPage()
                .clickButton("Бесплатные")
                .getCoursesPage()
                .clickButton("Тестирование")
                .getCoursesPage()
                .assertIn("Тестирование ПО. Уровень 1")
                .getCoursesPage()
                .assertIn("Тестирование ПО. Уровень 2");
    }
}
