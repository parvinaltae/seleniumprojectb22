package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) {
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //2.Go to https://practice.cybertekschool.com/
        driver.get("http://practice.cybertekschool.com/");

        //3.Verify URL contains
        // Expected: cybertekschool
        String expectedUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("URL is as expected. Verification PASSED!");
        } else {
            System.out.println("URL is not as expected. Verification FAILED!");
        }


        //4.Verify title:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        //creating our verification
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected. Verification PASSED!");
        } else {
            System.out.println("Title is not as expected. Verification FAILED!");
        }

        //closing the browser
        driver.close();
    }
}
