package ru.praktikumServices.qaScooter.pageObject;

import org.openqa.selenium.WebDriver;
import ru.praktikumServices.qaScooter.PageElements;

import java.util.concurrent.TimeUnit;

public class TrackPage {
    private WebDriver driver;
    PageElements elements = new PageElements();
    public TrackPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickOrderStatusButton(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(elements.getButtonOrderStatus()).click();
    }
    public void setStatusField(String trackNumber){
        driver.findElement(elements.getStatusField()).sendKeys(trackNumber);
    }
    public void clickGoButton(){
        driver.findElement(elements.getButtonGo()).click();
    }
    public void checkNoSuchOrderImg(){
        driver.findElement(elements.getNoSuchOrderImg());
    }
    public void checkOrder(String trackNumber){
        clickOrderStatusButton();
        setStatusField(trackNumber);
        clickGoButton();
        checkNoSuchOrderImg();
    }

}
