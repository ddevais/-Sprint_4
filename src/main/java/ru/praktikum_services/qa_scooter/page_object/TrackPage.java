package ru.praktikum_services.qa_scooter.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TrackPage {
    //Кнопка "Статус заказа"
    private By buttonOrderStatus = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text() = 'Статус заказа']");
    //Поле ввода номера заказа
    private By statusField = By.xpath(".//a[@href='/']");
    //Кнопка "Go!"
    private By buttonGo = By.xpath(".//button[text()='Go!']");
    //Картинка "Такого заказа нет"
    private By noSuchOrderImg = By.xpath(".//div[@class='Track_NotFound__6oaoY']/img");
    private WebDriver driver;

    public TrackPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickOrderStatusButton(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(buttonOrderStatus).click();
    }
    public void setStatusField(String trackNumber){
        driver.findElement(statusField).sendKeys(trackNumber);
    }
    public void clickGoButton(){
        driver.findElement(buttonGo).click();
    }
    public void checkNoSuchOrderImg(){
        driver.findElement(noSuchOrderImg);
    }
    public void checkOrder(String trackNumber){
        clickOrderStatusButton();
        setStatusField(trackNumber);
        clickGoButton();
        checkNoSuchOrderImg();
    }

}
