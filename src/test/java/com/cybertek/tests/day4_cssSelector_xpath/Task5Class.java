package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5Class {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx%22");
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification PASSED");
        } else {
            System.out.println("Verification FAILED");
        }

        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.sendKeys("Test");



        String expected = "Web Orders";
        String actual = driver.getTitle();
        if (actual.equals(expected)) {
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");
        }
    }
}
