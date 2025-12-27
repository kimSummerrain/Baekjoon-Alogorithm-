import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[8001];

        int sum = 0;
        int min = 4001;
        int max = -4001;

        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(br.readLine());
            sum += v;
            cnt[v + 4000]++;

            if (v < min) min = v;
            if (v > max) max = v;
        }

        int median = 0;
        int mode = 0;
        int modeMax = 0;

        int acc = 0;
        boolean medianFound = false;
        boolean secondModePick = false;

        int target = (N + 1) / 2;

        for (int i = min + 4000; i <= max + 4000; i++) {
            int f = cnt[i];
            if (f == 0) continue;

            acc += f;
            if (!medianFound && acc >= target) {
                median = i - 4000;
                medianFound = true;
            }

            if (f > modeMax) {
                modeMax = f;
                mode = i - 4000;
                secondModePick = true;
            } else if (f == modeMax && secondModePick) {
                mode = i - 4000;
                secondModePick = false;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append((int) Math.round((double) sum / N)).append('\n');
        sb.append(median).append('\n');
        sb.append(mode).append('\n');
        sb.append(max - min);

        System.out.print(sb);
    }
}
