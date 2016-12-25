package com.github.drquiz.tests;

import com.github.drquiz.config.ConfigReader;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    protected String webappUrl;

    @Before
    public void setUp() {
        ConfigReader configReader = new ConfigReader();
        System.setProperty("webdriver.gecko.driver", configReader.getProperties().getProperty("webdriver.chrome.driver"));
        webappUrl = configReader.getProperties().getProperty("webapp.url");
        open(webappUrl);
    }

}
