package pageObject.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

import static constants.locators.Locators.HiddenElements.*;

public class HiddenElementsPage extends BasePage {

    @FindBy(xpath = NOT_DISPLAYED_ELEMENT)
    protected WebElement notDisplayedElement;
    @FindBy(xpath = NOT_DISPLAYED_BUTTON)
    protected WebElement notDisplayedButton;
    @FindBy(xpath = VISIBILITY_HIDDEN_ELEMENT)
    protected WebElement visibilityHiddenElement;
    @FindBy(id = VISIBILITY_HIDDEN_BUTTON)
    protected WebElement visibilityHiddenButton;
    @FindBy(xpath = ZERO_OPACITY_ELEMENT)
    protected WebElement zeroOpacityElement;
    @FindBy(id = ZERO_OPACITY_BUTTON)
    protected WebElement zeroOpacityButton;

    @FindBy(xpath = MODAL_TITLE_WINDOW_SUCCESS)
    public WebElement modalWindowTitle;
    @FindBy(xpath = MODAL_TITLE_WINDOW_EASY)
    public WebElement modalWindowTitleEasy;
    @FindBy(xpath = MODAL_TITLE_WINDOW_DONE)
    public WebElement modalWindowTitleDone;

    public HiddenElementsPage() {
        super();
    }

    public void clickNotDisplayedElement() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", notDisplayedButton);
    }

    public void clickVisibilityHiddenElement() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", visibilityHiddenButton);
    }

    public void clickZeroOpacityElement() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", zeroOpacityButton);
    }

}
