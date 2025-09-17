import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int number = 666;
		int count = 1;
		while(count != N) {
			number++;
			if(String.valueOf(number).contains("666")) {
				count++;
			}
		}
		System.out.println(number);
	}
}