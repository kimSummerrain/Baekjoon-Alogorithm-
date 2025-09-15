
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr=new int[] {0,0,0,0,0,0,0,0,0,0};

        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        String result=Integer.toString(A*B*C);

        for(int i=0;i<result.length();i++){
            arr[Integer.parseInt(result.charAt(i)+"")]+=1;
            
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);

        }

    }
}
