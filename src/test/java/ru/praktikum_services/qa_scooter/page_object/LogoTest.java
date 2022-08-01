package ru.praktikum_services.qa_scooter.page_object;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.praktikum_services.qa_scooter.Constants;

import static org.junit.Assert.*;

public class LogoTest {
    private WebDriver driver;
    private Logo objLogo;
    private Constants constants = new Constants();

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(constants.getMainPage());
        objLogo = new Logo(driver);
    }

    @Test
    public void afterClickYandexLogoGoToMainPageYandexInNewTab() {

        objLogo.clickYandexLogo();
        objLogo.checkTwoWindows();
        objLogo.switchToWindow();
        assertEquals(constants.getMainYandexPage(), objLogo.getUrl());
    }

    @Test
    public void afterClickSamokatLogoGoToMainPageSamokat(){
        objLogo. cliskToOrderButton();
        objLogo.clickSamokatLogo();
        assertEquals(constants.getMainPage(), objLogo.getUrl());


    }
    @After
    public void tearDown(){
        driver.quit();
    }
}