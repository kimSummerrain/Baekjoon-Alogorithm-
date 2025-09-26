import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                count+=1;
            }else{
                break;
            }
        }
        if(count==str.length()){
            System.out.print(1);
        }else{
            System.out.print(0);
        }

    }
}