package org.example.Pages.PageObjectModel.appvwo.Normal_POM;

import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
