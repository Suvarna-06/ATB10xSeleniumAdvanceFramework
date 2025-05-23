package org.example.tests.pom.POM.vwo;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.assertj.core.api.Assertions;
import org.example.Pages.PageObjectModel.appvwo.Normal_POM.LoginPage;
import org.example.Pages.PageObjectModel.appvwo.improved_POM.DashBoardPage;
import org.example.base.CommonToAllTest;
import org.example.driver.DriverManager;
import org.example.utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVWOLogin_04_PropertyReader_DriverManager_POM_CommonToAll extends CommonToAllTest {

    @Description("TC#1- Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception {



        // Page Class Code (POM Code) -2
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        String error_message = loginPage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));

        // Assertion - 3
        assertThat(error_message).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_message,PropertiesReader.readKey("error_message"));




    }

    @Owner("SANDHYA")
    @Description("TC#2-Verify that valid creds dashboard page is loaded")
    @Test
    public void testLoginPositiveVWO(){



        LoginPage loginPage_VWO = new LoginPage(DriverManager.getDriver());
        loginPage_VWO.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        DashBoardPage dashBoardPage = new DashBoardPage(DriverManager.getDriver());
        String usernameLoggedIn = dashBoardPage.loggedInUserName();

        // Assertion Code
        Assertions.assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(usernameLoggedIn,PropertiesReader.readKey("expected_username"));

    }











}
