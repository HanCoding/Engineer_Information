package algorithm;

import java.util.Scanner;

// 두 수를 입력 받아 최대공약수와 최소공배수를 구하는 알고리즘

public class GongyaksuGongbaesu {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int n = scn.nextInt();;
        System.out.print("숫자 입력 : ");
        int m = scn.nextInt();

        int big = 0;
        int small = 0;

        int[] array = new int[2];

        while (true) {
            if (n > m) {
                big = n;
                small = m;
            }else {
                big = m;
                small = n;
            }

            int mok = big / small;
            int nmg = big - mok * small;

            int gcm = 0;
            int lcm = 0;

            if (nmg == 0) {
                gcm = small;
                lcm = n * m / gcm;
                array[0] = gcm;
                array[1] = lcm;
                break;
            }else {
                big = small;
                small = nmg;
            }
        }

        System.out.print("최소공배수 : " + array[0] + " 최대공약수 : " + array[1]);

    }
}
