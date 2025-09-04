
import java.util.Scanner;

public class Main {

    public static  long StringtoInt(String str){

        long Value=Long.parseLong(str);

        return Value;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String a= sc.nextLine();

        String[] stChange = a.split(" ");

        long result=0;

        for(int i=0; i < stChange.length; i++){
            result+=StringtoInt(stChange[i]);

        }
        System.out.println(result);

        }
    }