package day_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> List=new ArrayList<>();

        while(true){
            String name = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();

            if(name.equals("#") && age==0 && weight==0){
                break;
            } else if(age>17 || weight>=80){
                List.add(name+" "+"Senior");
            }else{
                List.add(name+" "+"Junior");
            }

        }

        for(String s:List){
            System.out.println(s);
        }
    }
}
