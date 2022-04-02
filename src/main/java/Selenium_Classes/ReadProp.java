package Selenium_Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "TestDataSup" + File.separator + "config.properties";

        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        String val= prop.getProperty("url");
        System.out.println(val);


    }
}
