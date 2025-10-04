import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] score = new double[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for (int i=0; i<n;i++) {
            score[i] = Double.parseDouble(st.nextToken());
        }
        double max = Arrays.stream(score).max().getAsDouble();
        double avg = Arrays.stream(score)
                           .map(s ->(s/max)*100)
                           .average()
                           .orElse(0.0);

        System.out.println(avg);
    }
}