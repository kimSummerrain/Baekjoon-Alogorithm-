import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger P = sc.nextBigInteger();
        BigInteger K = sc.nextBigInteger();
        BigInteger i = BigInteger.ONE;

        while (true) {
            if (i.compareTo(K) >= 0) {
                System.out.println("GOOD");
                break;
            }

            i = i.add(BigInteger.ONE);

            if (P.remainder(i).compareTo(BigInteger.ZERO) == 0 && i.compareTo(K) < 0) {
                System.out.println("BAD " + i);
                break;
            }
        }
    }
}
