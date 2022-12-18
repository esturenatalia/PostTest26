package com.juaracoding.cucumber.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver",  "E:\\software\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
