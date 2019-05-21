package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.net.PasswordAuthentication;

import static com.codeborne.selenide.Condition.*;

public class MainPage {

    private final static SelenideElement loginButton = Selenide.$("asd");
    private final static SelenideElement loginField= Selenide.$("bla");
    private final static SelenideElement passwordField= Selenide.$("bla");
    private final static SelenideElement submitField= Selenide.$("bla");

    public static void doLogin(){

        loginButton.shouldBe(enabled).click();
        loginField.shouldBe(enabled).val("");
        passwordField.shouldBe(enabled).val("");
        passwordField.shouldHave(Condition.text());
        submitField.shouldBe(enabled).click();
    }

}
