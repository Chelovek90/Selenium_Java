package ru.geekbrains.main.site.at.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    public WebDriver driver;
    public final String BASE_URL = "https://geekbrains.ru";

    String header;
    int result;

    void IsElementPresent(By by) {
        try {
            driver.findElement(by);
        } catch (NoSuchElementException e) {
            System.out.println("Элемент" + by + "не найден");
        }
    }

    void open(String link) {
        driver.get(link);
    }

    void closeSell() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div/button[2]")).click();
    }



    String getText(By by) {
        IsElementPresent(by);
        return driver.findElement(by).getText();
    }


    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
