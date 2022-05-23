package constants.locators;

public class Locators {

    public interface Login {
        String USER_NAME_FIELD = "text",
                PASSWORD_FIELD = "password",
                LOGIN_BUTTON = "login-button";
    }

    public interface ContactUs {
        String  FIRST_NAME_FIELD = "//input[@name='first_name']",
                LAST_NAME_FIELD = "//input[@name='last_name']",
                EMAIL_FIELD = "//input[@name='email']",
                COMMENT_FIELD = "//textarea[@name='message']",
                SUBMIT_BUTTON = "//input[@value='SUBMIT']",
                MESSAGE_THANK_YOU = "//div[@id='contact_reply']/h1";
    }

    public interface UploadFile {
        String  UPLOAD_FILE_PATH_INPUT = "//input[@id='myFile']",
                BUTTON_LOAD_FILE = "//input[@id='submit-button']";

    }
}
