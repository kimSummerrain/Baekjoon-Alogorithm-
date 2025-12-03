import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            int tree = 1;

            if (N == 0) break;
            for (int i = 0; i < 2 * N; i++) {
                int M = sc.nextInt();
                if (i % 2 == 0) {
                    tree *= M;
                } else {
                    tree -= M;
                }
            }
            System.out.println(tree);
        }
    }
}
