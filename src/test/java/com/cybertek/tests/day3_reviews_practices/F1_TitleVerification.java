package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        if(!actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }
    }
    }

