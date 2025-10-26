import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        final int MOD = 1234567891;
        final int R = 31;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long result = 0;
        long rPow = 1;

        for (int i = 0; i < L; i++) {
            int value = str.charAt(i) - 'a' + 1;
            result = (result + value * rPow) % MOD;
            rPow = (rPow * R) % MOD;
        }
        System.out.println(result);
    }
}