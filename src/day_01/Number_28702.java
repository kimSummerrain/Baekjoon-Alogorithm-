package day_01;
import java.io.*;

public class Number_28702 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = 0;
            for (int i = 0; i < 3; i++) {
                String str = br.readLine();
                if (Character.isDigit(str.charAt(0))) num = Integer.parseInt(str) + (3 - i);
            }
            if (num % 15 == 0) System.out.println("FizzBuzz");
            else if (num % 3 == 0) System.out.println("Fizz");
            else if (num % 5 == 0) System.out.println("Buzz");
            else System.out.println(num);
        }
    }


