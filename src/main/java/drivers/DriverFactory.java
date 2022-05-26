package drivers;

import lombok.Getter;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static drivers.paths.DriverPaths.ChromeDriver.*;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (webDriver.get() == null) {
            webDriver.set(createDriver());
        }
        return webDriver.get();
    }

    public static String getBrowserType() {
        String browserType = null;
        String browserTypeJenkinsValue = System.getProperty("browserType"); // add this for remote run on Jenkins

        try {
            if (browserTypeJenkinsValue == null || browserTypeJenkinsValue.isEmpty()) {  // add this statement for remote run on Jenkins
                Properties properties = new Properties();
                FileInputStream file = new FileInputStream("src/main/java/properties/config.properties");
                properties.load(file);
                browserType = properties.getProperty("browser").toLowerCase().trim();
            } else {
                browserType = browserTypeJenkinsValue; // add this for remote run on Jenkins
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return browserType;
    }


    private static WebDriver createDriver() {
        WebDriver driver = null;

        switch (getBrowserType()) {
            case "chrome":
                System.setProperty(DRIVER_NAME_CHROME, DRIVER_PATH_CHROME);
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty(DRIVER_NAME_FIREFOX, DRIVER_PATH_FIREFOX);
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
