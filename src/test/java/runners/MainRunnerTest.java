package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = {"classpath:features"},
        glue = {"stepDefinitions"},
        tags = "@smoke",
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        monochrome = false,
        dryRun = false)
public class MainRunnerTest extends AbstractTestNGCucumberTests {
}
