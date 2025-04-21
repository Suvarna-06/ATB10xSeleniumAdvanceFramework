package org.example.tests.pom.POM.vwo;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.Pages.PageObjectModel.appvwo.Normal_POM.DashBoardPage;
import org.example.Pages.PageObjectModel.appvwo.Normal_POM.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;




public class TestVWOLogin_01_NormalScript {

    // Come from allure report


    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception {

        // Driver Manager Code - 1
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions);

        // Page Class Code (POM Code) - 2
        LoginPage loginPage  = new LoginPage(driver);
        String error_msg = loginPage.loginToVWOLoginInvalidCreds("admin@gmail.com","1234");

        // Assertions - 3
        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");

        driver.quit();


    }

    @Owner("SANDHYA")
    @Description("Verify that valid creds dashboard page is loaded")
    @Test
    public void testLoginPositiveVWO(){

        // Driver Code
        WebDriver driver = new EdgeDriver();

       //PAge Object Code
        LoginPage loginPage_VWO = new LoginPage(driver);
        loginPage_VWO.loginToVWOLoginInvalidCreds("contact+aug@thetestingacademy.com","TtxkgQ!s$rJBk85");
        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        String usernameLoggedIn = dashBoardPage.loggedInUserName();

        // Assertion Code
        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(usernameLoggedIn,"Aman");
        driver.quit();

    }




}
