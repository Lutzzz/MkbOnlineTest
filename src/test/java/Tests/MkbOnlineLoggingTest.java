package Tests;

import Pages.MainPage;
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;

public class MkbOnlineLoggingTest {


    @Before
    public void setUp (){
        browser = "chrome";
        baseUrl = "https://online.mkb.ru";
        open("/");
    }

    @Test
    public void test() {
        MainPage mainPageInstance = Selenide.page(MainPage.class);
        mainPageInstance.causeLogingError();
        mainPageInstance.checkError();
    }
    // After метод не нужен, т.к. Selenide сам закрывает драйвер по завершению теста


}

