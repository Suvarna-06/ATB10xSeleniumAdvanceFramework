package org.example.Pages.PageObjectModel.appvwo;

import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashBoardPage {

    WebDriver driver;
    public DashBoardPage(WebDriver driver){
        this.driver=driver;

    }

    private By userNameOnDashboard = By.cssSelector("[data-qa='lufexuloga']");


    // Page Actions
//    public String loggedInUserName(){
//        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameOnDashboard));
//        return driver.findElement(userNameOnDashboard).getText();
//
//    }


    public String loggedInUserName(){
        WaitHelpers.waitJVM(10000);
        return driver.findElement(userNameOnDashboard).getText();
    }



}
