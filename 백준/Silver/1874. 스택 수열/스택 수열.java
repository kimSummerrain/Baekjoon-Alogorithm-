import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] stack = new int[N];
        int idx = 0;
        int current = 0;

        while (N-- > 0) {
            int value = sc.nextInt();

            if (value > current) {
                for (int i = current + 1; i <= value; i++) {
                    stack[idx++] = i;
                    sb.append("+\n");
                }
                current = value;
            } else if (stack[idx - 1] != value) {
                System.out.println("NO");
                return;
            }

            idx--;
            sb.append("-\n");
        }

        System.out.print(sb);
    }
}
