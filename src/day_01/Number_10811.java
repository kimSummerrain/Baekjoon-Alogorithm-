package day_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Number_10811 {
    public static void main(String[] args) {
        //5개 만큼 arraylist
        //반복분으로 i=시작점으로 하고 j를 끝점으로할 거임
        //ij의 관계성으로 반복문 풀 수 있음,
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int num = sc.nextInt();
        int count = sc.nextInt();
        //리스트 만들기
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }
        for (int i = 0; i < count; i++) {
            int fir = sc.nextInt();
            int sec = sc.nextInt();
            //리스트를 sub라는 리스트에 얕은 복사함
            //그래서 sub라는 리스트를 바꾸면 list의 값도 바뀜
            List<Integer> sub = list.subList(fir - 1, sec);
            Collections.reverse(sub);
        }

        for (int x : list) {
            System.out.print(x+" ");
        }
        }

    }

