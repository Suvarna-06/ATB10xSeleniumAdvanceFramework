package org.example.Pages.pageFactory.appvwo;

import org.example.base.CommonToAllPage;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage_PF extends CommonToAllPage {

    WebDriver driver;

    // Why constructor created?
    // Answer-> It initialize the webdriver
    public DashBoardPage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css ="[data-qa='lufexuloga']")
    private WebElement userNameOnDashboard ;


    // Page Actions
    public String loggedInUserName() {
        WaitHelpers.visibilityOfElement(userNameOnDashboard);
        return getText(userNameOnDashboard);
    }


}
