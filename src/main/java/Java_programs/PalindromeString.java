package Java_programs;

import java.util.Locale;

public class PalindromeString {
    public static void main(String[] args) {

        String name = "Nayan";
        boolean flag = true;

        //to make string lower case
        name = name.toLowerCase();

        //iterate the string backward and forward, compare one at a time
        //till middle of the string is reached

        for(int i=0; i<= name.length()/2;i++ ){
            if(name.charAt(i)!= name.charAt(name.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Its a Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}
