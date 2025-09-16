

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> result=new ArrayList<>();
        while(true){

            int a = (int)Math.pow(sc.nextInt(), 2);
            int b = (int)Math.pow(sc.nextInt(), 2);
            int c = (int)Math.pow(sc.nextInt(), 2);

            if(a==0 && b==0 && c==0){
                break;
            }

            int[] arr=new int[]{a,b,c};
            int max=arr[0];
            for(int i=1;i<3;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            int number=0;
            for(int i=0;i<3;i++){
                if(arr[i]!=max){
                    number+=arr[i];
                }
            }
            if(number==max){
                result.add("right");
            }else{
                result.add("wrong");
            }

        }
        for(String s:result){
            System.out.println(s);
        }
    }

}
