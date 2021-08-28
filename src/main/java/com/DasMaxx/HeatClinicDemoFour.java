package com.DasMaxx;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HeatClinicDemoFour {
    private static Object WebElement;

    public static void main(String [] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://demo.broadleafcommerce.org/");
        WebElement myElement = driver.findElement(By.xpath("//a[@href='/login']"));
        myElement.click();
        seleniumWait();
        //clickElement(WebElement element);

        System.out.println("print here1");


        WebElement myElement_email = driver.findElement(By.id("username"));
        WebElement myElement_password = driver.findElement(By.xpath("(//input[@id='password'])[1]"));
        WebElement myElement_rememberMe = driver.findElement(By.xpath("(//span[@class='checkbox-material'])"));
        WebElement myElement_login = driver.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[1]"));
        WebElement greenGhostAddCart = driver.findElement(By.xpath("//a[@href='/hot-sauces/green_ghost']/div"));
        WebElement FullnameLink = driver.findElement(By.xpath("//input[@id='fullName']"));
        WebElement AddressLink = driver.findElement(By.xpath("//input[@id='addressLine1']"));
        WebElement Address2Link = driver.findElement(By.xpath("//input[@id='addressLine2']"));
        WebElement CityLink = driver.findElement(By.xpath("//input[@id='city']"));
        WebElement PostalCode = driver.findElement(By.xpath("//input[@id='postalCode']"));
        WebElement PhoneNum = driver.findElement(By.xpath("//input[@id='phonePrimary']"));
        WebElement shipping = driver.findElement(By.xpath("//label[normalize-space()='Standard (5 - 7 Days)']"));
        WebElement CardNumber = driver.findElement(By.xpath("//input[@id='cardNumber']"));
        WebElement CVVLink = driver.findElement(By.xpath("//input[@id='securityCode']"));








        myElement_email.clear();
        myElement_email.sendKeys("jmc7772@gmail.com");
        System.out.println("print here2");


        myElement_password.sendKeys("Heat12345");


        myElement_rememberMe.click();


        myElement_login.click();
        Thread.sleep(3000);
        greenGhostAddCart.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("(//div/button/span)[5]")).click();
        Thread.sleep(3000);
        System.out.println("print here3");
        driver.findElement(By.xpath("//a[@class='btn btn-primary goto-full-cart']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@href='/checkout']")).click();
        Thread.sleep(3000);

        String shipingText = driver.findElement(By.xpath("//*[@id='shippingInfo']/div/div[1]/h4/span")).getText();
        System.out.println("Shipping Text: " + shipingText);

        FullnameLink.click();
        FullnameLink.sendKeys("JD Das");
        Thread.sleep(3000);

        AddressLink.click();
        AddressLink.sendKeys("1 Crazy Rd");
        Thread.sleep(3000);

        Address2Link.clear();
        Address2Link.sendKeys("Apt 1");
        Thread.sleep(3000);

        CityLink.clear();
        CityLink.sendKeys("Eagan");
        Thread.sleep(3000);

        Select se = new Select(driver.findElement(By.xpath("//select[@id='stateProvinceRegion']")));
        se.selectByVisibleText("MN");
        Thread.sleep(3000);

        PostalCode.clear();
        PostalCode.sendKeys("55125");
        Thread.sleep(3000);

        PhoneNum.clear();
        PhoneNum.sendKeys("651222333");
        Thread.sleep(3000);

        shipping.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='checkbox use-shipping-address-wrapper']//span[@class='check']")).click();
        Thread.sleep(3000);

        CardNumber.clear();
        CardNumber.sendKeys("3794456412341234");
        Thread.sleep(3000);

        CVVLink.clear();
        CVVLink.sendKeys("222");
        Thread.sleep(3000);

        WebElement ExpLink = driver.findElement(By.xpath("//input[@id='cardExpDate']"));
        ExpLink.clear();
        ExpLink.sendKeys("10/22");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='col-sm-4 checkout-stage-action']//a[@class='btn btn-primary pull-right js-performCheckout']")).click();
        Thread.sleep(3000);

        String ConfirmationText = driver.findElement(By.xpath("//span[normalize-space()='Order Confirmation #']")).getText();
        System.out.println("Order Confirmation # " + ConfirmationText);
        Thread.sleep(3000);


        driver.quit();

    }
    public static void seleniumWait() throws InterruptedException {
        Thread.sleep(3000);
    }

    public static void clickElement(WebElement element) {
        element.click();

    }
    }
