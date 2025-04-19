package org.example.base;

import org.example.utils.PropertiesReader;

import static org.example.driver.DriverManager.getDriver;

public class CommonToAllPage {
    // Empty Constructor

    public CommonToAllPage(){}

    public void openVWOUrl(){
        getDriver().get(PropertiesReader.readKey("url"));
    }





}
