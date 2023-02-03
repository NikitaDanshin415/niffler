package niffler.tests;

import com.codeborne.selenide.Condition;
import niffler.tests.baseTest.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class NifflerLoginTest extends BaseTest {


    @Test
    void mainPageShouldBeDisplayedAfterSuccessLogin() {
        $("a[href*='redirect']").click();
        $("input[name=username]").setValue("Nikita");
        $("input[name=password]").setValue("12345");
        $("button[type=submit]").click();
        $("h1.header__title")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text("Niffler. The coin keeper."));
    }

}
