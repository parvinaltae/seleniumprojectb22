package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_findElements_practice {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // If a web element is not found, this will wait up to given seconds
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // WE NEED TO CREATE A LOCATOR THAT RETURNS TO US ALL THE LINKS ON THE PAGE
        //body//a --> this locator will return all of the links of the page
        List <WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        //3. Print out the texts of all links
        for (WebElement each:listOfLinks) { // iter for shortcut
            System.out.println(each.getText());
        }
        //4. Print out how many total link
        int numberOfLinks = listOfLinks.size();
        System.out.println("numberOfLinks = "+ numberOfLinks);
    }
}
