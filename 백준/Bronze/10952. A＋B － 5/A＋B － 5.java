
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList1= new ArrayList<>();
        while (true) {
            int a=sc.nextInt();
            int b=sc.nextInt();


            if(a==0 && b==0){
                break;
            }else{
                arrayList1.add(a+b);

            }

        }
        for(int i=0; i< arrayList1.size();i++){
            System.out.println(arrayList1.get(i));
        }
    }
}
