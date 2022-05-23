package pageObject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

import static constants.locators.Locators.ContactUs.*;

public class ContactUsPage extends BasePage {

    @FindBy(xpath = FIRST_NAME_FIELD)
    public WebElement firstNameField;
    @FindBy(xpath = LAST_NAME_FIELD)
    public WebElement lastNameField;
    @FindBy(xpath = EMAIL_FIELD)
    public WebElement emailField;
    @FindBy(xpath = COMMENT_FIELD)
    public WebElement commentField;
    @FindBy(xpath = SUBMIT_BUTTON)
    public WebElement buttonSubmit;
    @FindBy(xpath = MESSAGE_THANK_YOU)
    public static WebElement messageThankYou;

    public ContactUsPage() {
        super();
    }

    public void fillFirstNameField(String name) {
        waitWebElementIsVisible(firstNameField);
        clickElement(firstNameField);
        sendValue(firstNameField, name);
    }

    public void fillLastNameField(String name) {
        waitWebElementIsVisible(lastNameField);
        clickElement(lastNameField);
        sendValue(lastNameField, name);
    }

    public void fillEmailField(String name) {
        waitWebElementIsVisible(emailField);
        clickElement(emailField);
        sendValue(emailField, name);
    }

    public void fillCommentField(String name) {
        waitWebElementIsVisible(commentField);
        clickElement(commentField);
        sendValue(commentField, name);
    }

    public void clickButtonSubmit() {
        waitWebElementIsVisible(buttonSubmit);
        waitButtonIsActive(buttonSubmit);
        clickElement(buttonSubmit);
    }
}