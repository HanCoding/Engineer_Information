package algorithm;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = new int[3];

        Scanner scn = new Scanner(System.in);

        for (int x = 0; x < array.length; x++) {
            System.out.print("숫자 입력 : ");
            int number = scn.nextInt();

            array[x] = number;
        }

        System.out.print("입력한 숫자는");
        for (int x = 0; x < array.length; x++) {
            System.out.print(" " + array[x] + " ");
        }
        System.out.print("입니다.");

        System.out.println();
        System.out.print("정렬하시겠습니까?(y/n)");
        String answer = scn.next();

        if(answer.equals("y")) {

            for (int x = 0; x < array.length - 1; x++) {
                for (int y = x + 1; y < array.length; y++) {
                    int temp = 0;
                    if (array[x] > array[y]) {
                        temp = array[x];
                        array[x] = array[y];
                        array[y] = temp;
                    }
                }
            }

            System.out.print("정렬한 숫자는");
            for (int x = 0; x < array.length; x++) {
                System.out.print(" " + array[x] + " ");
            }
            System.out.print("입니다.");

        }else {
            System.out.println("프로그램을 종료합니다.");
        }

    }
}
