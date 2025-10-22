import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Queue<Integer> q = new ArrayDeque<>(N);
        for (int i = 1; i <= N; i++) q.add(i);
        boolean discard = true;
        while (q.size() > 1) {
            if (discard) q.poll();        
            else q.add(q.poll());          
            discard = !discard;           
        }

        System.out.println(q.peek());
    }
}
