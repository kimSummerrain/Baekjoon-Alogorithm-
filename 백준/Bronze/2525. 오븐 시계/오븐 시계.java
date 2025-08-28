import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int H=sc.nextInt();
        int M=sc.nextInt();
        int S=sc.nextInt();

        if(M+S>=60){
            H+=(S+M)/60;
            M=((S+M)%60);
        }else{
            M+=S;
        }
        if(H>=24){
            H-=24;
        }
        System.out.print(H+" "+M);

    }
}