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

    public interface HiddenElements {
        String  NOT_DISPLAYED_ELEMENT = "//h2[text()='Not Displayed']",
                NOT_DISPLAYED_BUTTON = "//p[text()='CLICK ME!']",
                MODAL_TITLE_WINDOW_SUCCESS = "//h4[@class='modal-title']",
                MODAL_TITLE_WINDOW_EASY = "//h4[@class='modal-title'][text()='It’s that Easy!!  Well I think it is.....']",
                MODAL_TITLE_WINDOW_DONE = "//h4[@class='modal-title'][text()='Well done! the ']",
                VISIBILITY_HIDDEN_ELEMENT = "//h2[text()='Visibility Hidden']",
                VISIBILITY_HIDDEN_BUTTON = "button2",
                ZERO_OPACITY_ELEMENT = "//h2[text()='Zero Opacity']",
                ZERO_OPACITY_BUTTON = "button3";


    }
}
