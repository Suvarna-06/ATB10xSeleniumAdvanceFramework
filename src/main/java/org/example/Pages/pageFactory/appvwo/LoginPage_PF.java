package org.example.Pages.pageFactory.appvwo;

import org.example.base.CommonToAllPage;
import org.example.utils.PropertiesReader;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF extends CommonToAllPage {

    WebDriver driver;

    public LoginPage_PF(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="login-username")
    private WebElement username;

    @FindBy(name ="password")
    private WebElement password;

    @FindBy(id = "js-login-btn")
    private WebElement signButton;

    @FindBy(css = "#js-notification-box-msg")
    private WebElement error_message;

    //    @FindBy(id = "js-login-btn")
//    private List<WebElement> list_element;

//    @FindBy(xpath = "js-login-btn")
//    private WebElement signButton;

//    @FindBy(css = "#js-notification-box-msg")
//    private WebElement error_message;

    //  Multiple Locator Types | OR condition (any criteria can match)
//    @FindAll(
//            {
//                    @FindBy(how = How.ID, using = "login-username"),
//                    @FindBy(name = "username")
//            }
//    )
//    private WebElement input_element;



    // WebElement username = driver.findElement(By.username("login-username");


    // Page Actions
    public String loginToVWOCreds() {
        enterInput(username, PropertiesReader.readKey("invalid_username"));
        enterInput(password, PropertiesReader.readKey("invalid_password"));
        clickElement(signButton);
        WaitHelpers.waitJVM(5000);
        return getText(error_message);
    }
}
