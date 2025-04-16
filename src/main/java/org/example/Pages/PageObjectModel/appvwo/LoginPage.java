package org.example.Pages.PageObjectModel.appvwo;


import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Page Class
public class LoginPage {

    WebDriver driver;

    // Parameterized Constructor
    public LoginPage(WebDriver driver){
        // whatever driver u give me I will set it to my own driver.
        this.driver =driver;
    }

    // Step 1 - Page Locators
    // Every locator are private

    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");


    // Step 2 -Page Actions
    // Creating a Functions


    public String LoginToVWOLoginInvalidCreds(String user, String pswd){

        driver.get("https://app.vwo.com");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pswd);
        driver.findElement(signButton).click();

        // Expicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(error_message));


          // We will get error message
        String error_message_text = driver.findElement(error_message).getText();
        return error_message_text;

    }

    public String LoginToVWOLoginValidCreds(String user, String pswd){
        return null;
    }
























}
