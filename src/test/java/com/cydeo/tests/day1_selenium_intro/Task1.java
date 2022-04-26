package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        //1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3- Test if driver is working
        driver.get("https://www.yahoo.com");

        String expectedTitle = "Yahoo is part of the Yahoo family of brands";

        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("It is corret"+"\n" + "Actual title = " + "*** "+actualTitle+" ***");
        }else {
            System.out.println("Something is wrong");
        }


        driver.close();
    }
}


/*
TC #1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com
3. Verify title:
Expected: Yahoo
 */