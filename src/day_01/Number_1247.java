package day_01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Number_1247 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> result = new ArrayList<>();
        while(true){
            try{
            int num = sc.nextInt();
            BigInteger sum = BigInteger.ZERO;

            for(int i=0;i<num;i++){
                sum=sum.add(sc.nextBigInteger());
            }

            if(sum.compareTo(BigInteger.ZERO)>0){
                result.add('+');
            }else if(sum.compareTo(BigInteger.ZERO)<0){
                result.add('-');
            }else{
                result.add('0');
            }

        }catch(Exception e){
            break;}
        }
        for (char c : result) {
            System.out.println(c);

    }

    }
}
