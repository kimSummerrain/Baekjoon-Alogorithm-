import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int X = in.nextInt();

        int diag = 1;
        int sum = 0;

        while (X > sum + diag) {
            sum += diag;
            diag++;
        }

        int offset = X - sum;
        int numerator, denominator;

        if (diag % 2 == 1) { 
            numerator = diag - (offset - 1);
            denominator = offset;
        } else {
            numerator = offset;
            denominator = diag - (offset - 1);
        }

        System.out.println(numerator + "/" + denominator);
    }
}
