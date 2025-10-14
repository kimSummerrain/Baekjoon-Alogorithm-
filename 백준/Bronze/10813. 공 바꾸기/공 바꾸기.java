import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = i + 1;

        for (int t = 0; t < m; t++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int num : arr) System.out.print(num + " ");
        sc.close();
    }
}