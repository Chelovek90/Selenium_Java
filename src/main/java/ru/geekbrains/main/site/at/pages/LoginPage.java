package ru.geekbrains.main.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "[name='user[email]']")
    private WebElement loginField;

    @FindBy(css = "[name='user[password]']")
    private WebElement passwordField;

    @FindBy(css = ".form-group > .btn")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step ("Authorization user")
    public Page authorization(String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        loginButton.click();
        return new Page(driver);
    }

    @Step ("Input {login} user")
    public Page loginInput(String login) {
        loginField.sendKeys(login);
        return new Page(driver);
    }

    @Step ("Input {password} user")
    public Page passwordInput(String password) {
        passwordField.sendKeys(password);
        return new Page(driver);
    }

    @Step("Click on login button")
    public Page clickLoginButton() {
        loginButton.click();
        return new Page(driver);
    }
}
