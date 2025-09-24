import java.util.*;
import java.util.stream.Collectors;

/*
1. 이분탐색법 조건 찾는 대상이 되는 리스트는 정렬이 되어있어야함
2. 찾는 수와 끝 수를 비교해야함
3. 2개의 포인터가 필요함
3. middle,end,start가 필요함
3. 끝남 그러면
 */
public class Main{
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
            System.out.println(result);
        }
    }

    static public int binarySearch(List<Integer> nList, int target, int start, int end) {
        if (start > end) {
            return 0;
        }
        int mid = (start + end) / 2;

        if (nList.get(mid) == target) {
            return 1;
        } else if (nList.get(mid) > target) {
            return binarySearch(nList, target, start, mid - 1);
        } else {
            return binarySearch(nList, target, mid + 1, end);
        }
    }

}
