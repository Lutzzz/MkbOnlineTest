package Pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.*;



public class MainPage {

    @FindBy (id = "txtLogin") private SelenideElement loginField;
    @FindBy (id = "txtPassword") private SelenideElement passwordField;
    @FindBy (id = "btnLoginStandard") private SelenideElement submitButton;
    @FindBy (css = ".errmsg.login-password") private SelenideElement errorMessage;
    @FindBy (css = ".errmsg.login2") private SelenideElement authentificationError;


    private String login = "Avtotest";
    private String password = "123456";

    public void doInvalidLogin() {

        loginField.setValue(login);
        passwordField.setValue(password);
        submitButton.shouldBe(enabled).click();

    }

    public void causeLogingError() {
        for (int i = 0; i < 2; i++) {
            doInvalidLogin();
            authentificationError.shouldBe(visible);
        }
        doInvalidLogin();
    }

    public void checkError() {
        errorMessage.shouldHave(text("Вы ввели неправильный логин / пароль 3 раза"));
    }
}
