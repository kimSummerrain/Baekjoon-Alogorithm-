
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //3키로,5키로 봉지있음
        //정확히 특정 키로 못 채운다? 그럼 -1
        //그럼 일단 큰거로하고 작은 거로
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        while (n >= 0) {
            if (n % 5 == 0) {
                count += n / 5;
                System.out.println(count);
                return;
            }
            n -= 3;
            count++;
        }
        System.out.println(-1);
    }
}
