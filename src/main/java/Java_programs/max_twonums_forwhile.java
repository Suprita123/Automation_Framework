package Java_programs;

public class max_twonums_forwhile {
    public static void main(String[] args) {

        int nums[] = {15, 24, 43, 17, 55};
       // max_twonums_forwhile max = new max_twonums_forwhile();

        int maxone = 0;
        int maxtwo = 0;


        for ( int i : nums) {
            if (maxone < i) {
                maxtwo = maxone;
                maxone = i;
            } else if (maxtwo < i) {
                maxtwo = i;

            }
        }
            System.out.println("First max no: " + maxone);
            System.out.println("Second max no: " + maxtwo);

        }

        }


