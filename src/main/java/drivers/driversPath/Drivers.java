package drivers.driversPath;

public class Drivers {

    public interface ChromeDriver {
        String DRIVER_NAME_CHROME = "webdriver.chrome.driver",
                DRIVER_PATH_CHROME = "src/main/java/drivers/driverExec/chromedriver.exe",
                DRIVER_NAME_FIREFOX = "webdriver.gecko.driver",
                DRIVER_PATH_FIREFOX = "src/main/java/drivers/driverExec/geckodriver.exe";
    }
}
