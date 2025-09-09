import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            list.add(num1+num2);
        }
        for(int j = 0; j < n; j++){

            System.out.println(list.get(j));
        }
    }
}