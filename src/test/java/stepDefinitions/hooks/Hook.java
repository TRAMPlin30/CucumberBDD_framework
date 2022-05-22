package stepDefinitions.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static drivers.driversPath.Drivers.ChromeDriver.DRIVER_NAME_CHROME;
import static drivers.driversPath.Drivers.ChromeDriver.DRIVER_PATH_CHROME;

public class Hook {

    private WebDriver driver;

    @Before("@contact-us")
    public void setUp() {
        System.setProperty(DRIVER_NAME_CHROME, DRIVER_PATH_CHROME);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After("@contact-us")
    public void tearDown() {
        driver.quit();
    }
}
