import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        n = (n / 100) * 100;
        int f = Integer.parseInt(br.readLine());

        int remainder = n % f;
        int ans = remainder == 0 ? 0 : f - remainder;

        System.out.printf("%02d", ans);
    }
}
