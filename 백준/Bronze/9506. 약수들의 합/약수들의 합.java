import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = sc.nextInt();

            if (n == -1) {
                break;
            }

            int sum = 0;
            int[] divisors = new int[n];
            int idx = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    divisors[idx++] = i;
                }
            }

            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i = 0; i < idx; i++) {
                    sb.append(divisors[i]);
                    if (i < idx - 1) sb.append(" + ");
                }
                sb.append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
        }
        System.out.print(sb);
    }
}
