package algorithm;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 1; // 첫번째 항
        int b = 1; // 두번째 항
        int y = 2; // 피보나치 합이 담길 변수

        int n = 2; // 몇 번째 항까지 실행되었는지 담아줄 변수


        while(true) {

            // a + b가 저장될 변수
            int c = a + b;

            // 총 합에 c를 더함
            y = y + c;

            // 항의
            n = n + 1;

            if (n < 5) {
                a = b;
                b = c;
            }else {
                break;
            }
        }

        System.out.println(y);

    }
}
