package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;

import static drivers.DriverFactory.cleanUpDriver;
import static drivers.DriverFactory.getDriver;

public class Hook {

    @Before()
    public void setUp() {
        getDriver();
    }

    @AfterStep
    public void captureExceptionImage(Scenario scenario) {
        if (scenario.isFailed()) {
//            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//            String timeMilliseconds = Long.toString(timestamp.getTime());

            byte[] screenShot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Scenario failed: "+scenario.getName());
        }
    }

    @After()
    public void tearDown() {
        cleanUpDriver();
    }
}
