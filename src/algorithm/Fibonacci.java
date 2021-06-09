package algorithm;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int y = 2;

        int n = 2;


        while(true) {
            int c = a + b;
            y = y + c;
            n = n + 1;

            if (n >= 5) {
                break;
            }else {
                a = b;
                b = c;
            }
        }

        System.out.println(y);

    }
}
