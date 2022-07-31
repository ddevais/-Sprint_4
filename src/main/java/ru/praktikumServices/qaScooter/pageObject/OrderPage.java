package ru.praktikumServices.qaScooter.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.praktikumServices.qaScooter.PageElements;

import java.util.Objects;

public class OrderPage {
    PageElements elements = new PageElements();

private By cookieButton = By.className("App_CookieButton__3cvqF");

private WebDriver driver;

public OrderPage(WebDriver driver){
    this.driver = driver;
}

public void clickButtonOrder(String button){
if (Objects.equals(button, "Верхняя кнопка")) {
    driver.findElement(elements.getButtonOrderHat()).click();
} else if (Objects.equals(button, "Нижняя кнопка")) {
    driver.findElement(elements.getButtonOrderDown()).click();
}
else {

System.out.println("Введите 'Верхняя кнопка' или 'Нижняя кнопка'.");
}

}

    public void setName(String name) {
        driver.findElement(elements.getNameField()).sendKeys(name);
    }
    public void setSurname(String surname){
    driver.findElement(elements.getSurnameField()).sendKeys(surname);
    }
    public void setAddress(String address){
    driver.findElement(elements.getAddressField()).sendKeys(address);
    }
    public void setMetroStation(String metroStation){
    driver.findElement(elements.getMetroStationField()).sendKeys(metroStation);
    driver.findElement(elements.getMetroStationMenu()).click();
    }
    public void setTelephone(String telephone){

    driver.findElement(elements.getTelephoneField()).sendKeys(telephone);
    }
    public void clickFurtherButton(){
    driver.findElement(elements.getFurtherButton()).click();
    }
    public void clickCookieButton(){
    driver.findElement(cookieButton).click();
    }
    public void setDateField(String date){
    driver.findElement(elements.getDateField()).sendKeys(date);
    driver.findElement(By.className("Order_Header__BZXOb")).click();
    }
    public void setLeaseTerm(){
    driver.findElement(elements.getLeaseTermField()).click();
    driver.findElement(elements.getLeaseTermMenu()).click();

    }
    public void clickLOrderToCheckoutButton(){
    driver.findElement(elements.getOrderToCheckoutButton()).click();
    }
    public void checkPopupCreatedOrder(){
    driver.findElement(elements.getPopupCreatedOrder());
    }
    public void clickYesButton(){
    driver.findElement(elements.getYesButton()).click();
    }
    public void order (String button, String name, String surname, String address,String metroStation, String telephone, String date){

    clickCookieButton();
    clickButtonOrder(button);
    setName(name);
    setSurname(surname);
    setAddress(address);
    setMetroStation(metroStation);
    setTelephone(telephone);
    clickFurtherButton();
    setDateField(date);
    setLeaseTerm();
    clickLOrderToCheckoutButton();
    clickYesButton();
    checkPopupCreatedOrder();
    }

}

