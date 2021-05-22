package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:www.etsy.com");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+
                Keys.ENTER);

        String expectedInTitle = ("Wooden spoon | Etsy");
        String actualTitle = driver.getTitle();
        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failed!");}
    }
}
