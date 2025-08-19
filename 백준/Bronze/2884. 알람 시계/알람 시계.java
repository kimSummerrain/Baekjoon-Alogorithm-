import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        String[] strNumbers=input.split(" ");
        int[] numbers=new int[strNumbers.length];

        for (int i=0;i<strNumbers.length;i++){
            numbers[i]=Integer.parseInt(strNumbers[i]);
        }

        int hour=numbers[0];
        int minute=numbers[1];



        if (minute<45){
            if(hour==0){
                hour=24;
            }
            
            minute=15+minute;
            hour-=1;
        }else{
            minute-=45;
        }

        System.out.printf("%d %d",hour,minute);


    }

}
