package pageObject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

import static constants.locators.Locators.UploadFile.*;

public class UploadFilePage extends BasePage {

    @FindBy(xpath = UPLOAD_FILE_PATH_INPUT)
    protected WebElement upLoadFilePathInput;
    @FindBy(xpath = BUTTON_LOAD_FILE)
    protected WebElement buttonLoadFile;

    public UploadFilePage() {
        super();
    }

    public void selectFileForLoad(String path) {
        waitWebElementIsVisible(upLoadFilePathInput);
        upLoadFilePathInput.sendKeys(path);
    }

    public void clickUploadButton() {
        waitWebElementIsVisible(buttonLoadFile);
        waitWebElementIsClickable(buttonLoadFile);
        clickElement(buttonLoadFile);
    }
}
