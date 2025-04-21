package org.example.Pages.PageObjectModel.orangeHRM;

import org.example.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.utils.WaitHelpers.waitJVM;

public class LoginPage_OrangeHRM_POM extends CommonToAllPage {

    WebDriver driver;
    public LoginPage_OrangeHRM_POM(WebDriver driver){
        this.driver = driver;
    }

    // Page Locators
    private By username = By.xpath("//input[@placeholder='Username']");
    private By password = By.xpath("//input[@placeholder='Password']");
    private By submit_btn = By.xpath("//button[normalize-space()='Login']");


    // Page Action
    public void loginToHRMCreds(String user, String pwd) {
        openOrangeHRMUrl();
        waitJVM(5000);
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(submit_btn);
        waitJVM(5000);




    }





}
