package org.example.driver;

import org.example.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {

    // It is common to all
    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    // When we want to start the browser
    public static void init(){
        // browser -? Chrome, firefox,edge which one?

        String browser = PropertiesReader.readKey("browser");
        browser = browser.toLowerCase();

        switch (browser){
            case "edge":
                EdgeOptions edgeOptions= new EdgeOptions();
                edgeOptions.addArguments("--start-maximized");
                edgeOptions.addArguments("--guest");
                driver = new EdgeDriver(edgeOptions);
                break;
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                System.out.println("Not browser Supported!!!");

        }





    }

    //When we want to close the browser
    public static void down(){

        if (getDriver()!=null){
            driver.quit();
            driver= null;
        }
    }





}
