package Selenium_Classes;

public class StringChar {
    public static void main(String[] args) {
        // program on conversion from string to array

        String name = "Suprita";

        char [] n = name.toCharArray() ;

        for (Character Ch : n ){
            System.out.println(Ch);
        }
    }
}

