package day_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            String number = sc.nextLine();
            int count=0;
            if(number.equals("0")){
                break;

            }else{
                for(char ch:number.toCharArray()){
                    if(ch=='0'){
                        count+=4;
                    }else if(ch=='1'){
                        count+=2;
                    }else{
                        count+=3;
                    }
                }
                list.add(count+number.length()+1);
            }

        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
