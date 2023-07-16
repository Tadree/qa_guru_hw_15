package ru.jiehk.autotests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/local.properties",
        "classpath:config/remote.properties"
})
public interface ProjectConfig extends Config {

    @DefaultValue("chrome")
    String browser();
    @DefaultValue("110.0")
    String browserVersion();
    @DefaultValue("1920x1080")
    String browserSize();
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    String remoteDriverUrl();
    @DefaultValue("https://selenoid.autotests.cloud/video/")
    String videoStorage();
}
