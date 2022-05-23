package pageObject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

import static constants.locators.Locators.Login.*;

public class LoginPage extends BasePage {

    @FindBy(id = USER_NAME_FIELD)
    protected WebElement userNameField;
    @FindBy(id = PASSWORD_FIELD)
    protected WebElement passwordField;
    @FindBy(id = LOGIN_BUTTON)
    protected WebElement buttonLogin;

    public LoginPage() {
        super();
    }

    public void fillUserNameField(String name) {
        waitWebElementIsVisible(userNameField);
        waitWebElementIsClickable(userNameField);
        clickElement(userNameField);
        sendValue(userNameField, name);
    }

    public void fillPasswordField(String password) {
        waitWebElementIsVisible(passwordField);
        waitWebElementIsClickable(passwordField);
        clickElement(passwordField);
        sendValue(passwordField, password);
    }

    public void clickButtonLogin() {
        waitWebElementIsVisible(buttonLogin);
        waitWebElementIsClickable(buttonLogin);
        clickElement(buttonLogin);
    }
}
