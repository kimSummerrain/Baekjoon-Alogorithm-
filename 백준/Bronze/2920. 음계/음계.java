import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean asc = true;
        boolean dsc = true;

        for (int i = 0; i < 7; i++) {
            if (arr[i]<arr[i+1]) dsc = false;
            if (arr[i]>arr[i+1]) asc = false;
        }

        if (asc) System.out.print("ascending");
        else if (dsc) System.out.print("descending");
        else System.out.print("mixed");
    }
}