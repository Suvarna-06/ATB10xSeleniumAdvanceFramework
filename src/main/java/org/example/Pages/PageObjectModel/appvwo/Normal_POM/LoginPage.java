package org.example.Pages.PageObjectModel.appvwo.Normal_POM;


import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Page Class
public class LoginPage {

    WebDriver driver;

    // Parameterized Constructor
    public LoginPage(WebDriver driver) {
        // whatever driver u give me I will set it to my own driver.
        this.driver = driver;
    }

    // Step 1 - Page Locators
    // Every locator are private

    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");


    // Step 2 -Page Actions
    // Creating a Functions


    public String loginToVWOLoginInvalidCreds(String user, String pwd) {

        driver.get("https://app.vwo.com");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();

        // Wait - Thread sleep
        WaitHelpers.waitJVM(5000);
        // Wait - Explicit Wait
//        WaitHelpers.checkVisibility(driver,error_message);


        // We will get error message
        String error_message_text = driver.findElement(error_message).getText();
        return error_message_text;
    }

    public void LoginToVWOLoginValidCreds(String user, String pswd) {

        driver.get("https://app.vwo.com");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pswd);
        driver.findElement(signButton).click();

        // Wait - Thread sleep
        WaitHelpers.waitJVM(5000);
        // Wait - Explicit Wait
//        WaitHelpers.checkVisibility(driver,error_message);
    }
}
