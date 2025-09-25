
import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nArr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            int result = countByBinarySearch(nArr, target);
            sb.append(result).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    static public int countByBinarySearch(int[] arr, int target) {
        int lower = lowerBound(arr, target, 0, arr.length);
        int upper = upperBound(arr, target, 0, arr.length);
        return upper - lower;
    }

    static public int lowerBound(int[] arr, int target, int left, int right) {
        if (left >= right) return left;
        int mid = (left + right) / 2;
        if (arr[mid] >= target) {
            return lowerBound(arr, target, left, mid);
        } else {
            return lowerBound(arr, target, mid + 1, right);
        }
    }

    static public int upperBound(int[] arr, int target, int left, int right) {
        if (left >= right) return left;
        int mid = (left + right) / 2;
        if (arr[mid] > target) {
            return upperBound(arr, target, left, mid);
        } else {
            return upperBound(arr, target, mid + 1, right);
        }
    }
}
