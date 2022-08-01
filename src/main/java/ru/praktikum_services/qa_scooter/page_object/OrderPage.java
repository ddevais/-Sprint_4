package ru.praktikum_services.qa_scooter.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.praktikum_services.qa_scooter.Constants;
import java.util.Objects;

public class OrderPage {
    //Кнопка принять куки
    private By cookieButton = By.className("App_CookieButton__3cvqF");
    //Кнопка "Заказать" в шапке
    private By buttonOrderHat = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text() = 'Заказать']");
    //Кнопка "Заказать" нижняя
    private By buttonOrderDown = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");
    //Поле ввода "Имя"
    private By nameField = By.xpath(".//div[@class='Order_Form__17u6u']/*[1]/input");
    //Поле ввода "Фамилия"
    private By surnameField = By.xpath(".//div[@class='Order_Form__17u6u']/*[2]/input");
    //Поле ввода "Адрес"
    private By addressField = By.xpath(".//div[@class='Order_Form__17u6u']/*[3]/input");
    //Поле ввода "Станция метро"
    private By metroStationField = By.className("select-search__input");
    //Меню для "Станция метро"
    private By metroStationMenu = By.xpath(".//div[@class='select-search__select']/*/*");
    //Поле ввода "Телефон"
    private By telephoneField = By.xpath(".//div[@class='Order_Form__17u6u']/*[5]/input");
    //Кнопка "Далее"
    private By furtherButton =By.xpath(".//div[@class='Order_NextButton__1_rCA']/button");
    //Поле ввода "Когда привезти самокат"
    private By dateField = By.xpath(".//div[@class='react-datepicker__input-container']/input");
    //Поле "Срок аренды"
    private By leaseTermField = By.className("Dropdown-placeholder");
    //Меню для срока аренды
    private By leaseTermMenu = By.xpath(".//div[@class='Dropdown-menu']/div[1]");
    //Кнопка "Заказать" для оформления заказа
    private By orderToCheckoutButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[2]");
    //Кнопка "Да" в окне оформления заказа
    private By yesButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");
    //Окно успешно созданного заказа
    private By popupCreatedOrder = By.xpath(".//div[text()='Заказ оформлен']");
    //Пустое поле
    private By blankField =By.className("Order_Header__BZXOb");
    private WebDriver driver;
    Constants elements = new Constants();



public OrderPage(WebDriver driver){
    this.driver = driver;
}

public void clickButtonOrder(String button){
if (Objects.equals(button, "Верхняя кнопка")) {
    driver.findElement(buttonOrderHat).click();
} else if (Objects.equals(button, "Нижняя кнопка")) {
    driver.findElement(buttonOrderDown).click();
}
else {

System.out.println("Введите 'Верхняя кнопка' или 'Нижняя кнопка'.");
}

}

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }
    public void setSurname(String surname){
    driver.findElement(surnameField).sendKeys(surname);
    }
    public void setAddress(String address){
    driver.findElement(addressField).sendKeys(address);
    }
    public void setMetroStation(String metroStation){
    driver.findElement(metroStationField).sendKeys(metroStation);
    driver.findElement(metroStationMenu).click();
    }
    public void setTelephone(String telephone){

    driver.findElement(telephoneField).sendKeys(telephone);
    }
    public void clickFurtherButton(){
    driver.findElement(furtherButton).click();
    }
    public void clickCookieButton(){
    driver.findElement(cookieButton).click();
    }
    public void setDateField(String date){
    driver.findElement(dateField).sendKeys(date);
    driver.findElement(blankField).click();
    }
    public void setLeaseTerm(){
    driver.findElement(leaseTermField).click();
    driver.findElement(leaseTermMenu).click();

    }
    public void clickLOrderToCheckoutButton(){
    driver.findElement(orderToCheckoutButton).click();
    }
    public void checkPopupCreatedOrder(){
    driver.findElement(popupCreatedOrder);
    }
    public void clickYesButton(){
    driver.findElement(yesButton).click();
    }
    public void setOrderField (String button, String name, String surname, String address,String metroStation, String telephone, String date){

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

    }
    public void checkValidOrder(){
        clickLOrderToCheckoutButton();
        clickYesButton();
        checkPopupCreatedOrder();
    }

}

