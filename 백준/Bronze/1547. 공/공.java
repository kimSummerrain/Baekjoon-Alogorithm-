import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num = 1;

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X == num) {
                num = Y;
            } else if (Y == num) {
                num = X;
            }
        }

        System.out.println(num);
    }
}
