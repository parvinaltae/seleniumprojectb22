package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHEaderTextVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        // verify header text
        //Expected: "Log in to ZeroBank"
        // 1. Locate the web element
                //2. get the text of it using getText() method
        String expectedHeader = "Log in to ZeroBank";
        WebElement actualHeader = driver.findElement(By.tagName("h3"));// alternative way
        // so it's reusable

        String actualHeaderText = driver.findElement(By.tagName("h3")).getText();

        if(expectedHeader.startsWith(actualHeaderText)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
    }
}
