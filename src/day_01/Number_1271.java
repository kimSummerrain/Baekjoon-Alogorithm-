package day_01;

import java.math.BigInteger;
import java.util.Scanner;

public class Number_1271{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력되는 문자열을 BigInteger 객체로 변환하여 저장
        // n과 m 모두 문자열로 입력받아야 함
        BigInteger n = sc.nextBigInteger(); // 돈
        BigInteger m = sc.nextBigInteger(); // 생명체 수

        // 1. 몫 계산: n.divide(m)
        BigInteger share = n.divide(m);

        // 2. 나머지 계산: n.remainder(m)
        BigInteger remainder = n.remainder(m);

        // 결과 출력
        System.out.println(share);
        System.out.println(remainder);

        sc.close();
    }
}