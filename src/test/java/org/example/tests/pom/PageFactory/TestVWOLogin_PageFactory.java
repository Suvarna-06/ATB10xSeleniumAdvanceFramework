package org.example.tests.pom.PageFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Pages.pageFactory.appvwo.LoginPage_PF;
import org.example.base.CommonToAllTest;
import org.example.utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.example.driver.DriverManager.getDriver;

public class TestVWOLogin_PageFactory extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_PageFactory.class);


        @Test
        public void testLoginNegativeVWO_PF() {
            logger.info("Starting the Testcases Page Factory");
            getDriver().get(PropertiesReader.readKey("url"));
            LoginPage_PF loginPage_PF = new LoginPage_PF(getDriver());
            String error_msg = loginPage_PF.loginToVWOCreds();
            logger.info("Finished the Testcases Page Factory");
            logger.debug("Finished the Testcases Page Factory");
            logger.error("Finished the Testcases Page Factory");
            logger.fatal("Fatal error - code is dead!");
            Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));
        }
    }


