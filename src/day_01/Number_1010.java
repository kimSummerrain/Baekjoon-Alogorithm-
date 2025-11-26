package day_01;

import java.util.*;

public class Number_1010{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(comb(M, N));
        }
        sc.close();
    }

    static long comb(int n, int r) {
        if (r > n - r) r = n - r;
        long result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }
}