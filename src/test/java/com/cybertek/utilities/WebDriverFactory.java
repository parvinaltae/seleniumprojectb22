package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static void main(String[] args) {
        getDriver("Chrome");
    }

    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        } else if (browserType.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            return driver;
        } else {
            System.out.println("Browser does not exist");
            return null;
        }
    }
}
