import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Main{
        public static void main(String[] args) throws IOException {
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            //문자 대문자로 받아버려
            String word=br.readLine().toUpperCase();

            // 숫자 count셀건데 hashmap이 찾는데 시간 봅복잡도 1임
            Map<Character,Integer> freqMap = new HashMap<>();
            for (char c:word.toCharArray()) {
                freqMap.put(c,freqMap.getOrDefault(c, 0) + 1);
            }

            // 가장 많이 사용된 알파벳 찾는 부분
            int maxCount =Collections.max(freqMap.values());

            // getValue로 값들 최대 찾을건데 map검색해볼듯
            List<Character> maxChars = freqMap.entrySet().stream()
                    .filter(e ->e.getValue()==maxCount)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            if (maxChars.size()>1) {
                System.out.println("?");
            } else {
                System.out.println(maxChars.get(0));
            }
        }
    }

