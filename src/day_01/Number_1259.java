package day_01;

import java.util.Scanner;

public class Number_1259 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(true){
            String str=sc.nextLine();
            int count=0;
            if(str.equals("0")){
                break;
            }else {
                for(int i=0;i<str.length()/2;i++){
                    if(str.charAt(i)==str.charAt(str.length()-i-1)){
                        count++;
                    }else{
                        System.out.println("no");
                        break;
                    }
                }
                if(count==str.length()/2){
                    System.out.println("yes");
                }

            }

        }

    }
}
