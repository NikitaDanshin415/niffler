package niffler.config.app;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "classpath:config/appConfig.properties"
})
public interface AppConfig extends Config {
    String urlUi();

    String urlApi();
}