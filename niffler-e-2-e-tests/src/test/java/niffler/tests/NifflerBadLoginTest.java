package niffler.tests;

import com.codeborne.selenide.Condition;
import niffler.tests.baseTest.BaseTest;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class NifflerBadLoginTest extends BaseTest {


    @Test
    void mainPageShouldBeNotDisplayedAfterUnSuccessLogin() {
        $("a[href*='redirect']").click();
        $("input[name=username]").setValue("NotNikita");
        $("input[name=password]").setValue("12345");
        $("button[type=submit]").click();
        $("p.form__error")
                .shouldBe(Condition.visible)
                .shouldHave(Condition.text("Неверные учетные данные пользователя"));
    }
}
