import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[][] board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = (s.charAt(j) == 'W');
            }
        }

        int answer = 64;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {

                int count = 0;

                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        boolean expected = ((x + y) % 2 == 0);
                        if (board[x][y] != expected) count++;
                    }
                }

                count = Math.min(count, 64 - count);
                answer = Math.min(answer, count);
            }
        }

        System.out.println(answer);
    }
}
