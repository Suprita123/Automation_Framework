package Selenium_Classes;

import java.io.File;
import java.io.IOException;

public class FileRead1 {
    public FileRead1(String path) {
    }

    public static void main(String[] args) throws IOException {
        // C:\Users\supri\IdeaProjects\JavaSelenium8amJan22WkDays\TestDataSup (absolute path) which is not recommended
        // path by programatically

        //String path = System.getProperty("user.dir");
        //System.out.println(path);

        String path = System.getProperty("user.dir") + File.separator + "TestDataSup" + File.separator + "config.properties";
        //String path1 = System.getProperty("user.dir") + File.separator + "TestDataSup" + File.separator + "demofile1.txt";

        File file = new File(path);
        if (file.exists()) {
            System.out.println("file already exist");

        } else {

            file.createNewFile();
        }
    }
}
