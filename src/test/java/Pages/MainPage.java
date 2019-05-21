package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class MainPage {

    public final static SelenideElement loginField = $(By.id("txtLogin"));
    public final static SelenideElement passwordField = $(By.id("txtPassword"));
    public final static SelenideElement submitButton = $(By.id("btnLoginStandard"));
    public final static SelenideElement errorMessage = $(By.id("errMessage"));

    static final private String login = "Avtotest";
    static final private String password = "123456";

    public static void doInvalidLogin() {

        loginField.setValue(login);
        passwordField.setValue(password);
        submitButton.shouldBe(enabled).click();
    }

    public static void causeLogingError() {
        for (int i = 0; i < 3; i++) {
            doInvalidLogin();
        }
    }

    public static void checkErrorAfter3UnsuccessfulTry() {
        errorMessage.shouldHave(text("Вы ввели неправильный логин / пароль 3 раза. В целях безопасности вход в систему ограничен."));
    }
}
