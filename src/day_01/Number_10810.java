package day_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_10810 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(0);
        }
        for(int i=0;i<m;i++){
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            int c=sc.nextInt();
            if(a!=b){
            for(int j=a;j<=b;j++){
                list.set(j,c);
                }
            }else{
                list.set(a,c);
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");

        }
    }
}
