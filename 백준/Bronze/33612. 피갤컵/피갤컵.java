
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int number=Integer.parseInt(br.readLine());

        if(number==1){
            System.out.print("2024 8");
        }else {
            number=8+(number-1)*7;
            int year=2024+number/12;
            int month=number%12;
            if(month==0){
                month=12;
                year-=1;
            }
            System.out.printf("%d %d",year,month);
        }
        }

    }

