package com.DasMaxx;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HeatClinicDemo3 {
    private static ExpectedConditions ExceptedConditions;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(100);
        driver.manage().window().minimize();
        Thread.sleep(100);
        driver.manage().window().maximize();

        driver.get ("https://demo.broadleafcommerce.org/");

        WebElement myElement = driver.findElement(By.xpath("//a[@href='/login']"));
        myElement.click();
        Thread.sleep(100);

        WebElement emailElement = driver.findElement(By.xpath("//input[@type='email']"));
        emailElement.sendKeys("jmc7772@gmail.com");
        emailElement.click();
        Thread.sleep(100);

        WebElement pwElement = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        pwElement.sendKeys("Heat12345");
        Thread.sleep(100);

        WebElement myElement_rememberMe = driver.findElement(By.xpath("(//span[@class='checkbox-material'])"));
        myElement_rememberMe.click();

        WebElement myElement_login = driver.findElement(By.xpath("(//button[@class='btn btn-primary pull-right'])[1]"));
        myElement_login.click();
        Thread.sleep(100);
        WebElement greenGhostAddCart = driver.findElement(By.xpath("//a[@href='/hot-sauces/green_ghost']/div"));
        greenGhostAddCart.click();
        Thread.sleep(100);
        driver.switchTo().alert().accept();

       // WebDriverWait wait = new WebDriverWait(driver);
      //  WebElement loginButton = wait.until(ExceptedConditions.visibilityOfElementLocated(
             //   By.xpath("//a[@class='btn btn-primary goto-full-cart']")));
       // loginButton.click();


       // JavascriptExecutor js = (JavascriptExecutor) driver;
      //  WebElement loginButton = driver.findElement(By.xpath("//a[@class='btn btn-primary goto-full-cart']"));
      //  js.executeScript("argument[0].click();", btn btn-primary goto-full-cart);

        driver.findElement(By.xpath("(//div/button/span)[5]")).click();
        Thread.sleep(100);
        System.out.println("print here3");
        driver.findElement(By.xpath("//a[@class='btn btn-primary goto-full-cart']")).click();
        Thread.sleep(100);
        driver.findElement(By.xpath("//a[@href='/checkout']")).click();
        Thread.sleep(100);

      String shipingText = driver.findElement(By.xpath("//*[@id='shippingInfo']/div/div[1]/h4/span")).getText();
       System.out.println("Shipping Text: " + shipingText);

        driver.findElement(By.xpath("(//li[@class='dropdown'])[3]")).click();
        Thread.sleep(100);

        WebElement checkoutCart = driver.findElement(By.xpath("//a[@href='/checkout']"));
        checkoutCart.click();
        Thread.sleep(100);

        WebElement checkoutCartTwo = driver.findElement(By.xpath("//a[@href='/checkout']"));
        checkoutCartTwo.click();
        Thread.sleep(100);


        WebElement pmtFullNameElement = driver.findElement(By.xpath("(//input[@id='fullName'])[1]"));
        pmtFullNameElement.sendKeys("JD Das");
        Thread.sleep(100);

        WebElement pmtAdressLineElement = driver.findElement(By.xpath("(//input[@id='addressLine1'])[1]"));
        pmtAdressLineElement.sendKeys("420 BS Street");
        Thread.sleep(100);

        WebElement pmyCityElement = driver.findElement(By.xpath("(//input[@id='city'])[1]"));
        pmyCityElement.sendKeys("CrazyCity");
        Thread.sleep(100);

        WebElement pmtPostalCodeElement = driver.findElement(By.xpath(" (//input[@id='postalCode'])[1]"));
        pmtPostalCodeElement.sendKeys("55125");
        Thread.sleep(100);

        WebElement pmtPhoneNumberElement = driver.findElement(By.xpath("(//input[@id='phonePrimary'])[1]"));
        pmtPhoneNumberElement.sendKeys("6512223333");
        Thread.sleep(100);

        WebElement pmtCheckBoxElement = driver.findElement(By.xpath("//span[@class='checkbox-material']"));
        pmtCheckBoxElement.click();
        Thread.sleep(100);

        //WebElement pmtStateElement = driver.findElement(By.xpath("//select[@id='stateProvinceRegion']"));
        //pmtStateElement.sendKeys("MN");
       // Thread.sleep(100);

        WebElement stateElementDropDown = driver.findElement(By.id("//select[@id='stateProvinceRegion']"));
        Select state = new Select(stateElementDropDown);
        state.selectByVisibleText("MN");
        stateElementDropDown.click();
        Thread.sleep(100);

        WebElement pmtCreditCardElement = driver.findElement(By.xpath("//a[@href='#CreditCard']"));
        pmtCreditCardElement.click();
        Thread.sleep(100);

        driver.findElement(By.linkText("Place Your Order</span"));
        Thread.sleep(100);

       /* WebElement orderConfermationElement = driver.findElement(By.xpath("//h3[@span'202108241520213033337']"));
        orderConfermationElement.sendKeys("MN");
        Thread.sleep(100);

        */

        driver.quit();


    }
}
