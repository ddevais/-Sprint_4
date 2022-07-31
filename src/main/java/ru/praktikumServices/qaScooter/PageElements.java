package ru.praktikumServices.qaScooter;

import org.openqa.selenium.By;

public class PageElements {
    //Кнопка "Заказать" в шапке
    private By buttonOrderHat = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text() = 'Заказать']");
    public By getButtonOrderHat() {
        return buttonOrderHat;
    }

    //Кнопка "Статус заказа"
    private By buttonOrderStatus = By.xpath(".//div[@class='Header_Nav__AGCXC']/button[text() = 'Статус заказа']");
    public By getButtonOrderStatus() {
        return buttonOrderStatus;
    }
    //Лого "Самоката"
    private By logoSamokat = By.className("Header_LogoScooter__3lsAR");

    public By getLogoSamokat() {
        return logoSamokat;
    }

    //Поле ввода номера заказа
    private By statusField = By.xpath(".//a[@href='/']");

    public By getStatusField() {
        return statusField;
    }

    //Кнопка "Go!"
    private By buttonGo = By.xpath(".//button[text()='Go!']");

    public By getButtonGo() {
        return buttonGo;
    }

    //Лого "Яндекса"
    private By logoYandex = By.xpath(".//a[@href='//yandex.ru']");

    public By getLogoYandex() {
        return logoYandex;
    }

    //Кнопка "Заказать" нижняя
    private By buttonOrderDown = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button");

    public By getButtonOrderDown() {
        return buttonOrderDown;
    }

    //Текст первого пункта аккордеона
    private By firstItem = By.id("accordion__heading-0");

    public By getFirstItem() {
        return firstItem;
    }

    //Текст описания первого пункта аккордеона
    private By firstItemDescription = By.id("accordion__panel-0");

    public By getFirstItemDescription() {
        return firstItemDescription;
    }

    //Текст второго пункта аккордеона
    private By secondItem = By.id("accordion__heading-1");

    public By getSecondItem() {
        return secondItem;
    }

    //Текст описания второго пункта аккордеона
    private By secondItemDescription = By.id("accordion__panel-1");

    public By getSecondItemDescription() {
        return secondItemDescription;
    }

    //Текст третьего пункта аккордеона
    private By thirdItem = By.id("accordion__heading-2");

    public By getThirdItem() {
        return thirdItem;
    }

    //Текст описания третего пункта аккордеона
    private By thirdItemDescription = By.id("accordion__panel-2");

    public By getThirdItemDescription() {
        return thirdItemDescription;
    }

    //Текст четвертого пункта аккордеона
    private By fourthItem = By.id("accordion__heading-3");

    public By getFourthItem() {
        return fourthItem;
    }

    //Текст описания четвертого пункта аккордеона
    private By fourthItemDescription = By.id("accordion__panel-3");

    public By getFourthItemDescription() {
        return fourthItemDescription;
    }

    //Текст пятого пункта аккордеона
    private By fifthItem = By.id("accordion__heading-4");

    public By getFifthItem() {
        return fifthItem;
    }

    //Текст описания пятого пункта аккордеона
    private By fifthItemDescription = By.id("accordion__panel-4");

    public By getFifthItemDescription() {
        return fifthItemDescription;
    }

    //Текст шестого пункта аккордеона
    private By sixthItem = By.id("accordion__heading-5");

    public By getSixthItem() {
        return sixthItem;
    }

    //Текст описания шестого пункта аккордеона
    private By sixthItemDescription = By.id("accordion__panel-5");

    public By getSixthItemDescription() {
        return sixthItemDescription;
    }

    //Текст седьмого пункта аккордеона
    private By seventhItem = By.id("accordion__heading-6");

    public By getSeventhItem() {
        return seventhItem;
    }

    //Текст описания седьмого пункта аккордеона
    private By seventhItemDescription = By.id("accordion__panel-6");

    public By getSeventhItemDescription() {
        return seventhItemDescription;
    }

    //Текст восьмого пункта аккордеона
    private By eighthItem = By.id("accordion__heading-7");

    public By getEighthItem() {
        return eighthItem;
    }

    //Текст описания восьмого пункта аккордеона
    private By eighthItemDescription = By.id("accordion__panel-7");

    public By getEighthItemDescription() {
        return eighthItemDescription;
    }

    //Поле ввода "Имя"
    private By nameField = By.xpath(".//div[@class='Order_Form__17u6u']/*[1]/input");

    public By getNameField() {
        return nameField;
    }

    //Поле ввода "Фамилия"
    private By surnameField = By.xpath(".//div[@class='Order_Form__17u6u']/*[2]/input");

    public By getSurnameField() {
        return surnameField;
    }

    //Поле ввода "Адрес"
    private By addressField = By.xpath(".//div[@class='Order_Form__17u6u']/*[3]/input");

    public By getAddressField() {
        return addressField;
    }

    //Поле ввода "Станция метро"
    private By metroStationField = By.className("select-search__input");

    public By getMetroStationField() {
        return metroStationField;
    }

    //Меню для "Станция метро"
    private By metroStationMenu = By.xpath(".//div[@class='select-search__select']/*/*");

    public By getMetroStationMenu() {
        return metroStationMenu;
    }

    //Поле ввода "Телефон"
    private By telephoneField = By.xpath(".//div[@class='Order_Form__17u6u']/*[5]/input");

    public By getTelephoneField() {
        return telephoneField;
    }

    //Кнопка "Далее"
    private By furtherButton =By.xpath(".//div[@class='Order_NextButton__1_rCA']/button");

    public By getFurtherButton() {
        return furtherButton;
    }

    //Поле ввода "Когда привезти самокат"
    private By dateField = By.xpath(".//div[@class='react-datepicker__input-container']/input");

    public By getDateField() {
        return dateField;
    }

    //Поле "Срок аренды"
    private By leaseTermField = By.className("Dropdown-placeholder");

    public By getLeaseTermField() {
        return leaseTermField;
    }

    //Меню для срока аренды
    private By leaseTermMenu = By.xpath(".//div[@class='Dropdown-menu']/div[1]");

    public By getLeaseTermMenu() {
        return leaseTermMenu;
    }

    //Кнопка "Заказать" для оформления заказа
    private By orderToCheckoutButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[2]");

    public By getOrderToCheckoutButton() {
        return orderToCheckoutButton;
    }
    //Кнопка "Да" в окне оформления заказа
    private By yesButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Да']");

    public By getYesButton() {
        return yesButton;
    }
    //Окно успешно созданного заказа
    private By popupCreatedOrder = By.xpath(".//div[text()='Заказ оформлен']");

    public By getPopupCreatedOrder() {
        return popupCreatedOrder;
    }

    //Картинка "Такого заказа нет"
    private By noSuchOrderImg = By.xpath(".//div[@class='Track_NotFound__6oaoY']/img");

    public By getNoSuchOrderImg() {
        return noSuchOrderImg;
    }
}
