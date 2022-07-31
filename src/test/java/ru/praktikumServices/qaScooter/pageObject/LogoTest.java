package ru.praktikumServices.qaScooter.pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class LogoTest {
    private WebDriver driver;
    private Logo objLogo;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objLogo = new Logo(driver);
    }

    @Test
    public void afterClickYandexLogoGoToMainPageYandexInNewTab() {

        objLogo.clickYandexLogo();
        objLogo.checkTwoWindows();
        objLogo.switchToWindow();
        assertEquals("https://yandex.ru/", objLogo.getUrl());
    }

    @Test
    public void afterClickSamokatLogoGoToMainPageSamokat(){
        objLogo. cliskToOrderButton();
        objLogo.clickSamokatLogo();
        assertEquals("https://qa-scooter.praktikum-services.ru/", objLogo.getUrl());


    }
    @After
    public void tearDown(){
        driver.quit();
    }
}