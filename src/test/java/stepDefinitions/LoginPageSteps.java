package stepDefinitions;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pageObject.pages.LoginPage;

import static constants.messages.Messages.LoginMessagesFailed.*;
import static constants.messages.Messages.LoginMessagesSuccess.*;
import static constants.urls.Urls.Pages.LOGIN_PAGE;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage();

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        loginPage.navigateTo(LOGIN_PAGE);
    }

    @When("I enter a username {word}")
    public void i_enter_a_username(String username) {
        loginPage.fillUserNameField(username);
    }

    @And("I enter a password {}")
    public void i_enter_a_password(String string) {
        loginPage.fillPasswordField(string);
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickButtonLogin();
    }

    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
        loginPage.waitAlertIsPresent();
        String ActualMessageSuccess = DriverFactory.getDriver().switchTo().alert().getText();
        Assert.assertEquals(ActualMessageSuccess, EXPECTED_MESSAGE_SUCCESS_LOGIN);
    }

    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
        loginPage.waitAlertIsPresent();
        String ActualMessageFailed = DriverFactory.getDriver().switchTo().alert().getText();
        Assert.assertEquals(ActualMessageFailed, EXPECTED_MESSAGE_FAILED_LOGIN);
    }

    @Then("I should be presented with message {}")
    public void I_should_be_presented_with_message(String message) {
        loginPage.waitAlertIsPresent();
        String ActualMessageSuccess = DriverFactory.getDriver().switchTo().alert().getText();
        Assert.assertEquals(ActualMessageSuccess, message);
    }
}
