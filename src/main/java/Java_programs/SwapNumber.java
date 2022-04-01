package Java_programs;

public class SwapNumber {
    public static void main(String[] args) {

        int X = 20;
        int Y = 10;
        System.out.println("Numbers before swapping");
        System.out.println("numX value: "+X);
        System.out.println("numY value: "+Y);

        System.out.println("*********");

        X = X+Y;
        Y = X-Y;
        X = X-Y;
        System.out.println("Numbers after swapping");
        System.out.println("numX value: "+X);
        System.out.println("numY value: "+Y);
    }
}
