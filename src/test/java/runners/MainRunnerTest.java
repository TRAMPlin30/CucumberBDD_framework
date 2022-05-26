package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions (
        features = {"classpath:features"},
        glue = {"stepDefinitions"},
        tags = "",
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"},
        monochrome = false,
        dryRun = false)
public class MainRunnerTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
