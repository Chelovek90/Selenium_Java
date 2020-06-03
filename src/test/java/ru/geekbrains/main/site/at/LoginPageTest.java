package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.Base.BaseTest;
import ru.geekbrains.main.site.at.pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @BeforeEach
    public void openPage() {
        driver.get(BASE_URL + "/login");
    }

    @Test
    public void shouldBeCanLoginTest() {
        new LoginPage(driver)
                .loginInput("hao17583@bcaoo.com")
                .getLoginPage()
                .passwordInput("hao17583")
                .getLoginPage()
                .clickLoginButton()
                .checkHeader("Главная");
    }

}
