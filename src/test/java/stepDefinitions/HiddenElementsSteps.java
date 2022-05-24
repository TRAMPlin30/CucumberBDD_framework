package stepDefinitions;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pageObject.pages.HiddenElementsPage;

import static constants.messages.Messages.HiddenClickMessage.*;
import static constants.urls.Urls.Pages.HIDDEN_ELEMENTS_PAGE;

public class HiddenElementsSteps {

    HiddenElementsPage hiddenElementsPage = new HiddenElementsPage();

    @Given("I access the webdriver university Hidden Elements Page")
    public void i_access_the_webdriver_university_hidden_elements_page() {
        hiddenElementsPage.navigateTo(HIDDEN_ELEMENTS_PAGE);
    }

    @When("I click on the not displayed button")
    public void i_click_on_the_not_displayed_button() {
        hiddenElementsPage.clickNotDisplayedElement();
    }

    @When("I click on the visibility hidden button")
    public void i_click_on_the_visibility_hidden_button() {
        hiddenElementsPage.clickVisibilityHiddenElement();
    }

    @When("I click on the zero opacity button")
    public void i_click_on_the_zero_opacity_button() {
        hiddenElementsPage.clickZeroOpacityElement();
    }

    @Then("I should be presented with the successful click")
    public void i_should_be_presented_with_the_successful_click() {
        hiddenElementsPage.waitWebElementIsVisible(hiddenElementsPage.modalWindowTitle);
        String ActualMessageCongrats = hiddenElementsPage.modalWindowTitle.getText();
        Assert.assertEquals(ActualMessageCongrats, CONGRATS_MESSAGE);
    }

    @Then("I should be presented with the easy click")
    public void i_should_be_presented_with_the_easy_click() {
        hiddenElementsPage.waitWebElementIsVisible(hiddenElementsPage.modalWindowTitleEasy);
        String ActualMessageEasy = hiddenElementsPage.modalWindowTitleEasy.getText();
        Assert.assertEquals(ActualMessageEasy, THAT_EASY_MESSAGE);
    }

    @Then("I should be presented with the done click")
    public void i_should_be_presented_with_the_done_click() {
        hiddenElementsPage.waitWebElementIsVisible(hiddenElementsPage.modalWindowTitleDone);
        String ActualMessageEasy = hiddenElementsPage.modalWindowTitleDone.getText();
        Assert.assertEquals(ActualMessageEasy, THAT_DONE_MESSAGE);
    }
}
