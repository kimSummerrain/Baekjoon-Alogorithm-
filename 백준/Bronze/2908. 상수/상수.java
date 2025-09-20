

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] n = sc.next().split("");
        String[] m = sc.next().split("");


        for (int i = 2; i >= 0; i--) {
                if(Integer.parseInt(n[i])>Integer.parseInt(m[i])){
                    for (int j = 2; j >= 0; j--){
                        System.out.print(n[j]);
                    }
                    break;

                }else  if(Integer.parseInt(m[i])>Integer.parseInt(n[i])){
                    for (int k = 2; k >= 0; k--){
                        System.out.print(m[k]);
                    }
                    break;
                }
        }



    }
}
