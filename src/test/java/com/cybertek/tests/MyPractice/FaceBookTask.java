package com.cybertek.tests.MyPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTask {
    public static void main(String[] args) throws InterruptedException {
        //1. Open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to facebook.com
        driver.get("https://www.facebook.com");
        //3. Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("invalid@gmail.comm" + Keys.TAB+ " invalidkaljfgdksjf" + Keys.ENTER);
        //4. Enter incorrect password
        //driver.findElement(By.id("pass")).sendKeys("invalidakljgksjf" + Keys.ENTER);
        //5. Verify Title
        Thread.sleep(5000);// freezing the code for 5 secs so that chrome browser can catch up with loading the page
        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }
    }
}
