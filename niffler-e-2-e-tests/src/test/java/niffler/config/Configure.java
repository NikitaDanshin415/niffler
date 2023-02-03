package niffler.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import niffler.config.app.AppConfigProvider;
import niffler.config.appWebDriver.AppWebDriverConfigProvider;
import org.openqa.selenium.remote.DesiredCapabilities;

import static java.lang.String.format;

public class Configure {
    public void configure() {
        Configuration.browser = AppWebDriverConfigProvider.AppConfigWebDriver.browser();
        Configuration.baseUrl = AppConfigProvider.appConfig.urlUi();
        RestAssured.baseURI = AppConfigProvider.appConfig.urlApi();

        if (AppWebDriverConfigProvider.AppConfigWebDriver.isRemote()) {
            configureSelenoid();
        }

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    public void configureApi() {
        RestAssured.baseURI = AppConfigProvider.appConfig.urlApi();
    }

    private void configureSelenoid() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

        Configuration.remote = format("https://%s:%s@%s/wd/hub",
                AppWebDriverConfigProvider.AppConfigWebDriver.remoteLogin(),
                AppWebDriverConfigProvider.AppConfigWebDriver.remotePassword(),
                AppWebDriverConfigProvider.AppConfigWebDriver.remoteDriverUrl()
        );
    }
}
