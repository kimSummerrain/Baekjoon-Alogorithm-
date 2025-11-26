package day_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Number_10816_Timeout_V {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> nList= Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.sort(nList);

        int m = sc.nextInt();
        sc.nextLine();
        List<Integer> mList= Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int m_number : mList) {
            int result = binarySearch(nList, m_number, 0, nList.size() - 1);
            System.out.printf("%d ",result);
        }
    }

    static public int binarySearch(List<Integer> nList, int target, int start, int end) {
        if (start > end) {
            return 0;
        }
        int mid = (start + end) / 2;

        if (nList.get(mid) == target) {
            return 1
                    +searchSide(nList,target,mid-1,-1)
                    +searchSide(nList,target,mid+1,+1);
        } else if (nList.get(mid) > target) {
            return binarySearch(nList, target, start, mid - 1);
        } else {
            return binarySearch(nList, target, mid + 1, end);
        }
    }

    static public int searchSide(List<Integer> nList, int target, int idx, int dir) {
        if (idx < 0 || idx >= nList.size()) {
            return 0;
        }
        if (nList.get(idx) != target) {
            return 0;
        }
        return 1 + searchSide(nList, target, idx + dir, dir);
    }
}


