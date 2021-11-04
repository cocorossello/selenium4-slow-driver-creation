package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class DriverCreationTest {
    private static final Logger LOGGER = LogManager.getLogger(DriverCreationTest.class);


    @Test
    public void selenium3_hub() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        for (var i = 0; i < 3; i++) {
            Date now =new Date();
            var driver = new RemoteWebDriver(new URL("http://localhost:5444/wd/hub/"), options);
            LOGGER.info("Selenium 3 Opened in {} ms", new Date().getTime() - now.getTime());
            driver.quit();
        }
    }


    @Test
    public void selenium4_hub() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        for (var i = 0; i < 3; i++) {
            Date now =new Date();
            var driver = new RemoteWebDriver(new URL("http://localhost:4444/"), options);
            LOGGER.info("Selenium 4 Opened in {} ms", new Date().getTime() - now.getTime());
            driver.quit();
        }
    }

}
