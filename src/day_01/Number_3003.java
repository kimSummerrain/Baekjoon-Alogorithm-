package day_01;

import java.util.Scanner;

public class Number_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정답 개수
        int[] correct = {1, 1, 2, 2, 2, 8};
        int[] diff = new int[6];

        // 현재 가지고 있는 말 입력
        for (int i = 0; i < 6; i++) {
            int now = sc.nextInt();
            diff[i] = correct[i] - now;
        }

        // 결과 출력
        for (int i = 0; i < 6; i++) {
            System.out.print(diff[i]);
            if (i < 5) System.out.print(" ");
        }
    }
}
