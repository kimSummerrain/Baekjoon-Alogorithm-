
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        int target = sc.nextInt();

        second += target;

        minute += second / 60;
        second %= 60;

        hour += minute / 60;
        minute %= 60;

        hour %= 24;

        if(hour>=24){
            hour %= 24;        }
        System.out.printf("%d %d %d", hour, minute, second);
    }
}
