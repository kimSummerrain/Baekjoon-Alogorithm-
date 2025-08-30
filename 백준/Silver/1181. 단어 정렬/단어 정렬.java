
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);
        list.sort(Comparator
                .comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder()));

        StringBuilder out = new StringBuilder();
        for (String s : list) out.append(s).append('\n');
        System.out.print(out);
    }
}