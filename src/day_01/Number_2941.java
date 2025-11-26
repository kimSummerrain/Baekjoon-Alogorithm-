package day_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Number_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String word=br.readLine();

        List<String> arrs= Arrays.asList("c=","c-","dz=",
                "d-","lj","nj","s=","z=");
        String replaced = arrs.stream()
                .reduce(word,(w,pat)->w.replace(pat,"*"))
;
        System.out.println(replaced.length());




    }
}
