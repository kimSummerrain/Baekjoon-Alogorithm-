import java.util.Scanner;

public class Main{
    static int N, M;
    static int[] arr;
    static int[] output;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        output = new int[M];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        if (M == 1) {
            for (int i = 0; i < N; i++) {
                System.out.println(arr[i]);
            }
        } else {
            comb(0, 0); 
        }
    }
    static void comb(int depth, int start) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(output[i] + (i + 1 == M ? "" : " "));
            }
            System.out.println();
            return;
        }
        for (int i = start; i < N; i++) {
            output[depth] = arr[i];
            comb(depth + 1, i + 1);
        }
    }
}