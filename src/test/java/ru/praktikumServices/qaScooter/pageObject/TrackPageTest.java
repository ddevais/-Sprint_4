package ru.praktikumServices.qaScooter.pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TrackPageTest {
    public final String trackNumber;
    private WebDriver driver;
    private TrackPage objTrackPage;
    public TrackPageTest(String trackNumber){
        this.trackNumber = trackNumber;
    }
@Parameterized.Parameters
    public static Collection<Object[]> getInvalidTrackNumber(){
        return Arrays.asList(new Object[][]{
                {"0"},
                {"1"},
        });
}
@Before
    public void startUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://qa-scooter.praktikum-services.ru/");
    objTrackPage = new TrackPage(driver);

}
@Test
    public void checkNoSuchOrder(){
        objTrackPage.checkOrder(trackNumber);
}
    @After
    public void teardown(){
        driver.quit();

    }
        }