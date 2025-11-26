package day_01;


import java.util.ArrayList;
import java.util.Scanner;

public class Number_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList= new ArrayList<>();

        int number=sc.nextInt();
        int num=sc.nextInt();

        for (int i = 0; i < number; i++) {
            arrayList.add(sc.nextInt());
        }

        for(int i=0;i<number;i++){
            if(arrayList.get(i)<num){
               System.out.print(arrayList.get(i)+" ");
            }
        }
    }

}
