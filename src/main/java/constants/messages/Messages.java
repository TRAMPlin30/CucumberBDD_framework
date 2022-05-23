package constants.messages;

import pageObject.pages.ContactUsPage;

public class Messages {

    public interface LoginMessagesSuccess {
        String EXPECTED_MESSAGE_SUCCESS_LOGIN = "validation succeeded";
    }

    public interface LoginMessagesFailed {
        String EXPECTED_MESSAGE_FAILED_LOGIN = "validation failed";
    }

    public interface ContactUsMessages {
        String ActualMessage = ContactUsPage.messageThankYou.getText(),
               EXPECTED_MESSAGE_THANK_YOU = "Thank You for your Message!";
    }
}
