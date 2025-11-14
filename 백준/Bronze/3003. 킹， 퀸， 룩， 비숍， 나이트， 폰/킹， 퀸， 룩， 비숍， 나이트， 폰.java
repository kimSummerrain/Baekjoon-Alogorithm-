
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] correct = {1, 1, 2, 2, 2, 8};
        int[] diff = new int[6];

        for (int i = 0; i < 6; i++) {
            int now = sc.nextInt();
            diff[i] = correct[i] - now;
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(diff[i]);
            if (i < 5) System.out.print(" ");
        }
    }
}
