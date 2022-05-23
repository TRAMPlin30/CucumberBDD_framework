package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pageObject.pages.ContactUsPage;

import static constants.messages.Messages.ContactUsMessages.*;
import static constants.urls.Urls.Pages.CONTACT_US_PAGE;

public class ContactUsPageSteps {

    ContactUsPage contactUsPage = new ContactUsPage();

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        contactUsPage.navigateTo(CONTACT_US_PAGE);
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUsPage.fillFirstNameField("John");
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
       contactUsPage.fillLastNameField("Wick");
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUsPage.fillEmailField("john_wick@example.com");
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactUsPage.fillCommentField("Hello my friends");
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name_joe(String firstName) {
        contactUsPage.fillFirstNameField(firstName);
    }

    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name_blogs(String lastName) {
        contactUsPage.fillLastNameField(lastName);
    }

    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address_joe_blogs_example_com(String emailAddress) {
        contactUsPage.fillEmailField(emailAddress);
    }

    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String string) {
        contactUsPage.fillCommentField(string);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contactUsPage.clickButtonSubmit();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        Assert.assertEquals(ActualMessage, EXPECTED_MESSAGE_THANK_YOU);
    }
}
