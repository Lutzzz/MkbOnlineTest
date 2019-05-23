package Tests;

import ConciseApi.BaseTest;
import Pages.MainPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class MkbOnlineLoggingTest extends BaseTest {

    @Test
    public void testBlockMessage() {
        MainPage mainPageInstance = open("/",MainPage.class);
        mainPageInstance.causeLogingError();
        mainPageInstance.checkError();
    }

}

