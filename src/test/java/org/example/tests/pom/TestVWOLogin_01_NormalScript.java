package org.example.tests.pom;

import io.qameta.allure.Description;
import org.example.Pages.PageObjectModel.appvwo.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVWOLogin_01_NormalScript {

    // Come from allure report

    @Description("Verify that with invalid email and invalid password,error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login ()throws Exception{

        // Driver Manager Code - 1
        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);

        // Page Class Code (POM Code) - 2
        LoginPage loginPage = new LoginPage(driver);
        String error_msg =loginPage.LoginToVWOLoginValidCreds("admin@gmail.com","1234");

        // Assertions (assert J) -3
        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg,"Your email,password,IP address or location did not match");

        // close the browser entirely
        driver.quit();



    }






}
