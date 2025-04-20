package org.example.Pages.PageObjectModel.appvwo.improved_POM;

import org.example.base.CommonToAllPage;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonToAllPage {

    // Page Class
    // Page Locators

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    public String loginToVWOLoginInvalidCreds(String user, String pwd) {
        openVWOUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);
        WaitHelpers.presenceOfElement(error_message);

        return getText(error_message);

    }


    public void LoginToVWOLoginValidCreds(String user, String pswd) {
        openVWOUrl();
        enterInput(username,user);
        enterInput(password,pswd);
        clickElement(signButton);
    }
















}
