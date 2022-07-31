package ru.praktikumServices.qaScooter.pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.praktikumServices.qaScooter.PageElements;


public class Main {
    private PageElements elements = new PageElements();
    private WebDriver driver;

    //Кнопка "Заказать" в шапке
    By[] items = {elements.getFirstItem(), elements.getSecondItem(), elements.getThirdItem(), elements.getFourthItem(), elements.getFifthItem(), elements.getSixthItem(), elements.getSeventhItem(), elements.getEighthItem()};
    By[] itemsDescription = {elements.getFirstItemDescription(), elements.getSecondItemDescription(), elements.getThirdItemDescription(), elements.getFourthItemDescription(), elements.getFifthItemDescription(), elements.getSixthItemDescription(), elements.getSeventhItemDescription(), elements.getEighthItemDescription()};

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

