package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        // 1. Set up the browser driver
        WebDriverManager.chromedriver().setup();
        // 2. Create instance of selenium web driver, opens the browser
        WebDriver driver = new ChromeDriver();
        // 3. get the page for Tesla.com
        driver.get("https://www.tesla.com");
        System.out.println("Current title: " + driver.getTitle());

        // Going back using Navigations
        Thread.sleep(3000);
        driver.navigate().back();
        //Going forward
        Thread.sleep(3000);
        driver.navigate().forward();
        // Going back using Navigations
        Thread.sleep(3000);
        // refreshing page using navigations
        driver.navigate().refresh();
        // going to Tesla then google
        driver.navigate().to("https://www.google.com");
        //
        System.out.println("Current title: " + driver.getTitle());
        String currentUrl = driver.getCurrentUrl(); // store in string
        System.out.println("Current url: " + driver.getCurrentUrl());

        driver.manage().window().maximize();

        // will close 1 browser
        driver.close();


    }
}
