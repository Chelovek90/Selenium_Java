package ru.geekbrains.main.site.at;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.Base.BaseTest;
import ru.geekbrains.main.site.at.pages.NavigationTab;

import java.util.stream.Stream;

public class NavigationPanelTest extends BaseTest {

    @BeforeEach
    public void openPage () {
        driver.get(BASE_URL+ "/career");
        driver.manage().window().maximize();
    }

    @ParameterizedTest
    @MethodSource("pageGenerator")
    public void navigationPanelTest(String buttonTitle) {
        new NavigationTab(driver)
                .clickButton(buttonTitle)
                .checkHeader(buttonTitle);
    }

    public static Stream<String> pageGenerator() {
        return Stream.of("Карьера", "Тесты", "Блог", "Форум", "Вебинары", "Курсы");
    }
}
