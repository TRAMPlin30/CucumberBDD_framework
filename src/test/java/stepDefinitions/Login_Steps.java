package stepDefinitions;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static constants.urls.Urls.Pages.LOGIN_PAGE;
import static drivers.DriverFactory.getDriver;

public class Login_Steps {

    private WebDriver driver = getDriver();

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        driver.get(LOGIN_PAGE);
    }

    @When("I enter a username {word}")
    public void i_enter_a_username(String username) {
        driver.findElement(By.id("text")).sendKeys(username);
    }

    @And("I enter a password {}")
    public void i_enter_a_password(String string) {
        driver.findElement(By.id("password")).sendKeys(string);
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
        String loginMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(loginMessage, "validation succeeded");

    }
    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
        String loginMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(loginMessage, "validation failed");

    }

    @Then("I should be presented with message {}")
    public void I_should_be_presented_with_message(String massage) {
        String loginMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(loginMessage, massage);

    }
}
