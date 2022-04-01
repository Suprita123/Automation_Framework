package Java_programs;

public class Reverse_Number {
    public static void main(String[] args) {
        int num1 = 76543;
        Reverse_Number reverse = new Reverse_Number();
        System.out.println("Input number: " + num1);

        int Reverse=0;
        while (num1!=0) {
            Reverse = (Reverse * 10) + (num1 % 10);
            num1 = num1 / 10;
        }

         System.out.println("Reverse number: "+Reverse);
    }
}