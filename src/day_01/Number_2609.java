package day_01;

import java.util.Scanner;

public class Number_2609 {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcdValue = gcd(a, b);
        int lcmValue = lcm(a, b);

        System.out.println(gcdValue);
        System.out.println(lcmValue);
    }
}
