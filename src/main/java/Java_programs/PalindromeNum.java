package Java_programs;

public class PalindromeNum {
    public static void main(String[] args) {

        int num = 9339, reversenum = 0, remainder;
        int originalnum = num;

        while (num != 0) {
            remainder = num%10;
            reversenum = (reversenum* 10) + (remainder);
            num = num/10;

        }
        if (originalnum==reversenum){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
