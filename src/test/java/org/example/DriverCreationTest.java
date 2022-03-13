package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DriverCreationTest {
    private static final Logger LOGGER = LogManager.getLogger(DriverCreationTest.class);
    private final static int TASKS = 30;

    @Test
    public void selenium4() throws ExecutionException, InterruptedException {
        parallel_test("http://localhost:4444/");
    }

    @Test
    public void selenium3() throws ExecutionException, InterruptedException {
        parallel_test("http://localhost:6444/wd/hub");
    }



    public void parallel_test(String host) throws InterruptedException, ExecutionException {
        var executor = Executors.newFixedThreadPool(TASKS);
        var results = new ArrayList<Future>();
        for (var i = 0; i < TASKS; i++) {
            results.add(executor.submit(() -> openDriver(host)));
        }
        for (var result : results) {
            result.get();
        }
    }


    private void openDriver(String host) {
        try {
            Date now = new Date();
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(true);
            var driver = new RemoteWebDriver(new URL(host), options);
            for (var i = 0; i < 10; i++) {
                driver.get("https://ifconfig.co");
            }
            LOGGER.info("Driver opened in {} ms", new Date().getTime() - now.getTime());
            driver.quit();
        } catch (Exception e) {
            LOGGER.error("Error", e);
            throw new RuntimeException(e);
        }
    }

}
