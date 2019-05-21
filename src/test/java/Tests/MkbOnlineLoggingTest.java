package Tests;

import org.junit.Before;
import org.junit.Test;

import static Pages.MainPage.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class MkbOnlineLoggingTest {

    @Before
    public void setup (){
        browser = "chrome";
        baseUrl = "https://online.mkb.ru/";
    }

    @Test
    public void Test() {
        open("/");
        submitButton.shouldBe(enabled);
        doInvalidLogin3Times();
        checkErrorAfter3UnsuccessfulTry();
    }
    // After метод не нужен, т.к. Selenide сам закрывает драйвер по завершению теста


}

