package Java_programs;

public class max_twonums {
    public static void main(String[] args) {

        int list[] = {15, 24, 43, 17, 55};
        max_twonums max = new max_twonums();

        int maxone = 0;
        int maxtwo = 0;


        for ( int i =0; i< list.length;i++) {
            if (maxone < list[i]) {
                maxtwo = maxone;
                maxone = list[i];
            } else if (maxtwo < list[i]) {
                maxtwo = list[i];

            }
        }
            System.out.println("First max no: " + maxone);
            System.out.println("Second max no: " + maxtwo);

        }

        }


