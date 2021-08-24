package com.DasMaxx;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HeatClinicDemo {

    public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get ("https://demo.broadleafcommerce.org/");

            WebElement myElement = driver.findElement(By.xpath("//a[@href='/login']"));
            myElement.click();
            Thread.sleep(500);

           WebElement regisrationFormElement = driver.findElement(By.xpath("//form[@id='registrationForm']"));
           regisrationFormElement.click();
           Thread.sleep(1000);

           WebElement emailElement = driver.findElement(By.id("customer.emailAddress"));
           emailElement.sendKeys("jmc7772@gmail.com");
           Thread.sleep(500);

            WebElement firstnameElement = driver.findElement(By.id("customer.firstName"));
            firstnameElement.sendKeys("JD");
            Thread.sleep(500);

            WebElement lastnameElement = driver.findElement(By.id("customer.lastName"));
            lastnameElement.sendKeys("Das");
            Thread.sleep(500);

            WebElement pwElement = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
            pwElement.sendKeys("Heat12345");
            Thread.sleep(500);

            WebElement cpwElement = driver.findElement(By.xpath("(//input[@type='password'])[3]"));
            cpwElement.sendKeys("Heat12345");
            Thread.sleep(500);

            WebElement regElement = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
            regElement.click();
            Thread.sleep(500);

            driver.quit();

        }
    }

