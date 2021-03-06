package ru.geekbrains.main.site.at;

import org.openqa.selenium.By;
import ru.geekbrains.main.site.at.Base.BaseTest;

public class Locators extends BaseTest {

    /*Локатор heder - footer*/
    By headerText = By.className("gb-header__title");
    By headerSelector = By.id("top-menu");
    By footerSelector = By.className("site-footer");

    /*Локаторы панели поиска*/
    By searchTab = By.cssSelector("ul.search-page-tabs");
    By professionsHeaderButton = By.cssSelector(".container > .search-page-tabs > .nav-tabs-item:nth-child(2) span");
    By courseHeaderButton = By.cssSelector(".container > .search-page-tabs > .nav-tabs-item:nth-child(3) span");
    By vebinarHeaderButton = By.cssSelector(".container > .search-page-tabs > .nav-tabs-item:nth-child(4) span");
    By blogHeaderButton = By.cssSelector(".container > .search-page-tabs > .nav-tabs-item:nth-child(5) span");
    By forumHeaderButton = By.cssSelector(".container > .search-page-tabs > .nav-tabs-item:nth-child(6) span");
    By testHeaderButton = By.cssSelector(".container > .search-page-tabs > .nav-tabs-item:nth-child(7) span");


 }
