package ru.praktikum_services.qa_scooter.page_object;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Main {
    //Текст первого пункта аккордеона
    private By firstItem = By.id("accordion__heading-0");
    //Текст описания первого пункта аккордеона
    private By firstItemDescription = By.id("accordion__panel-0");
    //Текст второго пункта аккордеона
    private By secondItem = By.id("accordion__heading-1");
    //Текст описания второго пункта аккордеона
    private By secondItemDescription = By.id("accordion__panel-1");
    //Текст третьего пункта аккордеона
    private By thirdItem = By.id("accordion__heading-2");
    //Текст описания третего пункта аккордеона
    private By thirdItemDescription = By.id("accordion__panel-2");
    //Текст четвертого пункта аккордеона
    private By fourthItem = By.id("accordion__heading-3");
    //Текст описания четвертого пункта аккордеона
    private By fourthItemDescription = By.id("accordion__panel-3");
    //Текст пятого пункта аккордеона
    private By fifthItem = By.id("accordion__heading-4");
    //Текст описания пятого пункта аккордеона
    private By fifthItemDescription = By.id("accordion__panel-4");
    //Текст шестого пункта аккордеона
    private By sixthItem = By.id("accordion__heading-5");
    //Текст описания шестого пункта аккордеона
    private By sixthItemDescription = By.id("accordion__panel-5");
    //Текст седьмого пункта аккордеона
    private By seventhItem = By.id("accordion__heading-6");
    //Текст описания седьмого пункта аккордеона
    private By seventhItemDescription = By.id("accordion__panel-6");
    //Текст восьмого пункта аккордеона
    private By eighthItem = By.id("accordion__heading-7");
    //Текст описания восьмого пункта аккордеона
    private By eighthItemDescription = By.id("accordion__panel-7");
    private WebDriver driver;

    //Кнопка "Заказать" в шапке
    By[] items = {firstItem, secondItem, thirdItem, fourthItem, fifthItem, sixthItem, seventhItem, eighthItem};
    By[] itemsDescription = {firstItemDescription, secondItemDescription, thirdItemDescription, fourthItemDescription, fifthItemDescription, sixthItemDescription, seventhItemDescription, eighthItemDescription};

    public Main(WebDriver driver){
        this.driver = driver;
    }




    public void scrollClickToFirstItem(int b){
        WebElement element = driver.findElement(items[b]);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        element.click();

    }
    public String getCheckText(int a){
        String actual = driver.findElement(itemsDescription[a]).getText();
        return actual;
    }

}

