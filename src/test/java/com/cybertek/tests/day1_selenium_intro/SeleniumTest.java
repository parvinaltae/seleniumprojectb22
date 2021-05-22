package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1 - setting up the web driver
        WebDriverManager.chromedriver().setup();

        //2 - creating the instance of a chrome driver
        WebDriver driver = new ChromeDriver();

        //3 - testing if driver is working
        driver.get("https://wwww.google.com");
    }
}
