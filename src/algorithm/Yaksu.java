package algorithm;

import java.util.Scanner;

public class Yaksu {

    public static void main(String[] args) {

        // 양의 정수를 입력 받아 약수를 구해 출력
        // 배열 array는 약수를 저장할 배열
        // b는 입력 받은 수
        // c : 1부터 b까지의 수
        // d 약수가 저장될 배열의 위치(첨자)

        int[] array = new int[100];

        Scanner scn = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int b = scn.nextInt();

        int c = 0; int d = 0;

        while(true) {
            c = c + 1;

            if (c <= b) {
                if (b % c == 0) {
                    d = d + 1;
                    array[d] = c;
                }
            }else {
                for (int x = 1; x <= d; x++) {
                    System.out.println(array[x]);
                }
                break;
            }
        }



    }
}
