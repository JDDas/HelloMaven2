package com.DasMaxx;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TestNG {
    static WebDriver driver;
    static String email = "JD@gmail.com";
    static String expectedRegText = "Don't have an account yet? Sign up for one now to gain access to all our member tools.";
    static String firstName = "JD";
    static String lastName = "Das";



    @Test
    public void registerPage() throws InterruptedException {
        System.out.println("TestNG Practice");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.get("https://demo.broadleafcommerce.org/");
        WebElement loginBtn = driver.findElement(By.xpath("//a[@href ='/login']"));
        loginBtn.click();

        WebElement actualTextElement = driver.findElement(By.xpath("//*[@id='register']/p"));
        String actualText = actualTextElement.getText();
        System.out.println(actualText);

        Assert.assertEquals(actualText,expectedRegText);


        WebElement registerEmailInput = driver.findElement(By.xpath("//input[@id='customer.emailAddress']"));
        registerEmailInput.sendKeys(email);

        WebElement firstNameInput = driver.findElement(By.id("customer.firstName"));
        firstNameInput.sendKeys(firstName);


        WebElement lastNameInput = driver.findElement(By.name("customer.lastName"));
        lastNameInput.sendKeys(lastName);

        List<WebElement> passList = driver.findElements(By.id("password"));
        WebElement passwordInput = passList.get(1);
        passwordInput.sendKeys("abcd123");

        WebElement conPasswordInput = driver.findElement(By.id("passwordConfirm"));
        conPasswordInput.sendKeys("abcd123");

    //@Test
   // public void registerPageTest() throws InterruptedException{
        List<WebElement> submitList = driver.findElements(By.xpath("//button[@type='submit']"));
        WebElement registerBtn = submitList.get(2);
        Thread.sleep(100);
        registerBtn.click();
        Thread.sleep(3000);

        String uName = driver.findElement(By.xpath("//*[@id='sectionsNav']/div/div[1]/ul[2]/li[1]/a")).getText();
        System.out.println(uName);
        driver.quit();
        System.out.println("Registration Completed!!!");

    }
}
