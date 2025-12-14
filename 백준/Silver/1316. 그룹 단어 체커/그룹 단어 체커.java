import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            if (check()) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check() {

        boolean[] visited = new boolean[26];
        int prev = 0;
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (prev != now) {
                if (!visited[now - 'a']) {
                    visited[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
