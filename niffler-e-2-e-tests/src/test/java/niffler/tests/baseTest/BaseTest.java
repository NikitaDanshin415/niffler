package niffler.tests.baseTest;

import niffler.config.Configure;
import niffler.jupiter.AroundSuiteExtension;
import niffler.jupiter.NifflerExtension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@ExtendWith({AroundSuiteExtension.class, NifflerExtension.class})
public abstract class BaseTest {

    @BeforeEach
    void beforeEach(){
        open("");
    }

    @BeforeAll
    public static void beforeAll(){
        new Configure().configure();
    }


    @AfterEach
    void afterEach(){
        closeWebDriver();
    }



}
