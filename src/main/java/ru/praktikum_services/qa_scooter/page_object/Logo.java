package ru.praktikum_services.qa_scooter.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikum_services.qa_scooter.Constants;

import java.util.Objects;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class Logo {
    //Лого "Яндекса"
    private By logoYandex = By.xpath(".//a[@href='//yandex.ru']");
    //Лого "Самоката"
    private By logoSamokat = By.className("Header_LogoScooter__3lsAR");
    //Кнопка "Заказать" в шапке
    private By buttonOrderHat = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text() = 'Заказать']");
    private WebDriver driver;
    private Constants elements = new Constants();
    public Logo(WebDriver driver){
        this.driver = driver;
    }

    public void clickSamokatLogo(){
        driver.findElement(logoSamokat).click();
    }
    public void cliskToOrderButton(){
        driver.findElement(buttonOrderHat).click();
    }
    public void clickYandexLogo(){
        driver.findElement(logoYandex).click();
    }
    public void checkTwoWindows(){
        new WebDriverWait(driver, 3).until(numberOfWindowsToBe(2));
    }
    public void switchToWindow(){
        String oldTab = driver.getWindowHandle();
        Set<String> allTabs =  driver.getWindowHandles();
        for (String newTab : allTabs){
            if(!Objects.equals(newTab, oldTab)){
                driver.switchTo().window(newTab);
            }
        }
    }
    public String getUrl(){
    return driver.getCurrentUrl();
    }
}
