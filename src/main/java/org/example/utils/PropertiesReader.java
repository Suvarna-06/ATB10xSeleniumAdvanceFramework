package org.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    // Read the file of data.properties and based on key it will give the Value

    public static String readKey(String key){

        // Read a file
        Properties p = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/data.properties");
             p= new Properties();
            p.load(fileInputStream);
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return  p.getProperty(key);


    }


}
