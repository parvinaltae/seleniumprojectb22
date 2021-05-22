package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("apple"); // find name
        driver.findElement(By.linkText("Gmail")).click();

        String expectedTitle = "Gmail";

        if (driver.getTitle().contains(expectedTitle)) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
        driver.navigate().back();
        String newTitle = "Google";
        if (driver.getTitle().equals(newTitle)) {
            System.out.println("Test PASSED!");
        } else {
            System.out.println("Test FAILED!");
        }
        driver.quit();
    }
}
