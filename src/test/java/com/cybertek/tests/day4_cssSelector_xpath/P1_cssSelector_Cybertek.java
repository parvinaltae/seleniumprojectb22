package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector(""));
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));// forgot PW header
        WebElement emailLabel = driver.findElement(By.cssSelector("<label for='email'>E-mail</label>")); // E-mail text
        WebElement inputBox = driver.findElement(By.cssSelector("input[name='email']")); // E-mail input box
        WebElement passwordButton = driver.findElement(By.cssSelector("button[id='form_submit']")); // Password Button
        WebElement poweredByText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //Verify all WEbElements are displayed
        System.out.println("homeLink = " + homeLink);
        System.out.println(homeLink.isDisplayed());
        System.out.println("forgot password = " + forgotPasswordHeader.isDisplayed());





    }
}
