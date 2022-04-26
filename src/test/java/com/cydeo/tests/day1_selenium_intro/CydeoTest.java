package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTest {
    public static void main(String[] args) throws InterruptedException {
        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3- Test if driver is working
        driver.get("https://www.cydeo.com");

        Thread.sleep(1000);

        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());

        driver.close();
    }
}
