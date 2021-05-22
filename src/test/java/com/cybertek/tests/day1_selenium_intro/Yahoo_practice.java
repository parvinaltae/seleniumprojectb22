package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");
        System.out.println(driver.getTitle());

        String expectedTitle = "Yahoo";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is expected, Verification Passed");
        } else {
            System.out.println("Title is not as expected. Verification Failed. ");
        }
        driver.close();
    }
}
