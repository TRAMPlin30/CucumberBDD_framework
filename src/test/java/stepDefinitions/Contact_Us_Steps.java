package stepDefinitions;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static constants.urls.Urls.Pages.CONTACT_US_PAGE;
import static drivers.DriverFactory.getDriver;

public class Contact_Us_Steps {

    private WebDriver driver = getDriver();

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
       driver.get(CONTACT_US_PAGE);
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("John");
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        driver.findElement(By.xpath("//input[@name='last_name']555")).sendKeys("Wick");
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("john_wick@example.com");
    }
    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Hello my friends");
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name_joe(String firstName) {
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
    }
    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name_blogs(String lastName) {
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastName);
    }
    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address_joe_blogs_example_com(String emailAddress) {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailAddress);
    }
    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String string) {
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(string);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
        driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        WebElement message_ThankYou = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        Assert.assertEquals(message_ThankYou.getText(), "Thank You for your Message!");
    }
}
