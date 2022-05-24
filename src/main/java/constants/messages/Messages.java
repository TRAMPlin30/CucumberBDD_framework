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

    public interface UploadFileMessagesSuccess {
        String EXPECTED_MESSAGE_SUCCESSFUL = "Your file has now been uploaded!";
    }

    public interface UploadFileMessagesFailed {
        String EXPECTED_MESSAGE_FAILED = "You need to select a file to upload!";
    }

    public interface HiddenClickMessage {
        String  CONGRATS_MESSAGE = "Congratulations!",
                THAT_EASY_MESSAGE = "It’s that Easy!! Well I think it is.....",
                THAT_DONE_MESSAGE = "Well done! the Action Move & Click can become very useful!";


    }


}
