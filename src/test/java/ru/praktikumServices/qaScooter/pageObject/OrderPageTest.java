package ru.praktikumServices.qaScooter.pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OrderPageTest {
    private WebDriver driver;
    private OrderPage objOrderPage;
    private final String button;
    private final String name;
    private final String surname;
    private final String address;
    private final String metroStation;
    private final String telephone;
    private final String date;
    public OrderPageTest(String button, String name, String surname, String address,String metroStation, String telephone, String date){
        this.button = button;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.telephone = telephone;
        this.date = date;

    }
    @Parameterized.Parameters
    public static Collection<Object[]> getValidOrderData(){
        return Arrays.asList(new Object[][]{
        {"Нижняя кнопка","аввцав","ываыва", "ывпыв 9", "черкизовская", "99999999999", "01.10.2022"},
        {"Верхняя кнопка","Иван","Иванов", "ул.Ленина 11б", "соколь", "99888899999", "15.09.22"},
        });
    }

    @Before
    public void startUp(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru");
        objOrderPage = new OrderPage(driver);
    }

    @Test
    public void placeAnValidOrder(){
        objOrderPage.order(button, name, surname, address, metroStation, telephone, date);
    }

    @After
    public void teardown(){
        driver.quit();

    }
}