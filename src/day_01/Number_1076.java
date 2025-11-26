package day_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_1076{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        int first = -1, second = -1, multiplier = 0;

        for (int i = 0; i < 3; i++) {
            String color = br.readLine();
            for (int j = 0; j < colors.length; j++) {
                if (color.equals(colors[j])) {
                    if (i == 0) first = j;
                    else if (i == 1) second = j;
                    else multiplier = j;
                    break;
                }
            }
        }

        long value = (first * 10L + second) * (long)Math.pow(10, multiplier);
        System.out.println(value);
    }
}

