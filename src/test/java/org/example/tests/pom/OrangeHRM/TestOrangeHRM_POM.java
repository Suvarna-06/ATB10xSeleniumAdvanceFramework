package org.example.tests.pom.OrangeHRM;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.Pages.PageObjectModel.orangeHRM.EmployeeListHomePage;
import org.example.Pages.PageObjectModel.orangeHRM.LoginPage_OrangeHRM_POM;
import org.example.base.CommonToAllTest;
import org.example.utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.example.driver.DriverManager.getDriver;

public class TestOrangeHRM_POM extends CommonToAllTest {

    @Owner("Sandhya")
    @Description("Verify that the login yo the OrangeHRM")
    @Test
    public void testLoginPostive(){
        LoginPage_OrangeHRM_POM loginHRMPage = new LoginPage_OrangeHRM_POM(getDriver());
        loginHRMPage.loginToHRMCreds(PropertiesReader.readKey("ohr_username"),PropertiesReader.readKey("ohr_password"));

        EmployeeListHomePage dashbboardPagePom = new EmployeeListHomePage(getDriver());
        String loggedInUserName = dashbboardPagePom.loggedInUserName();

        assertThat(loggedInUserName).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(loggedInUserName, PropertiesReader.readKey("ohr_expected_username"));










    }











}
