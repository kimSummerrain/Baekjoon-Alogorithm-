import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int S = 0;
        int M = Integer.parseInt(br.readLine());

        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "add":
                    S |= (1 << Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    S &= ~(1 << Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    sb.append((S & (1<<Integer.parseInt(st.nextToken()))) != 0 ?1:0).append('\n');
                    break;
                case "toggle":
                    S ^= (1 << Integer.parseInt(st.nextToken()));
                    break;
                case "all":
                    S = (1 << 21) - 1;
                    break;
                case "empty":
                    S = 0;
                    break;
            }
        }
        System.out.print(sb);
    }
}