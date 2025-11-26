package day_01;

import java.util.Arrays;
import java.util.Scanner;

public class Number_11651 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][1] = in.nextInt();
            arr[i][0] = in.nextInt();
        }
        Arrays.sort(arr, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        StringBuilder sb = new StringBuilder();
        for (int[] p : arr) sb.append(p[1]).append(' ').append(p[0]).append('\n');
        System.out.print(sb);
    }
}
