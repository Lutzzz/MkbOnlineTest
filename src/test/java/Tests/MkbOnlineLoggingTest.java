package Tests;

import Pages.MainPage;
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

    }

    @Test
    public void test() {
        MainPage mainPageInstance = open("/",MainPage.class);
        mainPageInstance.causeLogingError();
        mainPageInstance.checkError();
    }


}

