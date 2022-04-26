package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3- Test if driver is working
        driver.get("https://www.tesla.com");


        // stop code execution for 3 seconds
        Thread.sleep(1000);

        // use selenium to navigate back
        driver.navigate().back();

        Thread.sleep(1000);

        // use selenium to navigate back
        driver.navigate().forward();
        Thread.sleep(1000);
        // use selenium to navigate back
        driver.navigate().refresh();

        Thread.sleep(1000);
        // use selenium to navigate back
        driver.navigate().to("https://www.google.com");

        System.out.println(driver.getTitle());


        //driver close
        driver.close();

    }

}
