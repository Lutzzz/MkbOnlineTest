package ConciseApi;

import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;

public class BaseTest {

    @Before
    public void setUp (){
        browser = "chrome";
        baseUrl = "https://online.mkb.ru";
    }

    @After
    public void tearDown(){
       // В данном случае метод не нужен, т.к. Selenide сам управляет драйвером - инициализирует в начале  и закрывает в конце теста.
    }
}
