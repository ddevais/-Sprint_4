package ru.praktikumServices.qaScooter.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.praktikumServices.qaScooter.PageElements;
import java.util.Objects;
import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class Logo {
    private WebDriver driver;
    private PageElements elements = new PageElements();
    public Logo(WebDriver driver){
        this.driver = driver;
    }

    public void clickSamokatLogo(){
        driver.findElement(elements.getLogoSamokat()).click();
    }
    public void cliskToOrderButton(){
        driver.findElement(elements.getButtonOrderHat()).click();
    }
    public void clickYandexLogo(){
        driver.findElement(elements.getLogoYandex()).click();
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
