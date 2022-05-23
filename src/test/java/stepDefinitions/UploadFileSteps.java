package stepDefinitions;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pageObject.pages.UploadFilePage;

import static constants.messages.Messages.UploadFileMessagesFailed.EXPECTED_MESSAGE_FAILED;
import static constants.messages.Messages.UploadFileMessagesSuccess.EXPECTED_MESSAGE_SUCCESSFUL;
import static constants.paths.FilePaths.Paths.PATH_TO_FILE;
import static constants.urls.Urls.Pages.FILE_UPLOAD_PAGE;

public class UploadFileSteps {

    UploadFilePage uploadFilePage = new UploadFilePage();

    @Given("I access the webdriver university Upload file Page")
    public void i_access_the_webdriver_university_upload_file_page() {
        uploadFilePage.navigateTo(FILE_UPLOAD_PAGE);
    }

    @When("I choice the file by entering file path")
    public void i_choice_the_file_by_entering_file_path() {
        uploadFilePage.selectFileForLoad(PATH_TO_FILE);

    }
    @And("I click on the button Send")
    public void i_click_on_the_button_send() {
        uploadFilePage.clickUploadButton();

    }
    @Then("I should be presented with the successful upload file")
    public void i_should_be_presented_with_the_successful_upload_file() {
       uploadFilePage.waitAlertIsPresent();
       String ActualMessageSuccess = DriverFactory.getDriver().switchTo().alert().getText();
       Assert.assertEquals(ActualMessageSuccess, EXPECTED_MESSAGE_SUCCESSFUL);
    }

    @Then("I should be presented with the failed upload file")
    public void i_should_be_presented_with_the_failed_upload_file() {
        uploadFilePage.waitAlertIsPresent();
        String ActualMessageFailed = DriverFactory.getDriver().switchTo().alert().getText();
        Assert.assertEquals(ActualMessageFailed, EXPECTED_MESSAGE_FAILED);
    }
}
