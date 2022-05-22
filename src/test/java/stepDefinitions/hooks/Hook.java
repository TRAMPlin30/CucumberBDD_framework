package stepDefinitions.hooks;

import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static drivers.DriverFactory.cleanUpDriver;
import static drivers.DriverFactory.getDriver;

public class Hook {

    @Before()
    public void setUp() {
        getDriver();
    }

    @After()
    public void tearDown() {
        cleanUpDriver();
    }
}
