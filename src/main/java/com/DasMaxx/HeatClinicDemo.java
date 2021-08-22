package com.DasMaxx;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HeatClinicDemo {

    public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();



            WebDriver driver = new ChromeDriver();driver.manage().window().maximize();

            driver.get ("https://demo.broadleafcommerce.org/");


            WebElement myElement = driver.findElement(By.xpath("//a[@href='/login']"));
            myElement.click();

            System.out.println("print here1");

            WebElement myElement_email = driver.findElement(By.id("username"));
            myElement_email.clear();
            myElement_email.sendKeys("");
            System.out.println("print here2");

            WebElement myElement_password = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
            myElement_password.sendKeys("");

            WebElement myElement_rememberMe = driver.findElement(By.xpath("(//span[@class='checkbox-material'])"));
            myElement_rememberMe.click();

            WebElement myElement_login = driver.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[1]"));
            myElement_login.click();
            Thread.sleep(5000);
            WebElement greenGhostAddCart = driver.findElement(By.xpath("//a[@href='/hot-sauces/green_ghost']/div"));
            greenGhostAddCart.click();
            Thread.sleep(5000);
            driver.switchTo().alert().accept();

            driver.findElement(By.xpath("(//div/button/span)[5]")).click();
            Thread.sleep(5000);
            System.out.println("print here3");
            driver.findElement(By.xpath("//a[@class='btn btn-primary goto-full-cart']")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[@href='/checkout']")).click();
            Thread.sleep(5000);

            String shipingText = driver.findElement(By.xpath("//*[@id='shippingInfo']/div/div[1]/h4/span")).getText();
            System.out.println("Shipping Text: " + shipingText);
            driver.quit();

        }
    }

