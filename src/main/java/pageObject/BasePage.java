package pageObject;

import drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BasePage {

    public WebDriver driver = DriverFactory.getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void sendValue(WebElement element, String text) {
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public void waitWebElementIsVisible(WebElement element){
        Wait<WebDriver> waiter = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2));
        waiter.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitButtonIsActive(WebElement button){
        button.isEnabled();
    }
}
