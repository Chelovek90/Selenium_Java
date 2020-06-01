package ru.geekbrains.main.site.at;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import ru.geekbrains.main.site.at.Base.BaseTest;
import ru.geekbrains.main.site.at.pages.Page;


import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class SearchTest extends BaseTest {

    @BeforeEach
    public void openPage() {
        driver.get(BASE_URL + "/courses");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div/button[2]")).click();
    }

    @ParameterizedTest
    @MethodSource("selectorGenerator")
    public void searchFieldTest(String value, String selector) {
        new Page(driver)
                .searchValue(value)
                .getSearchPageTab()
                .shouldBeCorrectResult(selector);
    }

    public static Stream<String> selectorGenerator() {
        return Stream.of("Профессии", "Курсы", "Вебинары", "Блоги", "Форумы", "Тесты");
    }
}
