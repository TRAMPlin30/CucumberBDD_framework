package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static drivers.DriverFactory.cleanUpDriver;
import static drivers.DriverFactory.getDriver;
import static org.testng.reporters.Files.copyFile;

public class Hook {

    @Before()
    public void setUp() {
        getDriver();
    }

    @AfterStep
    public void captureExceptionImage(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {

            File scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            FileInputStream fileInputStream = new FileInputStream(scrFile);
            copyFile(fileInputStream, new File("src/main/resources/img/"+scenario.getName()+"-failed-"+"screenshot.png"));

            byte[] screenShot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "Scenario failed: "+scenario.getName());
        }
    }

    @After()
    public void tearDown() {
        cleanUpDriver();
    }
}
