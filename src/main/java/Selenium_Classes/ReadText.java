package Selenium_Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {
    public static void main(String[] args) throws IOException {
        // C:\Users\supri\IdeaProjects\JavaSelenium8amJan22WkDays\TestDataSup (absolute path) which is not recommended
        // path by programatically

        //String path = System.getProperty("user.dir");
        //System.out.println(path);

        String path = System.getProperty("user.dir") + File.separator + "TestDataSup" + File.separator + "demofile.txt";
        String path1 = System.getProperty("user.dir") + File.separator + "TestDataSup" + File.separator + "demofile1.txt";
        //File file = new File(path);
        //using buffer reader as it reads fastly not by binary

        BufferedReader br = new BufferedReader(new FileReader(path1));
        String str = br.readLine();
        System.out.println(br.readLine());

        //for(int i=0;i<=6;i++) {
        // System.out.println(br.readLine());


        String x = "";
        while ((x = br.readLine()) != null) {
            System.out.println(x);
        }
    }



}
