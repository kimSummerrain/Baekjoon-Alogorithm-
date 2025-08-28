
import java.util.Scanner;

public class Main{
    static int N, M;
    static int[] arr;
    static boolean[] visited;
    static int[] output;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        visited = new boolean[N];
        output = new int[M];

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        if (M == 1) {
            for (int i = 0; i < N; i++) {
                System.out.println(arr[i]);
            }
        } else {
            permutation(0);
        }
    }

    static void permutation(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }
}