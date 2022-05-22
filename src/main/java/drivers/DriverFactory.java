package drivers;

import lombok.Getter;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverFactory {

    @Getter
    public enum Driver {
        CHROME ("src/main/java/drivers/driverExec/chromedriver.exe", "webdriver.chrome.driver"),
        FIREFOX ("src/main/java/drivers/driverExec/geckodriver.exe", "webdriver.gecko.driver");

        final String PATH;
        final String NAME;

        Driver(String PATH, String NAME) {
            this.PATH = PATH;
            this.NAME = NAME;
        }
    }

    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    private static WebDriver createDriver(Driver driverKey) {
        WebDriver driver = null;
        String driverName = driverKey.getNAME();
        String driverPath = driverKey.getPATH();

        switch (driverKey) {
            case CHROME:
                System.setProperty(driverName, driverPath);
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty(driverName, driverPath);
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        return driver;
    }

    public static void cleanUpDriver() {
        webDriver.get().quit();
        webDriver.remove();
    }

}
