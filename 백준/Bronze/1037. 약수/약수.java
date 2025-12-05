import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (T-- > 0) {
            int n = in.nextInt();
            max = Math.max(max, n);
            min = Math.min(min, n);
        }

        System.out.println((long) max * min);
    }
}
