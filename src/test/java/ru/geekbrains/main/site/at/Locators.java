package ru.geekbrains.main.site.at;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class Locators extends BaseTest{
    /*Локаторы панели навигации*/
    By careerNavItemButton = By.cssSelector("nav > a[href='/career']");
    By testNavItemButton = By.cssSelector("nav > a[href='/tests'");
    By coursesNavItemButton = By.cssSelector("nav > a[href='/courses'");
    By vebinarNavItemButton = By.cssSelector("nav > a[href='/events'");
    By forumNavItemButton = By.cssSelector("nav > a[href='/topics'");
    By blogNavItemButton = By.cssSelector("nav > a[href='/posts'");

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

    /*Локаторы поисковой строки*/
    By searchButton = By.cssSelector("#top-menu .show-search-form");
    By searchInput = By.cssSelector("#top-menu .search-panel__search-field");

 }
