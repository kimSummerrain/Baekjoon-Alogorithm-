
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String m = sc.next();

        String n_2 ="";
        String m_2 ="";

        for(int i=n.length()-1;i>=0;i--){
            n_2+=n.charAt(i);
            m_2+=m.charAt(i);
        }

        if(Integer.parseInt(n_2)>Integer.parseInt(m_2)){
            System.out.println(n_2);
        }else{
            System.out.println(m_2);
        }


    }
}
