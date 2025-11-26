package day_01;
import java.io.*;
import java.util.*;
public class Number_10845 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());

            Queue<Integer> queue = new ArrayDeque<>(); // LinkedList보다 약간 더 빠름
            int last = 0;

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String cmd = st.nextToken();

                switch (cmd) {
                    case "push":
                        last = Integer.parseInt(st.nextToken());
                        queue.offer(last);
                        break;
                    case "pop":
                        sb.append(queue.isEmpty() ? -1 : queue.poll()).append('\n');
                        break;
                    case "size":
                        sb.append(queue.size()).append('\n');
                        break;
                    case "empty":
                        sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                        break;
                    case "front":
                        sb.append(queue.isEmpty() ? -1 : queue.peek()).append('\n');
                        break;
                    case "back":
                        sb.append(queue.isEmpty() ? -1 : last).append('\n');
                        break;
                }
            }

            System.out.print(sb);
        }

}
