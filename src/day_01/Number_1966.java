package day_01;

import java.io.*;
import java.util.*;

public class Number_1966 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {

            // N, M 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // 큐와 인덱스 리스트 초기화
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> indexQueue = new LinkedList<>();

            // 우선순위 입력
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(priority);
                indexQueue.offer(i); // 인덱스 추적용
            }

            int count = 0;

            // 큐가 빌 때까지 반복
            while (!queue.isEmpty()) {
                int current = queue.peek();
                int currentIdx = indexQueue.peek();

                // 현재 큐에서 최댓값 찾기
                int max = Collections.max(queue);

                if (current == max) { // 출력 가능한 문서라면
                    queue.poll();
                    indexQueue.poll();
                    count++;

                    // 찾고 싶은 문서라면 결과 저장
                    if (currentIdx == M) {
                        sb.append(count).append("\n");
                        break;
                    }

                } else { // 아직 최고 우선순위가 아니라면 뒤로 보냄
                    queue.offer(queue.poll());
                    indexQueue.offer(indexQueue.poll());
                }
            }
        }

        System.out.print(sb.toString());
    }
}
