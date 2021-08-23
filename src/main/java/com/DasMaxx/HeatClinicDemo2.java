package com.DasMaxx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeatClinicDemo2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is another test for the HeatClinic");


        System.setProperty("webdriver.gecko.driver","/Users/biplob/Downloads/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.apache.org/");

        Thread.sleep(5000);

        System.out.println("I am from Texas...");
        driver.quit();
    }
}
