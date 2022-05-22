package constants.webElements;

public class Locators {

    public interface LoginPage {
        String LOGIN_BUTTON = "//a[text()='Войти']",
               LOGIN_FORM = "//form[@method='post']",
               USER_NAME_FIELD = "//input[@name='username']",
               PASSWORD_FIELD = "//input[@name='password']",
               SUBMIT_BUTTON = "//button[@type='submit']",
               LOGOUT_BUTTON = "//a[text()='Выйти']",
               MESSAGE_USER_NOT_FOUND = "//li[text()='Такого пользователя нет']";



    }

}
